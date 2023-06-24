package org.example;

public class Triangle implements Shape{
    private double perpendicularHeight, side1,side2,base;

    public Triangle(double perpendicularHeight, double side1, double side2, double base){
        this.perpendicularHeight=perpendicularHeight;
        this.side1=side1;
        this.side2=side2;
        this.base=base;
    }

    public void setPerpendicularHeight(double perpendicularHeight) {
        this.perpendicularHeight = perpendicularHeight;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPerpendicularHeight() {
        return perpendicularHeight;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calculateArea() {
        return 0.5*perpendicularHeight*base;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+base;
    }
}
