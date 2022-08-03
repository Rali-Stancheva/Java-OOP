package OOP.LAB_EXCEPTIONS_AND_ERROR_HANDLING;

import java.util.Arrays;
import java.util.Scanner;

public class P1_NumberInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int minNum = numbers[0];
        int maxNum = numbers[1];

        System.out.printf("Range: [%d...%d]\n",minNum,maxNum);

        while (true) {
            String input = scan.nextLine();
            try {
                int inputToInteger = Integer.parseInt(input);
                if (inputToInteger >= minNum && inputToInteger <= maxNum) {
                    System.out.printf("Valid number: %d\n",inputToInteger);
                    return;
                }else{
                    System.out.printf("Invalid number: %s\n",input);
                }
            }catch (IllegalArgumentException e){
                System.out.printf("Invalid number: %s\n",input);
            }
        }
    }
}
