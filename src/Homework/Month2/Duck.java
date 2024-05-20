package Homework.Month2;

public class Duck extends Animal implements Animal.Flying {
    public Duck(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }
    @Override
    public void say() {
        System.out.println("Кря");
        }

}


