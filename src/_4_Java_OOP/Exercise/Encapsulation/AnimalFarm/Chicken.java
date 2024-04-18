package _4_Java_OOP.Exercise.Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.getAge() <= 5) {
            return 2.00;
        } else if (this.getAge() <= 11) {
            return 1.00;
        }

        return 0.75;
    }

    private void setName(String name) {
        if (name == null || name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Chicken Chichi (age %d) can produce %.2f eggs per day.", this.getAge(), productPerDay());
    }
}
