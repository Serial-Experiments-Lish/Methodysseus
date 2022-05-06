import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int numOne = scanner.nextInt();
        System.out.println("Enter another number:");
        int numTwo = scanner.nextInt();

        double divideIt = divide(numOne, numTwo);

        System.out.println(numOne + " / " + numTwo + " = " + divideIt);
    }

    public static double divide(double n1, double n2) { 
        double dividedNums = n1/n2;

        return dividedNums;
    }
}
