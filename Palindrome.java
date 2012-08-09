/*
 
 Author: W. Scott Martin
 Date  : 07/01/08
 Program Name: Palindrome.java
 Objective: This program gets a string interactively and checks if it
            is a palindrome or not.  
*/
 
import java.util.*;
 
class Palindrome
{
//********************************filter()********************************
   public static String filter(String str)
   {
       char c;
       String s = "";

       str = str.toLowerCase();
       
       for(int i = 0; i < str.length(); i++)
       {
           c = str.charAt(i);
           if(Character.isLetterOrDigit(c)) s += c;
       }
       return(s);
   }
   
//*******************************reverse()********************************
   public static String reverse(String str)
   {
      String s = "";

      for(int i = str.length() - 1; i >= 0; i--)
         s += str.charAt(i);

      return(s);
   }

//*********************************main()*********************************
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        String str, str1, status;

        for(;;)
        {
            System.out.print("your palindrome: ");
            str = sc.nextLine();
            if(str.isEmpty())
            {
                System.out.println("Empty string, retype again");
                continue;
            }
            if(str.equalsIgnoreCase("quit")) System.exit(0);
            
            str1 = filter(str);
            status = str1.equals(reverse(str1)) ? " is " : " is not ";
            System.out.println("\""+str+"\"" + status + "a palindrome");
        }
   }
}
