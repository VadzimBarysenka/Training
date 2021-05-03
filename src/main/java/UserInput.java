import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = userInput.nextInt();
        System.out.println("You've entered: " + num);
    }
}
