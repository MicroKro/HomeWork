package bird;
import animal.Animal;
import data.ColorData;

public class Duck extends Animal implements iFlying {
    public Duck(String name, double age, double weight, ColorData color) {
        super(name, age, weight, color);
    }

    public String toString() {
        return super.toString();
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }
}


