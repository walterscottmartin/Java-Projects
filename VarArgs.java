/*
 
 Author:  W. Scott Martin
 Date  :  07/23/08
 Program Name: VarArgs.java
 
*/
 
class VarArgs
{
   public static double avg(double... num)
   {
      double sum = 0.0;
      for(double n : num) sum += n;
      return(sum/num.length);
   }
   public static void main(String args[])
   {
       System.out.println("average="+avg(3,4,5,6,7,8)) ;
       System.out.println("average="+avg(3,4,5,6,7)) ;
       System.out.println("average="+avg(3,4,5,6)) ;
       System.out.println("average="+avg(3,4,5)) ;
       System.out.println("average="+avg(3,4)) ;
       System.out.println("average="+avg(3)) ;
       System.out.println("average="+avg()) ;
   }
}
