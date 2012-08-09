/*
 
 Author: W. Scott Martin
 Date  : 07/10/08
 Program Name: SuperLotto.java
 Objective: This program generates California Super Lottos based on
            the number received in the command line.
 
*/
 
import java.util.*;
 
class SuperLotto
{
   
   /******************************rand()*****************************/
   public static int rand(int a, int b)
   {
      return((int)((b-a+1)*Math.random() + a));
   }
   /****************************isNumber()***************************/
   public static boolean isNumber(String str)
   {
      if(str.isEmpty()) return(false);
      for(int i = 0; i < str.length(); i++)
          if(!Character.isDigit(str.charAt(i))) return(false);
      return(true);
   }
   /***************************genLottoNum()*************************/
   public static int[] genLottoNum()
   {
      int lotto[] = new int[5];
      int temp[] = new int[48];
      Arrays.fill(temp, 0);
      int n = 0, num;
      
      for(;;)
      {
         num = rand(1, 47);
         if(temp[num] == 0)
         {
            temp[num] = 1;
            lotto[n++] = num;
         }
         if(n == 5) break;
      }
      Arrays.sort(lotto);
      return(lotto);
    }
   /*******************************die()*****************************/
   public static void die(String errMsg)
   {
       System.err.println(errMsg);
       System.exit(1);
   }
   /******************************main()*****************************/
   public static void main(String args[])
   {
      if(args.length != 1) die("Usage: java SuperLotto any_number");
      if(!isNumber(args[0])) die("Error: Invalid number");
      int num = Integer.parseInt(args[0]);
      if(num == 0) die("");

      char letter = 'A';  
     
      System.out.println("                   Mega");
      System.out.println("------------------------");
      for(int i = 1; i <= num; i++)
      {
          System.out.printf("%c) ", letter++);
          for(int n : genLottoNum())
             System.out.printf("%02d ", n);
          System.out.printf("  %02d\n", rand(1, 27));
          if(i%10 == 0)
          {
             letter = 'A';
             System.out.println("\n"+ "                   Mega");
             System.out.println("------------------------");
          }
      }
 
   }
}
