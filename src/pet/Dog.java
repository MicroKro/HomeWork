package pet;

import animal.Animal;
import data.ColorData;

public class Dog extends Animal {

    public Dog(String name, int age, double weight, ColorData color) {
        super(name, age, weight, color);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public void say() {
        System.out.println("Гав");
    }
}