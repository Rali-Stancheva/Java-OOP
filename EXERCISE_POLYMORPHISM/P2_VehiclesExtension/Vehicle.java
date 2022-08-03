package OOP.EXERCISE_POLYMORPHISM.P2_VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKM;
    protected double tankCapacity;


    public Vehicle(double fuelQuantity, double fuelConsumptionPerKM,double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKM = fuelConsumptionPerKM;
        this.tankCapacity = tankCapacity;
    }

    public String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumptionPerKM;

        if (fuelNeeded > this.fuelQuantity){
          return String.format("%s needs refueling",this.getClass().getSimpleName());
        }

        this.fuelQuantity -= fuelNeeded;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km",this.getClass().getSimpleName(),decimalFormat.format(distance));
    }


    public void refuel(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }

        if (liters > this.tankCapacity - this.fuelQuantity){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
       this.fuelQuantity += liters;
    }


    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionPerKM() {
        return fuelConsumptionPerKM;
    }

    public void setFuelConsumptionPerKM(double fuelConsumptionPerKM) {
        this.fuelConsumptionPerKM = fuelConsumptionPerKM;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString() {
      return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
