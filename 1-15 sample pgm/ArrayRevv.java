import java.util.*;

 // Compiler version JDK 11.0.2

 class ArrayRevv
 {
   public static void main(String args[])
   { 
    Scanner ns=new Scanner(System.in);
    
    int n;
    
    System.out.println("Enter the size of array!");
    n=ns.nextInt();
    
    int[] arr=new int[n];
    
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++)
    {
   arr[i]=ns.nextInt();
    }
    
    System.out.println("Entered  elements are array elements");
     for(int i=0;i<n;i++)
    {
      System.out.println(arr[i]);
    }
 

    System.out.println("Reversed  array elements are :");
    for(int i=n-1; i >= 0; i--)
    {
      System.out.println(arr[i]);
   }
  }
 }
