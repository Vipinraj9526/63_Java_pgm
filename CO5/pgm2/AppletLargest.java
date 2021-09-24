import java.awt.*;
import java.applet.*;

/*
<applet code="AppletLargest" width=450 height=450>
<param name=num1 value=30>
<param name=num2 value=50>
<param name=num3 value=15>
</applet>
*/

public class AppletLargest extends Applet{
	
	int largest=0,num1,num2,num3;
	public void init(){
		num1=Integer.parseInt(getParameter("num1"));
		num2=Integer.parseInt(getParameter("num2"));
		num3=Integer.parseInt(getParameter("num3"));
	}
	public void start(){
		if(num1>num2 && num1>num3){
			largest=num1;
		}
		else if(num2>num1 && num2>num3){
			largest=num2;
		}else{
			largest=num3;
		}
	}
	public void paint(Graphics g){
			g.drawString("Largest number:"+largest,100,100);
		}
}