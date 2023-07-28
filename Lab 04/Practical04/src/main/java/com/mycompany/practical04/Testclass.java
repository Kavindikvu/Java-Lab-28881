package com.mycompany.practical04;
public class Testclass 
{
    

    public static void main(String[] args) 
    {
        Employee e1=new Employee();
        e1.setInfo(1234, "Mr.Bodan", "Dean");
        
        System.out.println("Employee ID" +e1.getempID());
        System.out.println("Employee Name"+e1.getempName());
        System.out.println("Employee Designation"+e1.getempDesignation());
        
        Employee e2=new Employee();
        e2.setInfo(4567, "Ms.Bird", "Securaty");
        System.out.println("Employee ID"+e2.getempID());
        System.out.println("Employee Name"+e2.getempName());
        System.out.println("Employee Designation"+e2.getempDesignation());
    }
}