/*
 
 Author: W. Scott Martin
 Date  : 07/04/08
 Program Name: Capitalize.java
 
*/
 
class Capitalize
{
//******************************capitalize()******************************
   public static String capitalize(String str)
   {
      return(Character.toUpperCase(str.charAt(0)) + str.substring(1));
   }

//*********************************main()*********************************
   public static void main(String args[])
   {
       System.out.println(capitalize("i like Java"));
       System.out.println(capitalize("susan"));
       System.out.println(capitalize("hello there"));
   }
}
