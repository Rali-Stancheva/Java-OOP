package OOP.LAB_EXCEPTIONS_AND_ERROR_HANDLING;

import java.util.Scanner;

public class P2_SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        try {
            int numberToInteger = Integer.parseInt(number);
            if (numberToInteger >= 0) {
                System.out.printf("%.2f\n", Math.sqrt(numberToInteger));
            } else {
                System.out.println("Invalid");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
