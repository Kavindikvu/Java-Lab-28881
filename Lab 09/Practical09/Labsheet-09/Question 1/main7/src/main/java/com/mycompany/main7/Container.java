package com.mycompany.main7;
abstract class Container {
    abstract public double volume();
}
class CylindricalContainer extends Container {
    
    private double heigh;
    private double radius;
    private static final double pi = 3.14159;
    
    public CylindricalContainer(double h,double r){
        this.heigh = h;
        this.radius = r;
    }

    @Override
    public double volume() {
        return pi*radius*radius*heigh;
    }
    public void display(){
        System.out.println("Radius : " + radius);
        System.out.println("Height : " + heigh);
    }
    
}
