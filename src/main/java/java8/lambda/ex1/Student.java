package ex1;

public class Student {

    private String name;
    private Integer age;
    private boolean gender;

    public Student(String name, Integer age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                 name + ' ' +
                 age + " " + gender
                ;
    }
}
