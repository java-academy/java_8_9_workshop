package java8.interfacesExercise;

public interface SecondInterface {
    default void log(String toBePrinted) {
        System.out.println("Second interface log print: " + toBePrinted);
    }
}
