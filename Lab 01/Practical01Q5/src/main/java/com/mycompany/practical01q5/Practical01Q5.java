package com.mycompany.practical01q5;

public class Practical01Q5 
{

    public static void main(String[] args) 
    {
        char grade ='A';
	 switch(grade)
	{
	case 'A' :
	System.out.println("Excellent!"); 
	break;
	case 'D' :
	System.out.println("You passed");
	case 'F' :
	System.out.println("Better try again");
	break;
	default :
	System.out.println("Invalid grade");
	}
	System.out.println("Your grade is " + grade);
        
    
	 if(grade=='A')
             
	System.out.println("Excellent!"); 
	
         else if(grade=='D')
	System.out.println("You passed");
         else if(grade=='F') 
	System.out.println("Better try again");
	
	else
	System.out.println("Invalid grade");
	
	System.out.println("Your grade is " + grade);
    }
}
