package OOP.LAB_ABSTRACTION.Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season currSeason = Season.valueOf(input[2]);
        DiscountType currType = DiscountType.valueOf(input[3]);

        double finalPrice = PriceCalculator.calculateFinalPrice(pricePerDay,days,currSeason,currType);
        System.out.printf("%.2f",finalPrice);

    }
}
