package fileswork;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SortFiles {
    public static void main(String[] args) throws IOException {
        final File folder = new File("D:\\test");
        Files.walk(Paths.get(String.valueOf(folder)))
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .sorted()
                .forEach(System.out::println);
    }
}
