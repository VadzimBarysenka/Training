package fileswork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileClass {
    // private static final List<String> EXTENSIONS = Arrays.asList(".log",".json",".txt");
   private List<Path> listOfFiles;
   public FileClass(String path) throws IOException {
    setListFiles(Paths.get(path));
    }

    private void setListFiles(Path path) throws IOException {
        try (Stream<Path> walk = Files.walk(path)) {
           this.listOfFiles = walk.filter(Files::isRegularFile)
                    .collect(Collectors.toList());
        }
    }
    public static void process (String contains, String sort){

        }
    }

