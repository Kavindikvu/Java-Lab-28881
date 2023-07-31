package com.mycompany.myfirstinterface;
//Question 01
// With public static final keywords
public interface MyFirstInterface {
    int x=12;  
    void display();
}
// Without public static final keywords
public interface MyFirstInterface {
    int x=12;  
    void display();
}
// Why :- In this case, there is no practical difference between declaring the variable "x" with or without the public static final keywords. In both cases, the variable "x" will be treated as a constant and cannot be changed by the implementing classes.

//Question 02
// With abstract keyword
public interface MyFirstInterface {
    int x = 10;

    abstract void display();
}
// Without abstract keyword 
public interface MyFirstInterface {
    int x = 10;

    void display();
}
// Why :-there is no difference between these two approaches. If you define a method within an interface, it is implicitly abstract, even if you don't use the "abstract" keyword. All methods in an interface are abstract by nature, meaning they have no implementation in the interface itself.

//Question 03
public interface MyFirstInterface {
    int x=12;  
    abstract void display();
}
public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display() {
        x = 20;
        System.out.println("Value of x: " + x);
    }
}
//Why :- Attempting to change the value of "x" inside the "display()" method will cause a compilation error. In Java, variables declared in an interface are implicitly public, static, and final, making them constants. Constants cannot be reassigned or modified once they are initialized. That's why you cannot change the value of "x" inside the "display()" method or any other method in the implementing class. The compiler will raise an error indicating that you cannot assign a new value to a final variable.
