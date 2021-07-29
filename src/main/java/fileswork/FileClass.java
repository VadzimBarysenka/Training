package fileswork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileClass {
    private static final List<String> EXTENSIONS = Arrays.asList(".log", ".json", ".txt");
    private List<Path> listOfFiles;

    public FileClass(String path) {
        setListFiles(Paths.get(path));
    }

    private void setListFiles(Path path) {
        try (Stream<Path> walk = Files.walk(path)) {
            this.listOfFiles = walk.filter(Files::isRegularFile)
                    .filter((p -> EXTENSIONS.stream().anyMatch(p.toString()::endsWith)))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("some error for path");
        }
    }

    public void process(String contains, String sort) {
        try {
            if (contains.equals("show")) {
                listOfFiles.forEach(System.out::println);
            }

            if (sort.equals("alpha")) {
                System.out.println("Files sorted alphabetically:");
                listOfFiles.stream()
                        .sorted(Comparator.comparing(Path::getFileName))
                        .forEach(System.out::println);
            }

            if (!contains.isEmpty()) {
                System.out.println("Files that match:");
                BufferedReader files;
                for (Path file : listOfFiles) {
                    files = new BufferedReader(new FileReader(String.valueOf(file)));
                    String input;
                    StringBuilder sb = new StringBuilder();
                    while (files.ready()) {
                        input = files.readLine();
                        sb.append(input).append(" ");
                    }
                    if (sb.toString().contains(contains)) {
                        System.out.print(file.getParent() + "\\");
                        System.out.println(file.getFileName());
                    }
                }
            }

            if (sort.equals("weight")) {
                System.out.println("Files sorted by weight:");
                ArrayList<Integer> weights = new ArrayList<>();
                List<String> filesNames = new ArrayList<>();
                int weight;
                BufferedReader files;

                for (Path file : listOfFiles) {
                    files = new BufferedReader(new FileReader(String.valueOf(file)));
                    String input;
                    while (files.ready()) {
                        input = files.readLine();
                        weight = input.length();
                        weights.add(weight);
                        filesNames.add(file.toString());
                    }
                }

                Map<String, Integer> filesAndWeight = combineFilesAndNames(filesNames, weights);
                filesAndWeight.entrySet().stream().sorted(Map.Entry.comparingByValue())
                        .forEach(k -> System.out.println(k.getKey() + " - " + k.getValue() + " symbols"));
            }

            if (contains.isEmpty() && sort.isEmpty()) {
                System.out.println("List of files in the folder:");
                listOfFiles.forEach(System.out::println);
            }
        } catch (IOException e) {
            throw new RuntimeException("some error");
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


