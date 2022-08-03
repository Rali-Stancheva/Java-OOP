package OOP.LAB_ENCAPSULATION.Sort_By_Name_And_Age;

public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("%s %s is %d years old.",firstName,lastName,age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
