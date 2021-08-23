import java.util.*;
interface Order{
int calculate(int NetAmount);
}

class Bill implements Order{
int pid,quantity,uprice,total;
String pname;

Bill(){
Scanner s=new Scanner(System.in);
System.out.println("Enter the product id:");
pid=s.nextInt();
System.out.println("Enter the product Name:");
pname=s.next();
System.out.println("Enter the product quantity:");
quantity=s.nextInt();
System.out.println("Enter the unit price:");
uprice=s.nextInt();
total=quantity*uprice;
}

public int calculate(int NetAmount){
NetAmount=NetAmount+total;
return NetAmount;
}


public static void main(String args[]){
Scanner s=new Scanner(System.in);
int orderno,noitem,NetAmount=0;
String date;
System.out.println("Enter order no:");
orderno=s.nextInt();
System.out.println("Enter date of puchase:");
date=s.next();
System.out.println("Enter no.of item:");
noitem=s.nextInt();
Bill[] b=new Bill[noitem];
for(int i=0;i<noitem;i++)
{
b[i]=new Bill();
NetAmount=b[i].calculate(NetAmount);
}
System.out.println("Order NO. "+orderno);
System.out.println("Date:"+date);
System.out.println("ProductId    Name   Quantity  unitprice Total");
for(int i=0;i<noitem;i++)
{
System.out.println(b[i].pid+"\t\t"+b[i].pname+"\t"+b[i].quantity+"\t"+b[i].uprice+"\t"+b[i].total);
}
System.out.println("\nNetAmount :"+NetAmount);

}
}