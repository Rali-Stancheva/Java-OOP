package OOP.LAB_INTERFACES_ABSTRACTION.P2_CarShopExtended;

public class CarImpl implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduces;

    public CarImpl(String model, String color, Integer horsePower, String countryProduces) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduces = countryProduces;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduces;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires", model, countryProduces, TIRES);
    }
}
