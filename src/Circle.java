//Write a Java program to create a class called "Circle" with an instance variable "radius."
//Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.


public class Circle {
    double radius;

    public Circle() {   }

    public Circle(double radius) {
        this.radius = radius;
    }
    public void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle is " + area);

    }
    public void perimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The perimeter of a circle is " + perimeter);
    }
}
