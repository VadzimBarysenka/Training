import java.util.Arrays;

public class TurnArray {
    public static void main(String[] args) {
        int[][] original = new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {12, 13, 14}, {15, 16, 17}, {18, 19, 20}, {21, 22, 23}};
        int[][] result = turn(original);
        TurnArray.display(result);
    }

    static int[][] turn(int[][] original) {
        int row = original[0].length;
        int col = original.length;
        int[][] result = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = original[j][i];
            }
        }
        return result;
    }

    static void display(int result[][]) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}