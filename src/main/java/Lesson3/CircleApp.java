package Lesson3;

public class CircleApp {
    public static void main(String[] args){
        Circle circle1=new Circle(5,"red");
        Circle circle2=new Circle(6,"pink");
        Circle circle3=new Circle(7,"yellow");

        System.out.println("First circle's colour is "+circle1.getColour());
        System.out.println("First circle's radius is "+circle1.getRadius());
    }
}