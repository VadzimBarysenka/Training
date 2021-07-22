package fileswork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class SortFiles {

    public static void sortAlpha(final File folder) {
        try {
            Files.walk(Paths.get(String.valueOf(folder)))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".log") || path.toString().endsWith(".json") || path.toString().endsWith(".txt"))
                    .sorted(Comparator.comparing(Path::getFileName))
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException("Some Error");
        }
    }

    public static void sortWeihgt(final File folder) {
        try {
            List<File> filesList = Files.walk(Paths.get(String.valueOf(folder)))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".log") || path.toString().endsWith(".json") || path.toString().endsWith(".txt"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            ArrayList<Integer> weights = new ArrayList<>();
            ArrayList<String> filesNames = new ArrayList<>();
            int weight;
            BufferedReader files;

            for (File file : filesList) {
                files = new BufferedReader(new FileReader(file));
                String input;
                while (files.ready()) {
                    input = files.readLine();
                    weight = input.length();
                    weights.add(weight);
                    filesNames.add(file.getAbsolutePath());
                }

                Map<String, Integer> filesAndWeight = combineFilesAndNames(filesNames, weights);
                filesAndWeight.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .forEach(System.out::println);
            }
        } catch (IOException e) {
            throw new RuntimeException("Some Error");
        }
    }

    static Map<String, Integer> combineFilesAndNames(List<String> keys, List<Integer> values) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }
}
