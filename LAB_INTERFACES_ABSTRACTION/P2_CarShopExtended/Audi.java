package OOP.LAB_INTERFACES_ABSTRACTION.P2_CarShopExtended;

public class Audi extends CarImpl implements Rentable{
    private Integer rentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduces,Integer rentDay,Double pricePerDay) {
        super(model, color, horsePower, countryProduces);
        this.rentDay = rentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.rentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }
}
