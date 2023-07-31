package com.mycompany.javalab12;

public class Javalab12 
{

    public static void main(String[] args) 
    {
        while(true)
        {
        RedLightThread t1=new RedLightThread ();
        t1.start();
        
        YellowLightThread t3=new YellowLightThread ();
        t3.run();
        
        GreenLightThread t2=new GreenLightThread ();
        t2.run();
        
        
        }
    }
}
