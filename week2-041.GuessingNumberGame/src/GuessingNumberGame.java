
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        boolean found = false;
        int counter = 1;

        // program your solution here. Do not touch the above lines!

        while(!found){
            System.out.print("Guess a number:");
            int number = Integer.parseInt(reader.nextLine());

            if(number == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                found = true;
            }
            if(number < numberDrawn) System.out.println("The number is greater, guesses made: " + counter);
            if(number > numberDrawn) System.out.println("The number is lesser, guesses made: " + counter);

            counter++;
        }
    reader.close();
    }
    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
