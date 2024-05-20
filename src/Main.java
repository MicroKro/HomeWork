import Homework.Month2.Animal;
import Homework.Month2.Cat;
import Homework.Month2.Dog;
import Homework.Month2.Duck;
import Practice.*;
import Lessons.*;

public class Main {
    public static void main(String[] args) {
        Main.homework1 ();
    }

    public static void lesson10() {
        Lesson10.newList();
        Lesson10.checkCash();
    }

    public static void practice1() {
        Practice1.resurse();
    }

    public static void homework1() {
        Animal animal = new Animal("Найда", 0, 3, "разноцветный");
        System.out.println(animal);

        Cat cat = new Cat("Мурка", 2, 4, "дымчатый");
        System.out.println(cat);
        cat.say();

        Dog dog = new Dog("Бобик", 5, 10, "рыжий");
        System.out.println(dog);
        dog.say();


        Duck duck = new Duck("Утито", 1, 5, "белый");
        System.out.println(duck);
        duck.fly();
    }

}
