package readwrite;

import array.TurnArray;

import java.io.FileNotFoundException;

public class ReadAndWriteTest {
    public static void main(String[] args) throws Exception {
        int[][] array;
        try {
            array = ReadFile.readFromFile("test");
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("no file found");
        }
        int[][] turn = TurnArray.turn(array);
        WriteFile.writeToFile("test2", turn);
    }
}


