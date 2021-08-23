import java.util.*;

 // Compiler version JDK 11.0.2

 class Greatest
 {
   public static void main(String args[])
   { 
    int a=10,b=15,c=7;
    if(a>b)
      {
       if(a>c)
       {
         System.out.println("A is large");
       }
      }
     else if(b>c)
     {
     System.out.println("b is large");
     }
    else
     {System.out.println("c is large");}
   }
 }
