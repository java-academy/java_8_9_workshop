package java8.interfacesExercise;

public interface FirstInterface {
    default void log(String toBePrinted) {
        System.out.println("First interface log print: " + toBePrinted);
    }
}
