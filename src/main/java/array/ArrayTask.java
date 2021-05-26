package array;

public class ArrayTask {

        public static void main(String[] args) {
            int[][] a1 = new int[3][7];
            a1[0][0] = 1;
            a1[0][1] = 2;
            a1[0][2] = 3;
            a1[0][3] = 4;
            a1[0][4] = 5;
            a1[0][5] = 6;
            a1[0][6] = 7;
            a1[1][0] = 1;
            a1[1][1] = 1;
            a1[1][2] = 1;
            a1[1][3] = 1;
            a1[1][4] = 1;
            a1[1][5] = 1;
            a1[1][6] = 1;
            a1[2][0] = 2;
            a1[2][1] = 3;
            a1[2][2] = 4;
            a1[2][3] = 5;
            a1[2][4] = 6;
            a1[2][5] = 7;
            a1[2][6] = 8;
            System.out.println("Array before:");
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length; j++) {
                    System.out.print(a1[i][j] + " ");
                }
                System.out.println();
            }
            int[][] a2 = new int[a1.length][a1.length];
            a2[0] = a1[0];
            a1[0] = a1[2];
            a1[2] = a2[0];
            for (int i = 0; i < a2.length; i++) {
                for (int j = 0; j < a2[i].length; j++) {
                }
            }
            System.out.println("Array after:");
            int[][] a3 = new int[a1[0].length][a1.length];
            for (int i = 0; i < a1[0].length; i++) {
                for (int j = a1.length - 1; j >= 0; j--) {
                    a3[i][j] = a1[j][i];
                    System.out.print((a3[i][j]) + " ");
                }
                System.out.println();
            }
        }
    }


