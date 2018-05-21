package java8.interfacesExercise;

public interface FirstInterface {

    // it is used to prevent from poor implementation
    static void log(String toBePrinted) {
        System.out.println("First interface log print: " + toBePrinted);
    }
}
