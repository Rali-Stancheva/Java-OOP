package OOP.LAB_ENCAPSULATION.SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String secondName, int age,double salary) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {
        if (this.age > 30) {
            this.salary = this.salary + this.salary * bonus / 100;
        }else{
            this.salary = this.salary + this.salary * bonus / 200; //(first we / 100, second we / 2)
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", firstName,lastName,salary);
    }
}
