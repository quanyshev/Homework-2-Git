package methods;

public interface Printable {
    default void print() {
        System.out.println("No content.");
    }
}
