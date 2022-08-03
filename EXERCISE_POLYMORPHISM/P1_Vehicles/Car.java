package OOP.EXERCISE_POLYMORPHISM.P1_Vehicles;

public class Car extends Vehicle {
    public static final double FUEL_CONSUMPTION_IN_SUMMER = 0.9;


    public Car(double fuelQuantity, double fuelConsumptionPerKM) {
        super(fuelQuantity, fuelConsumptionPerKM);
        this.fuelConsumptionPerKM  = this.getFuelConsumptionPerKM() + FUEL_CONSUMPTION_IN_SUMMER;
    }
}
