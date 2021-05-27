package readwrite;

import array.TurnArray;
import java.io.*;
import java.util.Scanner;

public class ReadAndWriteTest {
    public static void main(String args[]) throws Exception {
    int[][] array = ReadFile.readFromFile("test");
    WriteFile.writeToFile(array);
    }
}


