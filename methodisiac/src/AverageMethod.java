import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int input1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int input2 = scanner.nextInt();
        System.out.println("Enter another:");
        int input3 = scanner.nextInt();

        sum(input1, input2, input3);
        average(input1, input2, input3);
    }

    public static int sum(int num1, int num2, int num3) {
        int sumOfNums = num1 + num2 + num3;

        return sumOfNums;
    }

    public static double average(int n1, int n2, int n3) {
        double averageOfNums = Double.valueOf(sum(n1, n2, n3) / 3.0);
        System.out.println("The average is: " + averageOfNums);
        return averageOfNums;
    }
}