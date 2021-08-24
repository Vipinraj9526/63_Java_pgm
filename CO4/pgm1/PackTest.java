package Graphics;
import java.util.*;


interface Areas{
void area();
}

class RecArea implements Areas{

public void area(){
float l,b,Area;
Scanner s=new Scanner(System.in);
System.out.println("RECTANGLE");
System.out.println("Enter the length of rectangle:");
l=s.nextFloat();
System.out.println("Enter the breath of rectangle:");
b=s.nextFloat();
Area=l*b;
System.out.println(Area);
System.out.println("-----------------");
}
}

class TriArea implements Areas{
public void area(){
float base,h,Area;
Scanner s=new Scanner(System.in);
System.out.println("TRIANGLE");
System.out.println("Enter the base length:");
base=s.nextFloat();
System.out.println("Enter the height of triangle:");
h=s.nextFloat();
Area=.5f*base*h;
System.out.println(Area);
System.out.println("-----------------");
}
}

class SquArea implements Areas{
public void area(){
float a,Area;
Scanner s=new Scanner(System.in);
System.out.println("SQUARE");
System.out.println("Enter the side of saquare:");
a=s.nextFloat();
Area=a*a*a;
System.out.println(Area);
System.out.println("-----------------");
}
}

class CirArea implements Areas{ 
public void area(){
float r,Area;
Scanner s=new Scanner(System.in);
System.out.println("CIRCLE");
System.out.println("Enter the radius of circle:");
r=s.nextFloat();
Area=3.141f*r*r;
System.out.println(Area);
System.out.println("-----------------");
}
}
class PackTest{
public static void main(String args[]){
RecArea r=new RecArea();
TriArea t=new TriArea();
SquArea ss=new SquArea();
CirArea c=new CirArea();

r.area();
t.area();
ss.area();
c.area();
}
}