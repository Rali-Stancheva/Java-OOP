package OOP.EXERCISE_INHERITANCE.P6_Animals;

public class Dog extends Animal {

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Woof!";
    }
}
