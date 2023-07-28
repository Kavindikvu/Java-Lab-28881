package com.mycompany.practical03;

public class Practical03 
{

    public static void main(String[] args)
    {
    
    Testclass e1=new Testclass();
        e1.setname("Umesha");
        e1.setage(22);
        e1.setsalary(2500.00f);
        e1.setbonus(3500.00f);
        System.out.println("My name is: " +e1.getname());
        System.out.println("My age is: " +e1.getage() + "Years old");
        System.out.println("Salary is: " +e1.getsalary()+ "Rupess");
        System.out.println("Bonus is: "+e1.bonusammonut());
    }
    
    
    }
