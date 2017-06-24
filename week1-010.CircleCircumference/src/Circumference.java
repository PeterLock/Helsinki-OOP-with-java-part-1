
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here

        int num;

        System.out.println("Type the radius:");
        num = Integer.parseInt(reader.nextLine());


        System.out.println("Circumference of the circle:" + 2 * Math.PI * num);


    }
}
