import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter amount of numbers:");
        int size = userInput.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter number #" + (i + 1));
            array[i] = userInput.nextInt();
        }
        System.out.print("You've entered: ");
        System.out.print(Arrays.toString(array));
        System.out.println();
    }
}
