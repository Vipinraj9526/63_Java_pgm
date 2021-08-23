import java.util.Scanner;
interface Student
{
void AcadamicScore(int reg,String name,int AcadmicMark);
}
interface Sports
{
public void SportsScore(int SportsMark);
}
class Result implements Student,Sports{
int reg,AcadamicMark,SportsMark;
String name;
public void AcadamicScore(int reg,String name,int AcadamicMark)
{
this.reg=reg;
this.name=name;
this.AcadamicMark=AcadamicMark;
}
public void SportsScore(int SportsMark)
{
this.SportsMark=SportsMark;
}
void Display()
{
System.out.println("Register no:"+reg);
System.out.println("Name:"+name);
System.out.println("Acadamic Score:"+AcadamicMark);
System.out.println("Sports Score no:"+SportsMark);
int Total=AcadamicMark+SportsMark;
System.out.println("Total Score:"+Total);

}
}
class Score
{
public static void main(String args[]){
Scanner n=new Scanner(System.in);
Result s=new Result();
int reg,AcadamicMark,SportsMark;
String name;

System.out.println("Enter the register number");
reg=n.nextInt();
System.out.println("Enter the name");
name=n.next();
System.out.println("Enter the Acdamic score");
AcadamicMark=n.nextInt();
System.out.println("Enter the Sports Score");
SportsMark=n.nextInt();

s.AcadamicScore(reg,name,AcadamicMark);
s.SportsScore(SportsMark);
s.Display();

}
}
