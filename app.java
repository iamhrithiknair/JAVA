//creating first applet program

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;

public class app extends Applet{
	
	public void paint(Graphics g){
		g.drawString("welcome to techworld",150,150);
		g.drawLine(100,100,300,300);
		g.drawOval(500,500,100,100);
		
	}
	public void init(){
		setBackground(Color.RED);
}
	
}

/*
<applet code="app.class" width="300" height="300">
</applet>
*/
