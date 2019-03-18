package ex1;

import java.util.function.Predicate;

public class StudentDetective {
    boolean tryStudent(Predicate<Student> detective, Student student){
        return detective.test(student);
    }
}
