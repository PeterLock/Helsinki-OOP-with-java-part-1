
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.parseInt(reader.nextLine());

        int sum=0;
        int index =1;

        while(index <= number){

            sum+=index;
            index++;

        }

        System.out.println("Sum is: " + sum);

    }
}
