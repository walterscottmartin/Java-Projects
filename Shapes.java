/*



  Author: W. Scott Martin

  Date: 7/23/08

  Course: CS111A

  Program Title: Shapes.java

  Objective: This applet allows the user to select three different shapes

             (oval, rectangle, and triangle) and manipulate their sizes.



*/ 



import java.awt.*;

import java.awt.event.*;

import java.applet.*; 



public class Shapes extends Applet implements ActionListener

{



    Button b[] = new Button[5];                  //five buttons

    String s[] = {"Oval", "Rectangle", "Triangle", "Increase", "Decrease"};

    String shape = "";                           //shape tracker



    Color c = Color.red;

    int dsize=0;                         //increment,decrement tracker



//************************************init()***********************************

    public void init()

    {

        setSize(800,580);



        for(int i=0; i<b.length;i++)

        {

            b[i]= new Button(s[i]);

            add(b[i]);

            b[i].addActionListener(this);

        }



    }

//******************************actionPerformed()******************************

    public void actionPerformed(ActionEvent ae)

    {

        if(ae.getSource() == b[3]) {if(dsize<240)dsize += 20;}

        else if(ae.getSource() == b[4]) {if(dsize>-240)dsize -= 20;}

        else if((ae.getSource() == b[0]) || (ae.getSource() == b[1]) ||

           (ae.getSource() == b[2]))

        {

            shape = ae.getActionCommand();       //shape tracker

            c = new Color(rand(0,255),rand(0,255),rand(0,255));//random color

            dsize = 0;                           //resetting size change

        }

        else {}

        repaint();

    }



//************************************rand()***********************************

    public int rand(int a, int b)

    {   return((int)((b-a+1)*Math.random()+a));}



//***********************************paint()***********************************

    public void paint(Graphics g)

    {

        g.setColor(Color.black);                 //border

        g.drawRect(0, 0, 799, 579);                  

        g.drawRect(2, 2, 795, 575);

        g.setColor(c);

        int h=260+dsize;                  //width & height for Oval/Rect

        int w=(h*3)/2;                    //default 3x2 size relation



        if(shape.equals("Oval")) g.fillOval(25,50,w,h);

        else if(shape.equals("Rectangle")) g.fillRect(25,50,w,h);

        else if(shape.equals("Triangle"))

        {

            int x[]={25,25,25+w};

            int y[]={50,50+h,50+h};

            g.fillPolygon(x,y,x.length);

        }

        else                                     //default message

        {

            g.drawString("No geometric shape has been selected. " +

                         "Please select a button.", 230, 290);

        }   

    }



} 





