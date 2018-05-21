package java8.interfacesExercise;

public interface SecondInterface {
    default void log(String toBePrinted) {
        System.out.println("Second interface log print: " + toBePrinted);
    }

    // Method toString will be override by method from Object, so it is pointless to create default implementation of it

//    default String toString(){
//
//    }
}
