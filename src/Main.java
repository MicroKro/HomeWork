import animal.Animal;
import bird.Duck;
import data.AnimalTypeData;
import data.ColorData;
import data.CommandsData;
import pet.Cat;
import pet.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.homework1();
    }

    public static void homework1() {
        List<Animal> animals = new ArrayList();

        Cat cat = new Cat("Мурка", 2, 4.1, ColorData.FOGGY);
        animals.add(cat);
        cat.say();

        Dog dog = new Dog("Бобик", 5, 10, ColorData.ORANGE);
        animals.add(dog);
        dog.say();

        Duck duck = new Duck("Утито", 1, 5, ColorData.MULTICOLOR);
        animals.add(duck);
        duck.Fly();

        for (Animal i: animals) {
            System.out.println(i);
        }

//        Scanner scanner = new Scanner(System.in);
//
//        CommandsData [] commandsData = CommandsData.values();
//        String[] = commandsStr = new String[commandsData.length];
//        for (int i=0; i< commandsData.length; i++) {
//            commandsStr[i] = commandsData[i].name().toLowerCase();
//        }
//
//        while (true){
//        System.out.println("Введите одну из команд: %s\n" + String.join(commandsStr));
//        String commandsStr = scanner.next(). trim().toUpperCase();
//
//        boolean isCommandExist = false;
//        for (CommandsData command: commandsData) {
//            if (command.name().equals(commandsStr)) {
//                isCommandExist = true;
//                break;
//            }
//        }
//
//        if (!isCommandExist) {
//            System.out.println("Вы ввели неверную комманду. Попродуйте снова");
//            continue;
//        }
//
//        CommandsData userCommandData = CommandsData.valueOf(commandsStr);
//
//        switch (userCommandData) {
//            case ADD:
//                System.out.println("Вы ввели ADD");
//                break;
//            case LIST:
//                System.out.println("Вы ввели LIST");
//                break;
//            case EXIT:
//                System.out.println("Вы ввели EXIT");
//                break;
//
//
//
//        }
//
    }
}
