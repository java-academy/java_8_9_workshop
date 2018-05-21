package java8.interfacesExercise;

public class FirstClass implements FirstInterface {

    @Override
    public void log(String toBePrinted) {
        System.out.println("First class log print: " + toBePrinted);
    }
}
