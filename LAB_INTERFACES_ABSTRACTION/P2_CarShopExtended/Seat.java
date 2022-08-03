package OOP.LAB_INTERFACES_ABSTRACTION.P2_CarShopExtended;

public class Seat extends CarImpl implements  Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduces,Double price) {
        super(model, color, horsePower, countryProduces);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
