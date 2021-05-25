import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadAndWrite {
    public static void main(String args[]) throws Exception {
        File file = new File("D:\\training\\file.txt");
        Scanner input = new Scanner(file);
        int row = 7;
        int col = 3;
        int[][] myArray = new int[row][col];
        while (input.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = input.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }

        int[][] result = TurnArray.turn(myArray);
        write(result);
    }

    static void write(int[][] result) {
        try (
                PrintStream output = new PrintStream(new File("D:\\training\\file2.txt"));) {
            for (int i = 0; i < result.length; i++) {
                String s = "";
                for (int j = 0; j < result[i].length; j++) {
                    s += result[i][j] + " ";
                }
                output.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


