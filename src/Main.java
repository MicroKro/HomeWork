import animal.Animal;
import data.AnimalTypeData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalFactory;
import pet.Cat;
import tools.InputHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        CommandsData[] commandsData = CommandsData.values();
        String[] commandsStr = new String[commandsData.length];
        for (int i=0; i< commandsData.length; i++) {
            commandsStr[i] = commandsData[i].name().toLowerCase();
        }

        AnimalTypeData[] animalType = AnimalTypeData.values();
        String[] animalTypeStr = new String[animalType.length];
        for (int i=0; i< animalType.length; i++) {
            animalTypeStr[i] = animalType[i].name().toLowerCase();
        }

        ColorData[] colorData = ColorData.values();
        String[] colorDataStr = new String[colorData.length];
        for (int i=0; i< colorData.length; i++) {
            colorDataStr[i] = colorData[i].name().toLowerCase();
        }

        while (true){
            System.out.printf("Введите одну из команд: %s\n", String.join("/", commandsStr));
            String commandInput = scanner.next().trim().toUpperCase();

            boolean isCommandExist = false;
            for (CommandsData command: commandsData) {
                if (command.name().equals(commandInput)) {
                    isCommandExist = true;
                    break;
                }
            }

            if (!isCommandExist) {
                System.out.println("Вы ввели неверную комманду. Попробуйте снова");
                continue;
            }

            CommandsData userCommandData = CommandsData.valueOf(commandInput);
            System.out.println("Вы ввели: " + commandInput.toLowerCase());

            switch (userCommandData) {
                case ADD:
                    AnimalFactory animalFactory = new AnimalFactory();

                    String animalTypeInput = null;

                    while (true) {
                        System.out.printf("Какое у Вас животное? Выберите из списка: %s\n", String.join
                                ("/", animalTypeStr));
                        animalTypeInput = scanner.next().trim().toUpperCase();

                        boolean isAnimalTypeExist = false;
                        for (AnimalTypeData type : animalType) {
                            if (type.name().equals(animalTypeInput)) {
                                isAnimalTypeExist = true;
                                break;
                            }
                        }

                        if (isAnimalTypeExist) {
                            break;
                        }

                        System.out.println("Такого животного нет. Попробуйте снова");
                    }

                    System.out.println(AnimalTypeData.valueOf(animalTypeInput).getAnimalType() +
                            " отзывается на кличку? Введите ее");
                    String nameInput = scanner.next();

                    double ageInput;
                    while(true) {
                        System.out.println("Сколько лет питомцу? Округлите до полных лет или введите месяц через точку" +
                                " (например 1.3)" );

                        String inputValue = scanner.next().trim();
                        if (InputHelper.isDoubleNumber(inputValue)) {
                            ageInput = Double.parseDouble(inputValue);
                            break;
                        } else {
                            System.out.println("Возраст может содержать только цифры и должен быть больше нуля :)" +
                                    " Попробуйте еще раз");
                        }
                    }

                    double weightInput;
                    while (true) {
                        System.out.println("Сколько весит "+ AnimalTypeData.valueOf(animalTypeInput).getAnimalType()
                                +"?");

                        String inputValue = scanner.next().trim();
                        if (InputHelper.isDoubleNumber(inputValue)) {
                            weightInput = Double.parseDouble(inputValue);
                            break;
                        } else {
                            System.out.println("Вес нужно ввести цифрами (через точку, если число дробное). " +
                                    "Отрицательный возраст не принимается :) Попробуйте еще раз :)"
                            );
                        }
                    }

                    String colorInput = null;
                    while (true) {
                        System.out.printf("Выберите цвет окраса: %s\n", String.join("/", colorDataStr));
                        colorInput = scanner.next().trim().toUpperCase();

                        boolean isColorDataExist = false;
                        for (ColorData color : colorData) {
                            if (color.name().equals(colorInput)) {
                                isColorDataExist = true;
                                break;
                            }
                        }

                        if (isColorDataExist) {
                            break;
                        }

                        System.out.println("Пожалуйста, выберите цвет из списка");

                    }

                    Animal userAnimal = animalFactory.create(
                            AnimalTypeData.valueOf(animalTypeInput),
                            nameInput, ageInput, weightInput, ColorData.valueOf(colorInput)
                    );
                    animals.add(userAnimal);

                    System.out.println("А вот и ваш питомец: " + userAnimal);
                    break;

                case LIST:
                    for(Animal animal: animals) {
                        System.out.println(animal.toString());
                    }
                    break;

                case EXIT:
                    System.exit(0);
            }
        }

    }
}
