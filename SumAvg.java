import java.util.*;

 // Compiler version JDK 11.0.2

 class SumAvg
 {
   public static void main(String args[])
   { 
    int sum=0;
        int[] nums={3,24,57,56,98};
        for(int i: nums)
            {
            sum=sum+i;
            }
         
    System.out.println("Sum of all numbers is "+ sum);
        
    System.out.println("Average of all numbers is "+ (sum/5));

   }
 }
