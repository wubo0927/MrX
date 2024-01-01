public interface HelloWorld {
    public static final String WORLD = "world";

    public default void helloWorld() {
        System.out.println("Hello, " + WORLD + "!");
    }
}
public class wubo implements HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello JAVA");
    }
    public static void helloWorld(String[] args) {
        System.out.println("OK!");
    }



}
