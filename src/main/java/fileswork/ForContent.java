package fileswork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ForContent {
    public static void checkContent(final File folder, String search) {
        try {
            List<File> filesList = Files.walk(Paths.get(String.valueOf(folder)))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".log")||path.toString().endsWith(".json")||path.toString().endsWith(".txt"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());


        System.out.println("Files that match:");
        BufferedReader files;
        for (File file : filesList) {
            files = new BufferedReader(new FileReader(file));
            String input;
            StringBuilder sb = new StringBuilder();
            while (files.ready()) {
                input = files.readLine();
                sb.append(input).append(" ");
            }
            if (sb.toString().contains(search)) {
                System.out.println(file.getAbsolutePath());
            }
        }
        } catch (IOException e) {
            throw new RuntimeException("Some Error");
        }
    }
}
