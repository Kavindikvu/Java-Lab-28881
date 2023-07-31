package com.mycompany.mainclass1;
public class MainClass1 {

    public static void main(String[] args) {
        Politician politician = new Politician();
        Priest priest = new Priest();
        Lecturer lecturer = new Lecturer();

        politician.speak(); // Output: Talk politics
        priest.speak();     // Output: Religious Talks
        lecturer.speak();   // Output: Talks Object-Oriented Design and Programming
    }
}
