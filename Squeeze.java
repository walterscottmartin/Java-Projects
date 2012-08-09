/*
 
 Author: W. Scott Martin
 Date  : 07/05/08
 Program Name: Squeeze.java
 
*/
 
class DemoSqueeze
{
//*******************************squeeze()********************************
   public static String squeeze(String str)
   {
      if(str.isEmpty()) return(str);

      boolean le = (str.charAt(0) == ' ');   //leading spaces?
      boolean te = (str.charAt(str.length() - 1) == ' '); //trailing spaces?
      String s[] = str.trim().split("\\s+");
      String sum = "";
      
      for(String t : s) sum += t+' ';
      sum = sum.trim();    // remove the last trailing space

      if(le) sum = " " + sum;
      if(te) sum += " ";
      return(sum);
   }

//*********************************main()*********************************
   public static void main(String args[])
   {
       String text = "I   saw her  today at   the      gym";
       System.out.println("\""+squeeze(text)+"\""); 
   }
}
