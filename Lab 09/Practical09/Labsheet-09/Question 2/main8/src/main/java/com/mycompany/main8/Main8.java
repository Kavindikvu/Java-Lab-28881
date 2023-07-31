package com.mycompany.main8;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        lifeGame l1 = new lifeGame();
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Enter key : ");
            String input = sc.nextLine().toLowerCase();
            
            switch(input)
            {
                case "u":
                   l1.moveUp();
                    break;
                case "d":
                    l1.moveDown();
                    break;
                case "l":
                    l1.moveLeft();
                    break;
                case "r":
                    l1.moveRight();
                    break;
                case "q":
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Try again.");
            }
        }
    }
}
