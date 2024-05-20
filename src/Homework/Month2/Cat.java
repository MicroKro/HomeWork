package Homework.Month2;

public class Cat extends Animal {

    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

        public String toString() {
        return super.toString();
    }
    @Override
    public void say() {
        System.out.println("Мяу");
    }
}
