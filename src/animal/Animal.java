package animal;
import data.ColorData;

public abstract class Animal {

   private String name;
   private double age;
   private double weight;
   private ColorData color = null;

   public Animal(String name, double age, double weight, ColorData color) {
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

   public void setAge(double age) {
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
       int years = (int) age;
       int month = 0;

       String[] dateParts = String.valueOf(age).split("\\.");
       if (dateParts.length > 1) {
           month = Integer.parseInt(dateParts[1]);
       }

       String fullResult = "";

       if (years != 0) {
           String yearsSuffix = "";
           if (years >= 10 && years <= 20) {
               yearsSuffix = "лет";
           } else {
               double ostatok = years % 10;
               if (ostatok >= 0 && ostatok < 2) {
                   yearsSuffix = "год";
               } else  if (ostatok >= 2 && ostatok <= 4) {
                   yearsSuffix = "года";
               } else {
                   yearsSuffix = "лет";
               }
           }

           fullResult = String.format("%d %s", years, yearsSuffix);
       }

       if (month != 0) {
           String monthSuffix = "";
           if (month >= 10 && month <= 20) {
               monthSuffix = "месяцев";
           } else {
               double ostatok = month % 10;
               if (ostatok >= 0 && ostatok < 2) {
                   monthSuffix = "месяц";
               } else if (ostatok >= 2 && ostatok <= 4) {
                   monthSuffix = "месяца";
               } else {
                   monthSuffix = "месяцев";
               }
           }

           fullResult = fullResult + String.format(" %d %s", month, monthSuffix);
       }

       return fullResult;
   }

   public String toString() {
       return String.format("Привет! меня зовут %s, мне %s, я вешу - %.1f кг, мой цвет - %s",
               name, getAgePlural(), weight, color.getColorName().toLowerCase());
   }
}
