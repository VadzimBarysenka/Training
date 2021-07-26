package fileswork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetFiles {
    private static final List<String> EXTENSIONS = Arrays.asList(".log",".json",".txt");
    public static void listFilesForFolder(final File folder) {
        try (Stream<Path> fileList = Files.walk(Paths.get(String.valueOf(folder)))) {
            List<String> result = fileList.filter(Files::isRegularFile)
                    .filter(path -> EXTENSIONS.stream().anyMatch(path::endsWith))
                    .map(Path::toString)
                    .collect(Collectors.toList());
            result.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException("Some Error");
        }
    }
}
