package Lesson3;

public class Student extends Person{
        private double grade;

    public Student(String name,
                   int age,
                   double height,
                   boolean gender,
                   double grade) {
        super(name, age, height, gender);
        this.grade = grade;
    }

}
