package readwrite;


import java.io.*;


public class ReadAndWrite {
    public static void main(String args[]) throws Exception {
        int row = row("test");
        int col = col("test");
        BufferedReader input = new BufferedReader(new FileReader("test"));
        int[][] myArray = new int[row][col];
        for (int i = 0; i < row && input.ready(); i++) {
            String[] st = input.readLine().split(" ");
            for (int j = 0; j < col; j++) {
                myArray[i][j] = Integer.parseInt(st[j]);
            }
        }
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
