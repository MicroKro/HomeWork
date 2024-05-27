package factory;

import animal.Animal;
import bird.Duck;

import data.AnimalTypeData;
import data.ColorData;
import pet.Cat;
import pet.Dog;



public class AnimalFactory {
    public Animal create (AnimalTypeData animalTypeData, String name, int age, double weight, ColorData color) {
        switch (animalTypeData) {
            case CAT:
                return new Cat(name, age, weight, color);
            case DOG:
                return new Dog(name, age, weight, color);
            case DUCK:
                return new Duck(name, age, weight, color);
        }

    return null;
    }
}
