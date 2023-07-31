package com.mycompany.main8;
public class lifeGame implements playerController {

    @Override
    public void moveUp() {
        System.out.println("Moving Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Moving Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Moving Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Moving Right");
    }
    
}
