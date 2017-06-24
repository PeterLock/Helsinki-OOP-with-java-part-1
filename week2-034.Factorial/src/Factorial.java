import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int factorial=1;
        int number;

        System.out.println("Type a number:");
        number = Integer.parseInt(reader.nextLine());

        int  i = 1;
        while(i <= number){

        factorial *= i;
        i++;


        }

        System.out.println("Factorial is: " + factorial);

        reader.close();
    }
}
