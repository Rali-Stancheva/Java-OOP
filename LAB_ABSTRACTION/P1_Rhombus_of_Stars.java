package OOP.LAB_ABSTRACTION;

import java.util.Scanner;

public class P1_Rhombus_of_Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());

        printUpperPart(size);
        printBottomPart(size);
    }

    private static void printBottomPart(int size) {
        for (int start = size - 1; start > 0; start--) {
            for (int j = 0; j < size - start; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < start - 1 ; k++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }

    private static void printUpperPart(int size) {
        for (int start = 1; start <= size; start++) {
            for (int j = 0; j < size - start; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <start - 1 ; k++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
