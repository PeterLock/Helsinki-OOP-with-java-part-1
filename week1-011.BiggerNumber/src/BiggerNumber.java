
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);



        int num1;
        int num2;

        int biggerNumber;

        // Implement your program here. Remember to ask the input from user
        System.out.println(":");
        num1 = Integer.parseInt(reader.nextLine());

        System.out.println("20:");
        num2 = Integer.parseInt(reader.nextLine());

        biggerNumber = Math.max(num1, num2);

        System.out.println("The bigger number of the two numbers given was: " + biggerNumber);

        reader.close();
    }
}
