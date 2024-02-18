
package Lesson3;

public class Circle {
    public static long countofCircles;
    private double radius;
    private String colour;

    public Circle(double radius,String colour){
        this.radius=radius;
        this.colour=colour;
        countofCircles++;
    }

    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return this.colour;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }

    public double calcLeng(){
        return 2 * Math.PI * this.radius;
    }

}