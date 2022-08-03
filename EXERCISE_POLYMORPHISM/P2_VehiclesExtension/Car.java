package OOP.EXERCISE_POLYMORPHISM.P2_VehiclesExtension;

public class Car extends Vehicle {
    public static final double FUEL_CONSUMPTION_IN_SUMMER = 0.9;


    public Car(double fuelQuantity, double fuelConsumptionPerKM,double tankCapacity) {
        super(fuelQuantity, fuelConsumptionPerKM,tankCapacity);
        this.fuelConsumptionPerKM  = this.getFuelConsumptionPerKM() + FUEL_CONSUMPTION_IN_SUMMER;
    }
}
