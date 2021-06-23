import java.util.*;
class MatrixSymmetric
{
public static void main(String args[])
{
Scanner no=new Scanner(System.in);
System.out.println("Enter the row of matrix");
int n=no.nextInt();
int[][] a=new int[n][n];
double f=0;
System.out.println("Enter the element of matrix");
for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      a[i][j]=no.nextInt();
     }
 }

for(int i=0;i<n;i++)
 {
  for (int j=0;j<n;j++)
     {
      if(a[i][j]==a[j][i])
	{
 	 f=1;
	}
      else
	{
         f=0;
         break;
        }     
  }
 }

  if(f==1)
    {
     System.out.println("Sysmmetric");
    }
  else
    {
     System.out.println("not symmetric");
    }

}
}