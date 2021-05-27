package readwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class ReadFile {
    public static int[][] readFromFile(String fileName) throws Exception{
    File file = new File(fileName);
    BufferedReader input = new BufferedReader(new FileReader(file));
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++) {
            String[] st = input.readLine().trim().split(" ");
            for (int j = 0;j < 4; j++) {
                array[i][j] = Integer.parseInt(st[j]);
            }
        }
        return array;
    }
}

