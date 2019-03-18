package ex1;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Bartosz", 25, true);
        Student student2 = new Student("Miłosz", 19, true);
        Student student3 = new Student("Agata", 23, false);


        Predicate<Student> detectiveCheckIsAdult = student -> {
            if(student.getAge()<18){
                return false;
            }
            return true;
        };

        Detective detectiveIsWoman = student -> {
            if(!student.isGender()){
                return true;
            }
            return false;
        };

        Detective detectiveNameStartsWithA = student -> {
            if(student.getName().charAt(0) == 'A'){
                return true;
            }
            return false;
        };

        StudentDetective studentDetective = new StudentDetective();
        studentDetective.tryStudent(detectiveCheckIsAdult,student1);
//        studentDetective.tryStudent(detectiveIsWoman,student3);
//        studentDetective.tryStudent(detectiveNameStartsWithA,student2);
    }
}
