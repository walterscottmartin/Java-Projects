/*
 
 Author: W. Scott Martin 
 Date  :  07/28/08
 Program Name: TestUniq.java
 
*/
 
import java.util.*;
 
class TestUniq
{
   public static int rand(int a, int b)
   {
       return((int)((b - a + 1) * Math.random()) + a);
   }
   public static int [] lottoGen()
   {
       int num[] = new int[5];
       int n = 0, x;
       BitSet bs = new BitSet(48);

       for(;;)
       {
            x = rand(1, 47);
            if(bs.get(x) == false)
            {
                num[n++] = x;
                bs.set(x);
                if (n == 5) break;
            }
       }
       return(num);
   }
   
   public static void main(String args[])
  
   {
      int num[] = lottoGen();
      Arrays.sort(num);
      
      for(int n : num) System.out.print(n+" "); 
      System.out.println("   "+ rand(1,27));
   }
}
