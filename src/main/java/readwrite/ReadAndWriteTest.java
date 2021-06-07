package readwrite;

import array.TurnArray;

public class ReadAndWriteTest {
    public static void main(String args[]) throws Exception {
        int[][] array = ReadFile.readFromFile("test4");
        int[][] turn = TurnArray.turn(array);
        WriteFile.writeToFile("test2", turn);
    }
}

