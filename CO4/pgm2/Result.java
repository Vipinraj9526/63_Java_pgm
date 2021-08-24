package Arithematic;
import java.util.*;


interface Operations{
void add(float a,float b);
void sub(float a,float b);
void mul(float a,float b);
void div(float a,float b);

}

class AreOpe implements Operations{
Scanner s=new Scanner(System.in);
float a,b,result;
public void add(float a,float b){
result=a+b;
System.out.println("Sum of two number is:"+result);
}

public void sub(float a,float b){
result=a-b;
System.out.println("Substraction of two number is:"+result);
}

public void mul(float a,float b){
result=a*b;
System.out.println("Multiplication of two number is:"+result);
}

public void div(float a,float b){
result=a/b;
System.out.println("Division of two number is:"+result);
}

}
class Result{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
AreOpe ds=new AreOpe();

float a,b;
System.out.println("Enter the first number:");
a=s.nextFloat();
System.out.println("Enter the second number:");
b=s.nextFloat();
ds.add(a,b);
ds.sub(a,b);
ds.mul(a,b);
ds.div(a,b);
}
}