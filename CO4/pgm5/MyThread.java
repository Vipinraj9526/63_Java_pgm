import java.util.*;

 class Multiplication extends Thread
 {
   public void run()
   {
    try{
	 System.out.println("\nMultiplication table of 5");
         for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + 5 + " = " + (i*5));
	    Thread.sleep(1000);
        }
	}
     catch(Exception e){
	System.out.println(e);
	}
    }
   }
   class primeNumbers extends Thread {
    int limit;

    primeNumbers() {
        Scanner read=new Scanner(System.in);
        System.out.print("\nEnter the limit for prime numbers: ");
        limit = read.nextInt();
    }

    synchronized public void prime() {
   try{
        System.out.println("\nThe prime numbers upto " + limit + " is : \n");
        for (int i = 2, count = 1; count <= limit; i++) {
             Thread.sleep(800);
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
                count += 1;
            }
        }
      }
 catch(Exception e){
	System.out.println(e);
	}
    }

    public void run() {
        prime();
   }
   }
   class MyThread{
   public static void main(String args[])
   { 
    Multiplication mul=new Multiplication();
    primeNumbers p=new primeNumbers();
    mul.start();
    p.start();
   }
 }