/*
 
 Author: W. Scott Martin
 Date  : 07/25/08
 Program Name: GetLocation.java
 
*/
 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 
//<applet code="GetLocation" align=middle width=500 height=400>
//</applet>
 
public class GetLocation extends Applet implements ActionListener
{
    Point p;
//*********************************init()*********************************
    public void init()
    {
        String L[] = {"Green", "DarkGray", "LightMagenta", "Orange",
                      "LightYellow", "DarkBrown", "White", "Pink"};
        Button b[] = new Button[8];
           
        for(int i = 0; i < b.length; i++)
        {
           b[i] = new Button(L[i]);
           add(b[i]);
           b[i].addActionListener(this);
        }
    }
//***************************actionPerformed()****************************
    public void actionPerformed(ActionEvent ae)
    {
        Component c = (Component)ae.getSource();
        p = c.getLocationOnScreen();
   
        repaint();
    }    
//********************************paint()*********************************
    public void paint(Graphics g)
    {
         if(p != null)
             g.drawString("x = " + p.x + "    y = " + p.y, 10, 200);
    }
}
