package org.example;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5);
        System.out.println("Area : "+c1.calculateArea());
        System.out.println("Perpendicular : "+c1.calculatePerimeter());

        Rectangle r1 = new Rectangle(10,15);
        System.out.println("Area : "+r1.calculateArea());
        System.out.println("Perpendicular : "+r1.calculatePerimeter());

        Triangle t1 = new Triangle(2,5,4,3);
        System.out.println("Area : "+t1.calculateArea());
        System.out.println("Perpendicular : "+t1.calculatePerimeter());
    }
}