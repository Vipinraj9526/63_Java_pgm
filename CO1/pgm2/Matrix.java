import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner no=new Scanner(System.in);
System.out.println("Enter the row of matrix");
int n=no.nextInt();
System.out.println(n);
int[][] arr1=new int[n][n];
int[][] arr2=new int[n][n];

System.out.println("Enter the element of first array matrix");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      arr1[i][j]=no.nextInt();
     }
 }

System.out.println("Enter the element of second array matrix");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      arr2[i][j]=no.nextInt();
     }
 }

System.out.println("Enter the element of first array matrix");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      System.out.print(arr1[i][j]+"  ");
     }
  System.out.println();
 }

System.out.println("Enter the element of second array matrix");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      System.out.print(arr2[i][j]+"  ");
     }
   System.out.println();
 }

System.out.println("Matrix after addition");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      System.out.print(arr1[i][j]+arr2[i][j]+"  ");
     }
   System.out.println();
 }



}
}