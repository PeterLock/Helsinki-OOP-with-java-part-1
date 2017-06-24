import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;

        System.out.print("Type a number:");
        int power = Integer.parseInt(reader.nextLine());

        int i = 0;
        while(i <= power){
            sum += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is: " + sum);

    }
}
