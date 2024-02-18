package Lesson3;

public class Teacher extends Person{
   private double salary;

   public Teacher(String name,int age,double height,boolean gender){
             super(name,age,height,gender);
             this.salary=salary;
   }

   public double getSalary(){
       return salary;
   }

}
