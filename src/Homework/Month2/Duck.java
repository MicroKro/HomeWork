package Homework.Month2;

public class Duck extends Animal{
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    public void say() {
        System.out.println("Кря");
    }
    public void fly () {
        System.out.println("Я лечу");
    }
}


