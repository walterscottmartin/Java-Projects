//<applet code="ScreenSaver" width=800 height=600></applet>

//Program by Walter Scott Martin
//This program draws one of three shapes and allows you to increase or decrease the size

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GeometryWIP extends Applet implements ActionListener
{
    Button rect,oval,tri,inc,dec;
    String msg = "", msg2 = "";
    int w = 0;
	Color c;
    public void init() 
    {
        rect = new Button ("Rectangle");
        oval = new Button ("Oval");
        tri = new Button ("Triangle");
        inc = new Button ("Increase");
        dec = new Button ("Decrease");
        add(rect);add(oval);add(tri);add(inc);add(dec);
        
        rect.addActionListener(this);
        oval.addActionListener(this);
        tri.addActionListener(this);
        inc.addActionListener(this);
        dec.addActionListener(this);  
    }
public int rand(int a, int b)
{
   return((int)((b-a+1) * Math.random() + a));
}
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() == rect)
	   {
	   msg="Rect";
	   msg2="N";
	   c = new Color(rand(0,255), rand(0,255), rand(0,255));
       }
	   if(ae.getSource() == oval)
	   {
	   msg="Oval";
	   msg2="N";
       c = new Color(rand(0,255), rand(0,255), rand(0,255));
	   }
	   
	   if(ae.getSource() == tri)
	   {
	   msg = "Tri";
	   msg2="N";
       c = new Color(rand(0,255), rand(0,255), rand(0,255));
	   }
	   if(ae.getSource() == inc)msg2 = "Inc";changesize();
       if(ae.getSource() == dec)msg2 = "Dec"; changesize();
	   repaint();
    }
    

public int changesize()
{
if (msg2.equals("Inc"))
{
w+=5;
}
else if (msg2.equals("Dec"))
{
w-=5;
}
else if(msg2.equals("N"))w=0;

return(w);
}

public void paint (Graphics g)
{  
	g.setColor(c);
	if (msg.equals("Rect"))
    {
		if((200+w)<600&&(200+w)>0)
	    {
	    g.fillRect(100,100,(200+w),(150+w));	
        }
    }
   else if (msg.equals("Oval"))
    {
	    if((w>=0)&&(w<=600))
		{
        g.fillOval(100,100,(150+w),(150+w));
        }   
    }
    else if (msg.equals("Tri"))
    {
	    if((300+w)<600&&(100+w)>0)
	{
     int x[]={100,(100+w),(300+w)};
     int y[]={100,(250+w),(250+w)};
     g.fillPolygon(x,y,x.length);
    }   
	}
}

}



