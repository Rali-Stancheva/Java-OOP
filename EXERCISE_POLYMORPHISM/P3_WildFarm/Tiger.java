package OOP.EXERCISE_POLYMORPHISM.P3_WildFarm;

public class Tiger extends Felime {
private String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
   public void eat(Food food) {
        if (food instanceof Meat) {
          super.eat(food);
        } else if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
    }
}
