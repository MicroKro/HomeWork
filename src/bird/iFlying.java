package bird;

public interface iFlying {
    default void fly() {
        System.out.println("Я лечу");
    }
}
