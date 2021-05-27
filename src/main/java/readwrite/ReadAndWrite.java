package readwrite;

import array.TurnArray;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadAndWrite {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(new File("D:\\training\\file.txt"));
        int row = 0;
        int col = 0;
        while (input.hasNextLine()) {
            row++;
            Scanner colReader = new Scanner(input.nextLine());
            while (colReader.hasNextInt()) {
                col++;
                colReader.next();
            }
        }
        input = new Scanner(new File("D:\\training\\file.txt"));
        int[][] myArray = new int[row][col];
        while (input.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = input.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        //int[][] result = TurnArray.turn(myArray);
        //TurnArray.display(myArray);
        //write(result);
        //System.out.println(l.length);
    }
}
