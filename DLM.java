/*
 
 Author: W. Scott Martin
 Date  : 07/24/08
 Program Name: DLM.java
 
*/
 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 
//<applet code="DLM" align=middle width=500 height=400>
//</applet>
 
public class DLM extends Applet
{
    public void init()
    {
         String text[] = {"Good", "Bad", "Ugly", "Pretty", "Nice"};

        // setLayout(new BorderLayout(10,10));
         setLayout(new GridLayout(2,3, 5, 5));

         setFont(new Font("SansSerif", Font.BOLD, 24));
         Button b[] = new Button[5];

         for(int i = 0; i < 5; i++)
         {
             b[i] = new Button(text[i]);
             b[i].setBackground(Color.pink);
             add(b[i]);
         }
       /* 
        add(b[0], BorderLayout.NORTH);
        add(b[1], BorderLayout.SOUTH);
        add(b[2], BorderLayout.EAST);
        add(b[3], BorderLayout.WEST);
        add(b[4], BorderLayout.CENTER);
*/
        add(new Label("Layout Managers Are Cool!"));
    }
}
