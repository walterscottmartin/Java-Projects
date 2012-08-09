/*
 
 Author: W. Scott Martin
 Date  : 06/25/08
 Program Name: ValidSSnum.java
 
*/
 
import java.util.*;
 
class ValidSSnum
{
//*********************************prl()**********************************
   public static void prl(String str)
   {
       System.out.println(str);
   }
//**********************************pr()**********************************
   public static void pr(String str)
   {
       System.out.print(str);
   }
//*********************************die()**********************************
   public static void die(String errmsg)
   {
       System.out.println(errmsg);
       System.exit(1);
   }
//*******************************isNumber()*******************************
   public static boolean isNumber(String str)
   {
       char c;

       for(int i = 0; i < str.length(); i++)
       {
          c = str.charAt(i);
          if ( c >= '0' && c <= '9') continue;
          return(false);
       }
       return(true);
   }         

//*********************************main()*********************************
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       String ssnum;
     
       for(;;)
       {
           pr("Please type in your ssnum: ");
           ssnum = sc.nextLine();
           if(ssnum.equalsIgnoreCase("quit")) System.exit(0);
           if(ssnum.length() != 11)
           {
               prl("Error: ssnum should be 11 chars.");
               continue;
           }
           if(ssnum.charAt(3) != '-' || ssnum.charAt(6) != '-')
           {
               prl("Error: missing dashes");
               continue;
           }
           if(isNumber(ssnum.substring(0,3)) &&
              isNumber(ssnum.substring(4,6)) &&
              isNumber(ssnum.substring(7)))
                 prl("ssnum is valid");
           else
                 prl("Error: ssnum need to be digits");
       } 
      
   }
}
