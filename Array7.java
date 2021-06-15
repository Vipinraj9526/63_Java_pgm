import java.util.*;

 // Compiler version JDK 11.0.2

 class Array7
 {
   public static void main(String args[])
   {
     
    int l;
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the limit!");
    l=n.nextInt();
    System.out.println("Enter the elements of array");
    int[] arr=new int[l];
    for(int i=0;i<l;i++)
    {
      arr[i]=n.nextInt();
    }
    System.out.println("The no.of element present "+arr.length);
   }
 }
