import java.util.Scanner;

public class Program5 {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division
     * methods all with parameters and use string concatenation methods.
     * (Note: Two static and Two instance methods.)
     */
    //static methods
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + " and " + b + " is : " + result);
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    //instance methods
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }
    public int division(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Please enter first number : ");
        int b = scanner.nextInt();

        addition(a, b);

        int subResult = subtraction(a, b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " + subResult);

        Program5 obj = new Program5();
        obj.multiplication(a, b);

        int divResult = obj.division(a, b);
        System.out.println("The division of " + a + " and " + b + " is : " + divResult);
        // closing the scanner object
        scanner.close();
    }
}
