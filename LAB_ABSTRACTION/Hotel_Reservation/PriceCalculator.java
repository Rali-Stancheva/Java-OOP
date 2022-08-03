package OOP.LAB_ABSTRACTION.Hotel_Reservation;

public class PriceCalculator {

    public static double calculateFinalPrice(double pricePerDay, int days, Season season, DiscountType type) {
        double price = pricePerDay * days;
        price = price * season.getMultiplayer();
        price = price * (100 - type.getDiscount()) / 100.0;
        return price;
    }
}
