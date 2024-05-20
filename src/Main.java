import Homework.Month2.*;
import Practice.*;
import Lessons.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main.lesson11();
    }

    public static void lesson11() {
        Lesson11.monthList();
        Lesson11.checkCash();
        Lesson11.namesList();
        Lesson11.whileDo();
        Lesson11.doWhile();
    }

    public static void practice1() {
        Practice1.resurse();
    }

    public static void homework1() {
        List<String> animals = new ArrayList<>();
        animals.add("Коты");
        animals.add("Собаки");
        animals.add("Утки");
        System.out.println(animals);

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
        duck.Fly();

//        Menu menu = new Menu();
//        menu.addEntry(new MenuEntry("test1") {
//            @Override
//            public void run() {
//                System.out.println("test1 run");
//            }
//        });
//        menu.addEntry(new MenuEntry("test2") {
//            @Override
//            public void run() {
//                System.out.println("test2 run");
//            }
//        });
//        menu.run();
    }

}
