package java8.interfacesExercise;

public class SecondClass implements FirstInterface, SecondInterface {

    @Override
    public void log(String toBePrinted){
        System.out.println("Print from second class: " + toBePrinted);
    }
}
