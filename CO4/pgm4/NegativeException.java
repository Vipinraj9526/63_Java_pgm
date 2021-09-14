import java.util.Scanner;
class Negexception extends Exception{
      Negexception(String s){
             super(s);
      }
}
class NegativeException{
    public static void main(String args[]){
         try{
            float sum=0,num=0;
            float avg;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no of numbers:");
            int n=sc.nextInt();
            System.out.println("Enter the numbers:");
            for(int i=0;i<n;i++)
            {
            num=sc.nextInt();
            if(num<0)
                 throw new  Negexception("Negative Number");
             else
                  sum=sum+num; 
             }
                 avg=sum/n;
                 System.out.println("The average of numbers is:"+avg);
             }
             catch( Negexception e){
                 System.out.println(e);
             }
             finally{
                  System.out.println("program finished");
             }
}
}