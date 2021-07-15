package fileswork;

import java.io.File;

public class FileReader {

    public static void main(String[] args) {
        final File folder = new File("D:\\test");
       // Scanner userInput = new Scanner(System.in);
       // System.out.println("Enter search:");
       // String search = userInput.nextLine();
         GetFiles.listFilesForFolder(folder);
        //ForContent.checkContent(folder,"some");
    }
}

