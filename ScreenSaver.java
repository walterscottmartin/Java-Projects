// Program by Walter Scott Martin
//This is a simple screen saver.  It draws a combination of 500 empty and full triangles on the screen and then clears the screen and repeats the process */ 


//<applet code="ScreenSaver" width=800 height=600></applet>

import java.awt.*;
import java.applet.*;     

// This intializes my foreground ,background, counter and sets up the arrays that I will use to draw the vertices of my triangles

public class ScreenSaver extends Applet
{
//This is my counter variable
int c = 0; 

// This intializes my foreground ,background,  and sets up the arrays that I will use to draw the vertices of my triangles
public void init() 
{
    setBackground(Color.blue);
    setForeground(Color.black);
    int x[]={rand(0,800), rand(0,800), rand(0,800)};
    int y[]={rand(0,600), rand(0,600), rand(0,600)};
}

//This is my random method which I use so that the triangles will very in shape and color
public int rand(int a, int b)
{
   return((int)((b-a+1) * Math.random() + a));
}


//I use sleep to create a delay so that we can see the triangles.  
public static void sleep(long ms)
{
    try
    {
        Thread.sleep(ms);   
    }
    catch(InterruptedException e) {}
}

//The purpose of this method is to clear the screen.  It sets the foreground color equal to the background color
public void CLS(Graphics g)
{
    
    g.setColor(getBackground());
    g.fillRect(0, 0, getSize().width, getSize().height);
    g.setColor(getForeground());
 
 }

 //We must maintian communication with the browser.  This is achieved through the method update
public void update(Graphics g)
{
paint(g);
}


//In applets we do the lions share of the work in paint.  I choose a random color and draw random triangles
public void paint(Graphics g)
{
    g.setColor(new Color(rand(0,255),rand(0,255),rand(0,255)));
    
    int x[]={rand(0,800), rand(0,800), rand(0,800)};
    int y[]={rand(0,600), rand(0,600), rand(0,600)};
    
    g.drawPolygon (x,y,x.length);
    g.fillPolygon (x,y,x.length);
    
    		
    sleep(100);
	
    c++;
	
    if(c > 500)
	{
            CLS(g);
            c = 0;
	}
    repaint();
}
}
