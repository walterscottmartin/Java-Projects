/*
 
 Author: W. Scott Martin 
 Date  : 07/29/08
 Program Name: ToString.java
 
 This program demos the effect of toString() in any class. 

*/

///////////////////////////////////////////////////////////////////////////
class Nums
{
   public int x, y;
   public Nums(int n1, int n2)
   {
      x = n1;
      y = n2;
   }
   public String toString()
   {
      return("( x = " + x + ", y = " + y + " )");
   }
}
///////////////////////////////////////////////////////////////////////////
public class ToString
{
   public static void main(String args[])
   {
        Nums n = new Nums(6, 8);

        System.out.println(n);
        String k = "z = " + n;
        System.out.println(k);

   }
   
}
