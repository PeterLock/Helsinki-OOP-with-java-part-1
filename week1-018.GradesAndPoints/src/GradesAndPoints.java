
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]:");
        int number = Integer.parseInt(reader.nextLine());

        int grade = 0;

        if (number <= 29) {
            grade = 0;
        }

        if (number >= 30 && number <= 34) {
            grade = 1;
        }

        if (number >= 35 && number <= 39) {
            grade = 2;
        }

        if (number >= 40 && number <= 44) {
            grade = 3;
        }

        if (number >= 45 && number <= 49) {
            grade = 4;
        }

        if (number >= 50 && number <= 60) {
            grade = 5;
        }

        if(grade == 0) {
            System.out.println("failed");
        }
        else{

            System.out.println("Grade: " + grade);

        }

    }
}