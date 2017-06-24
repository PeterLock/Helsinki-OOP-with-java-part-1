
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String word) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String temp = "";

        int length = word.length()-1;
        int i = 0;

        while(i <= length){
            temp += word.charAt(length-i);
            i++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
