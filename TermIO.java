/* Author:  W. Scott Martin */

interface TermAttr
{
     public String CLS     = "\033[2J";
     public String GOTO1_1 = "\033[1;1H";
     public String BOLD    = "\033[1m";
     public String BLINK   = "\033[5m";
     public String REVERSE = "\033[30m";
     public String EXTRA   = "\033[47m"; //black & white;
     public String REVERSE1= "\033[7m";  //color;
     public String ITALICS = "\033[2m";
     public String RESET   = "\033[0m";
     public String INVIS   = "\033[8m";
     //#******************** ForGround Colors *********************** 
     public String FBLACK  = "\033[30m";
     public String FRED    = "\033[31m";
     public String FGREEN  = "\033[32m";
     public String FYELLOW = "\033[33m";
     public String FBLUE   = "\033[34m";
     public String FMAGENTA= "\033[35m";
     public String FCYAN   = "\033[36m";
     public String FWHITE  = "\033[37m";
     //#******************** BackGround Colors ***********************
     public String BBLACK  = "\033[40m";
     public String BRED    = "\033[41m";
     public String BGREEN  = "\033[42m";
     public String BYELLOW = "\033[43m";
     public String BBLUE   = "\033[44m";
     public String BMAGENTA= "\033[45m";
     public String BCYAN   = "\033[46m";
     public String BWHITE  = "\033[47m";
}
//////////////////////////////////////////////////////////////////////
class TermIO implements TermAttr
{
/********************************cls()*******************************/
   public static void cls()
   {
        System.out.print(CLS);
        System.out.print(GOTO1_1);
   }
/********************************bold()*******************************/
   public static void bold()
   {
        System.out.print(BOLD);
   }
/********************************blink()*******************************/
   public static void blink()
   {
        System.out.print(BLINK);
   }
/********************************reverse()*******************************/
   public static void reverse()
   {
        System.out.print(REVERSE);
        System.out.print(EXTRA);
   }
/********************************reverse1()*******************************/
   public static void reverse1()
   {
        System.out.print(REVERSE1);
   }
/********************************italics()*******************************/
   public static void italics()
   {
        System.out.print(ITALICS);
   }
/********************************reset()*******************************/
   public static void reset()
   {
        System.out.print(RESET);
   }
/********************************invis()*******************************/
   public static void invis()
   {
        System.out.print(INVIS);
   }
/********************************fblack()*******************************/
   public static void fblack()
   {
        System.out.print(FBLACK);
   }
/********************************fred()*******************************/
   public static void fred()
   {
        System.out.print(FRED);
   }
/********************************fgreen()*******************************/
   public static void fgreen()
   {
        System.out.print(FGREEN);
   }
/********************************fyellow()*******************************/
   public static void fyellow()
   {
        System.out.print(FYELLOW);
   }
/********************************fblue()*******************************/
   public static void fblue()
   {
        System.out.print(FBLUE);
   }
/********************************fmagenta()*******************************/
   public static void fmagenta()
   {
        System.out.print(FMAGENTA);
   }
/********************************fcyan()*******************************/
   public static void fcyan()
   {
        System.out.print(FCYAN);
   }
/********************************fwhite()*******************************/
   public static void fwhite()
   {
        System.out.print(FWHITE);
   }
/********************************bblack()*******************************/
   public static void bblack()
   {
        System.out.print(BBLACK);
   }
/********************************bred()*******************************/
   public static void bred()
   {
        System.out.print(BRED);
   }
/********************************bgreen()*******************************/
   public static void bgreen()
   {
        System.out.print(BGREEN);
   }
/********************************byellow()*******************************/
   public static void byellow()
   {
        System.out.print(BYELLOW);
   }
/********************************bblue()*******************************/
   public static void bblue()
   {
        System.out.print(BBLUE);
   }
/********************************bmagenta()*******************************/
   public static void bmagenta()
   {
        System.out.print(BMAGENTA);
   }
/********************************bcyan()*******************************/
   public static void bcyan()
   {
        System.out.print(BCYAN);
   }
/*******************************bwhite()*******************************/
   public static void bwhite()
   {
        System.out.print(BWHITE);
   }
/********************************locate()*******************************/
   public static void locate(int row, int col)
   {
           System.out.print("\033["+row+";"+col+"H");
   }
/********************************box()*********************************/
   public static void box(int r1, int c1, int r2, int c2, char c)
   {
       int i;
       int z = c2 - c1 + 1;
       String line="";
       for (i = 1; i <= z; i++)
       {
           line += c;
       } 
       locate(r1, c1); System.out.print(line);
       locate(r2, c1); System.out.print(line);
       i = r1 + 1;
       while ( i < r2 )
       {
           locate(i, c1); System.out.print(c);
           locate(i, c2); System.out.print(c);
           i++;
       }
  }
}   
/////////////////////////////////////////////////////////////////////
/*  THIS IS JUST A TEST, SHOWING HOW TO USE THE TermIO CLASS  */
//class toot extends TermIO
//{
//    public static void main(String a[])
//    {
//         cls();
//         box(1,34,14,66, '*');
//         locate(3, 36);
//         bold();
//         System.out.println("Abbas in bold");
//         locate(4, 36);
//         reset();
//         System.out.println("This is normal");
//         fred();
//         locate(5, 36);
//         System.out.println("This is in red");
//         reset();
//         fgreen();
//         locate(6, 36);
//         System.out.println("This is in green");
//         reset();
//         fyellow();
//         locate(7, 36);
//         System.out.println("This is in yellow");
//         reset();
//         fblue();
//         locate(8, 36);
//         System.out.println("This is in blue");
//         reset();
//         fmagenta();
//         locate(9, 36);
//         System.out.println("This is in magenta");
//         reset();
//         fcyan();
//         locate(10, 36);
//         System.out.println("This is in cyan");
//         reset();
//         fwhite();
//         locate(11, 36);
//         System.out.println("This is in white");
//         reset();
//         blink();
//         fmagenta();
//         bwhite();
//         locate(12, 36);
//         System.out.println("This is magenta on white");
//         locate(23,1);
//         reset();
//         System.out.println();
//    }
//}
