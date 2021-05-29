package readwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFile {
    public static int[][] readFromFile(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader input = new BufferedReader(new FileReader(file));
        int row = row("test");
        int col = col("test");
        int[][] myArray = new int[row][col];
        for (int i = 0; i < row && input.ready(); i++) {
            String[] st = input.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                myArray[i][j] = Integer.parseInt(st[j]);
            }
        }
        return myArray;
    }

    static int row(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader input = new BufferedReader(new FileReader("test"));
        int row = 0;
        int col = 0;
        while (input.readLine() != null) {
            row++;
        }
        return row;
    }

    static int col(String fileName) throws Exception {
        File file = new File(fileName);
        BufferedReader input = new BufferedReader(new FileReader("test"));
        int row = 0;
        int col = 0;
        input = new BufferedReader(new FileReader("test"));
        String line = input.readLine();
        String[] strs = line.trim().split(" ");
        col = strs.length;
        return col;
    }
}


