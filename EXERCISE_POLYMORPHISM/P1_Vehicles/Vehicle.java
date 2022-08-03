package OOP.EXERCISE_POLYMORPHISM.P1_Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumptionPerKM;


    public Vehicle(double fuelQuantity, double fuelConsumptionPerKM) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKM = fuelConsumptionPerKM;
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


    @Override
    public String toString() {
      return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
