/*
 
 Author: W. Scott Martin
 Date  : 07/04/08
 Program Name: Tail.java
 
*/
 
class Tail
{
//*********************************tail()*********************************
   public static void tail(int num[], int n)
   {
       for(int i = 0; i < n; i++)
          System.out.println( num[i + num.length - n] );
   }
  
//*********************************main()*********************************
   public static void main(String args[])
   {
       int num[] = {34, 18, 56, 82, 12, 9, 30, 75};
       tail(num, 4);
   }
}
