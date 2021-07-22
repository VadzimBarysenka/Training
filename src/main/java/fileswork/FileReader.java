package fileswork;

import java.io.File;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) throws IOException {
        String pathFolder = args[0];
        String operation = args[1];
        long time = System.currentTimeMillis();
        final File folder = new File(pathFolder);

        switch (operation) {
            case "show":
                GetFiles.listFilesForFolder(folder);
                break;
            case "search":
                String search = args[2];
                ForContent.checkContent(folder, search);
                break;
            case "sort":
                String how = args[2];
                switch (how) {
                    case "alpha":
                        SortFiles.sortAlpha(folder);
                        break;
                    case "weight":
                        SortFiles.sortWeihgt(folder);
                        break;
                }
                break;
            case "sortWeight":
                SortFiles.sortWeihgt(folder);
                break;
        }
        System.out.println(System.currentTimeMillis() - time + " milliseconds spent for operation");
    }
}

