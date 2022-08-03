package OOP.EXERCISE_POLYMORPHISM.P1_Vehicles;

public class Truck extends Vehicle {
    public static final double FUEL_CONSUMPTION_IN_SUMMER = 1.6;
    public static final double FUEL_LEAK_CORRECTION_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumptionPerKM) {
        super(fuelQuantity, fuelConsumptionPerKM);
        this.fuelConsumptionPerKM = this.getFuelConsumptionPerKM() + FUEL_CONSUMPTION_IN_SUMMER;
    }

    @Override
    public void refuel(double liters) {
        liters *= FUEL_LEAK_CORRECTION_PERCENTAGE;
        super.refuel(liters);
    }
}
