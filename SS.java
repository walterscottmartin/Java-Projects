/*
 
 Author:  W. Scott Martin
 Date  :  07/9/08
 Program Name: SS.java

 This is a simple screen saver that draws random circles with random
 colors in random locations.

*/

 
import java.awt.*;
import java.applet.*;

//<applet code="SS" align=right width=500 height=400> </applet>
 
public class SS extends Applet
{
    int w;
    /****************************update()*****************************/
    public void update(Graphics g)
    {
       paint(g);
    }
    /******************************sleep()****************************/
    public void sleep(long ms)
    {
        try
        {
             Thread.sleep(ms);
        }
        catch(InterruptedException e){}
    }
    /******************************rand()*****************************/
    public int rand(int a, int b)
    {
        return((int)((b-a+1)*Math.random() + a));
    }
    /**************************randomColor()**************************/
    public Color randomColor()
    {
         return(new Color(rand(0,255), rand(0,255), rand(0,255)));
    }
    /*****************************paint()*****************************/
    public void paint(Graphics g)
    {
        g.setColor(randomColor());
        g.fillOval(rand(0,450), rand(0,450), w=rand(10,70), w);
        sleep(300);
        repaint();
    }
}
