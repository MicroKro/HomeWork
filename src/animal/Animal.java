package animal;

import data.AnimalTypeData;
import data.ColorData;

public class Animal {

   private String name;
   private int age;
   private double weight;
   private ColorData color = null;

   public Animal(String name, int age, double weight, ColorData color) {
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

   public double getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public double getWeight() {
       return weight;
   }

   public void setWeight(double weight) {
       this.weight = weight;
   }

   public ColorData getColor() {
       return color;
   }

   public void setColor(ColorData color) {
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

   private String getAgePlural() {
       int ostatok = (int) (age %10);

       if (ostatok == 1) {
            return "год";
        }
       if (ostatok >= 2 && ostatok <=4) {
            return "года";
       }else {
            return "лет";
       }
   }

//    @Override
    //Вариант с конкатенацией
//    public String toString() {
//       return "Привет! меня зовут " +
//                this.name +
//                ", мне " +
//                this.age +
//                " " + this.getAgePlural() +
//                ", я вешу - " +
//                this.weight +
//                "кг, мой цвет - " +
//                this.color;
//}
   // Вариант с шаблоном
   public String toString() {
       return String.format("Привет! меня зовут %s, мне %d %s, я вешу - %.1f кг, мой цвет - %s",
               name, age, getAgePlural(), weight, color.getColorName().toLowerCase());
   }

}
