package OOP.EXERCISE_POLYMORPHISM.P3_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %s]"
        ,getAnimalType(),getAnimalName(),this.breed,format.format(getAnimalWeight()),getLivingRegion(),getFoodEaten());
    }
}
