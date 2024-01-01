import "HelloWorld";

public class World {
    public static void main(String[] args) {
        HelloWorld.helloWorld();
    }
}

public interface HelloWorld {
    public static final String WORLD = "world";

    public default void helloWorld() {
        System.out.println("Hello, " + WORLD + "!");
    }
}