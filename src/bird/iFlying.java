package bird;

public interface iFlying {
          default void Fly() {
            System.out.println("Я лечу");
        }
}
