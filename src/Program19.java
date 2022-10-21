import java.util.Scanner;

/**
        * Write a Java program to convert a given string into lowercase.
        * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        * Output: the quick brown fox jumps over the lazy dog.
        */
public class Program19 {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Program19 t = new Program19();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();
    }
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }

}
