import java.applet.Applet; 
import java.awt.*; 
public class Different extends Applet 
{ 
public void paint(Graphics g) 
{ 
g.setColor(Color.RED); 
g.drawString("welcome",50,50); 
g.drawLine(20,30,50,100); 
g.drawRect(70,30,100,30);
g.fillRect(170,100,30,30); 
g.drawOval(70,100,30,30); 
g.setColor(Color.pink); 
g.fillOvel(70,200,30,30); 
g.drawArc(90,150,30,50,70,60); 
g.fillArc(20,30,40,50,60,70); 
} 
} 
/* 
<applet code="Different.class" width="300" height="300"> 
</applet> 
*/ 



