package readwrite;

import array.TurnArray;

public class ReadAndWriteTest {
    public static void main(String[] args) throws Exception {
        int[][] array;
        array = ReadFile.readFromFile("test");
        int[][] turn = TurnArray.turn(array);
        WriteFile.writeToFile("test2", turn);
    }
}


