package readwrite;

import java.io.PrintStream;

public class WriteFile {

    public static void writeToFile(String fileName, int[][] array) throws Exception {
        PrintStream output = new PrintStream(fileName);
        for (int i = 0; i < array.length; i++) {
            String s = "";
            for (int j = 0; j < array[i].length; j++) {
                s += array[i][j] + " ";
            }
            output.println(s);
        }
    }
}
