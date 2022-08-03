package OOP.EXERCISE_POLYMORPHISM.P3_WildFarm;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight,String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
  public void eat(Food food) {
        if (food instanceof Vegetable) {
            super.eat(food);
        }else{
           throw new IllegalArgumentException("Mice are not eating that type of food!");
        }
    }
}
