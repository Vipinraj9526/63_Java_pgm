import java.awt.*;
import java.applet.*;
/*
<applet code="AppletPgm" width=300 height=200>
</applet>
*/
public class AppletPgm extends Applet {
public void paint(Graphics g){
g.drawOval(50,50,60,60);
g.drawRect(150,50,40,60);
g.drawLine(200,50,210,250);
}
}