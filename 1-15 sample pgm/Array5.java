import java.util.*;

 // Compiler version JDK 11.0.2

 class Array5
 {
   public static void main(String args[])
   {
     
    int l,temp=0;
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the limit!");
    l=n.nextInt();
    System.out.println("Enter the elements of array");
    int[] arr=new int[l];
    for(int i=0;i<l;i++)
    {
      arr[i]=n.nextInt();
      if (temp<arr[i])
       temp=arr[i];
    }
    
   System.out.println("The largest element is " +temp);
   
   }
 }
