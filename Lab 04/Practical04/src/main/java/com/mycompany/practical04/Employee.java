package com.mycompany.practical04;
public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    //setter method
    public void setInfo (int empID,String empName,String empDesignation)
    {
    this.empID=empID;
    this.empName=empName;
    this.empDesignation=empDesignation;
    }
    
    //getter method for empID
    public int getempID()
    {
    return empID;
    }
    //getter method for empName
    public String getempName()
    {
      return empName;      
    }
    //getter method for empDesignation
    public String getempDesignation()
    {
    return empDesignation;
    }        
    
    
}
