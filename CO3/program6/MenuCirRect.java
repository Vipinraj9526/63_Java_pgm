import java.util.*;
interface Circle{
void CircleOperation();
}
interface Rectangle{
void RectangleOperation();
}

class CirRect implements Circle,Rectangle{

public void CircleOperation(){
Scanner s=new Scanner(System.in);
float r,area,peri;
System.out.println("Enter the radius of circle:");
r=s.nextFloat();
area=3.141f*r*r;
peri=2*3.141f*r;
System.out.println("");
System.out.println("Area of circle is:"+area);
System.out.println("Perimeter of circle:"+peri);
System.out.println("");
}

public void RectangleOperation(){
Scanner s=new Scanner(System.in);
float l,b,area,peri;
System.out.println("Enter the length of the rectangle");
l=s.nextFloat();
System.out.println("Enter the breath of the rectangle");
b=s.nextFloat();
area=l*b;
peri=2*(l+b);
System.out.println("");
System.out.println("Area of rectangle is:"+area);
System.out.println("perimeter of rectangle is:"+peri);
System.out.println("");
}
}
class MenuCirRect{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
CirRect d=new CirRect();

int ch,s1=1;
while(s1==1){
System.out.println("-------------MENU--------------");
System.out.println(" 1.Circle\n 2.Rectangle\n 3.Exit\n ");
System.out.println("-------------------------------");
System.out.println("Choose your choice:");
ch=s.nextInt();
switch(ch)
{
case 1:d.CircleOperation();
break;
case 2:d.RectangleOperation();
break;
case 3:s1=0;
System.out.println("You are exited......");
break;
default:System.out.println("Enter valid input");
}
}
}
}