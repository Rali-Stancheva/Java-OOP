package OOP.EXERCISE_ENCAPSULATION.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

    }

    private void setAge(int age) {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double calculateProduct = 0;
        if (age >= 0 && age <= 5) {
            calculateProduct = 2;
        } else if (age >= 6 && age <= 11) {
            calculateProduct = 1;
        } else {
            calculateProduct = 0.75;
        }
        return calculateProduct;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",name,age,productPerDay());
    }


}
