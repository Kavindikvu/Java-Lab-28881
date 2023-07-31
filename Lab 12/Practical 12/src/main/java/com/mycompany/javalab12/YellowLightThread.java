package com.mycompany.javalab12;

public class YellowLightThread 
{
    public void run()
  {
      try {
             System.out.println("Yellow Light");
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
    }
    
}
