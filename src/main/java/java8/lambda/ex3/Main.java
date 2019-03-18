package ex3;

import ex1.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Charles", 29, true),
                new Student("Lewis", 39, false),
                new Student("Thomas", 19, false),
                new Student("Charlotte", 18, false),
                new Student("Matthew", 39, true)
        );

        // Step 1: Sort list by last name
        Collections.sort(students, (s1,s2)->{
            if(s1.isGender()){
                return 1;
            }
            else if(!s1.isGender()){
                return -1;
            }
            else return 0;
        } );

        // Step 2: Create a method that prints all elements in the list
        System.out.println("Printing all persons");
        printConditionally(students, p -> true);

        // Step 3: Create a method that prints all people that have last name beginning with C
        System.out.println("Printing all persons with last name beginning with C");
        printConditionally(students, p -> p.getName().startsWith("C"));

        System.out.println("Printing all persons with first name beginning with C");

        printConditionally(students, p -> p.getName().startsWith("C"));

        students.forEach(System.out::println);
    }

    private static void printConditionally(List<Student> people, Condition condition) {
        for (Student p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }









    //Next Ex

    // Implement interface which is accepting description and list of integer values
    // Implement lambda based on this interface in a way that it is showing each value
    //      from list increased by 10, followed by description.
    //      It is also returning sum of elements increased by 10. Print it out later
}
