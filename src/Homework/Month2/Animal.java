package Homework.Month2;

import java.util.ArrayList;

public class Animal {

   private String name;
   private int age;
   private int weight;
   private String color;

   public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
   }

   public String getName() {
        return name;
   }

   public void setName(String name) {
        this.name = name;
   }

   public int getAge() {
        return age;
   }

   public void setAge(int age) {
        this.age = age;
   }

   public int getWeight() {
        return weight;
   }

   public void setWeight(int weight) {
        this.weight = weight;
   }

   public String getColor() {
        return color;
   }

   public void setColor(String color) {
        this.color = color;
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
   public interface Flying {
        default void Fly() {
            System.out.println("Я лечу");
        }
   }

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
