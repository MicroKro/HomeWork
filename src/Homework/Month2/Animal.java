package Homework.Month2;

public class Animal {

    String name;
    int age;
    int weight;
    String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }
    public void drink () {
        System.out.println("Я пью");
    }
    public void eat() {
        System.out.println("Я ем");
    }

    public String getAgePlural() {
        if (this.age == 1) {
            return "год";
        }
        if (this.age > 1 && this.age <5) {
            return "года";
        } else {
            return "лет";
        }
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " +
                this.name +
                ", мне " +
                this.age +
                " " + this.getAgePlural() +
                ", я вешу - " +
                this.weight +
                "кг, мой цвет - " +
                this.color;
    }


}
