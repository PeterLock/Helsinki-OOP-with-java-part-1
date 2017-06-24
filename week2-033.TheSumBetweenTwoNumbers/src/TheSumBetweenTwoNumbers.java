
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int first;
        int last;

        System.out.print("First:");
        first = Integer.parseInt(reader.nextLine());

        System.out.print("Last:");
        last = Integer.parseInt(reader.nextLine());

        int counter = first;
        int total = 0;

        while(counter <= last){

            total += counter;
            counter++;

        }

        System.out.println("The sum is:" + total);
        
    }
}
