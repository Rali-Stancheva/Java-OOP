package OOP.EXERCISE_POLYMORPHISM.P2_VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //създаваме кола
        String[] infoCar = scan.nextLine().split("\\s+");
        Vehicle car = createVehicle(infoCar);

        //създаваме камионче
        infoCar = scan.nextLine().split("\\s+");
        Vehicle truck = createVehicle(infoCar);

        //създаваме бус
        infoCar = scan.nextLine().split("\\s+");
        Vehicle bus = createVehicle(infoCar);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);
        vehicleMap.put("Bus", bus);

        int countCommands = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < countCommands; i++) {
            infoCar = scan.nextLine().split("\\s+");
            String command = infoCar[0];
            String vehicleType = infoCar[1];

            switch (command) {
                case "Drive":
                    double distance = Double.parseDouble(infoCar[2]);
                    Vehicle vehicle = vehicleMap.get(vehicleType);

                    if (vehicle instanceof Bus) {
                       bus.setFuelConsumptionPerKM(bus.getFuelConsumptionPerKM() + 1.4);
                        System.out.println(bus.drive(distance));
                        bus.setFuelConsumptionPerKM(bus.getFuelConsumptionPerKM() - 1.4);
                        continue;
                    }

                    String driveMessage = vehicle.drive(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(infoCar[2]);
                    vehicleMap.get(vehicleType).refuel(fuelAmount);
                    break;
                case "DriveEmpty":
                    double driveEmptyDistance = Double.parseDouble(infoCar[2]);
                    String driveEmptyMessage = bus.drive(driveEmptyDistance);
                    System.out.println(driveEmptyMessage);
                    break;
            }
        }

        vehicleMap.values().forEach(System.out::println);

    }

    private static Vehicle createVehicle(String[] infoCar) {
        String vehicleType = infoCar[0];
        double fuelQuantity = Double.parseDouble(infoCar[1]);
        double fuelConsumption = Double.parseDouble(infoCar[2]);
        double tankCapacity = Double.parseDouble(infoCar[3]);

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantity, fuelConsumption, tankCapacity);
                break;
        }
        return vehicle;
    }
}
