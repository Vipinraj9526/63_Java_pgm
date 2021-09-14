import java.util.*;

class fibNum implements Runnable{
int limit;
fibNum(){

        System.out.println("Enter the limit of fibnocci number:");
	Scanner n=new Scanner(System.in);
	limit=n.nextInt();
}
synchronized public void fibDisplay(){
	
	
        System.out.println("\nFibonacci numbers are: ");
	int a=0;
	int b=1;
 	while(b<limit){
	System.out.println(b);
	int c=a+b;
	a=b;
	b=c;
        }
    }
public void run()
{
fibDisplay();
}
}

class evenNum implements Runnable{
int n;
evenNum()
{
Scanner d=new Scanner(System.in);
	
	System.out.println("Enter the limit of even numbers:");
	n=d.nextInt();
}

synchronized public void evenDisplay(){

	
        System.out.println("The Even numbers upto " + n + " is : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
}
public void run()
 {
        evenDisplay();
}
}
class ThreadRun{
public static void main(String args[])
{
fibNum f=new fibNum();
evenNum e=new evenNum();

Thread t1=new Thread(f);
Thread t2=new Thread(e);
t1.start();
t2.start();
}
}