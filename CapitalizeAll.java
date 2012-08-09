/*
 
 Author: W. Scott Martin
 Date  : 07/05/08
 Program Name: CapitalizeAll.java
 
*/
 
class CapitalizeAll
{
   public static String capitalizeAll(String str)
   {
      if(str.isEmpty()) return(str);
      String sum = "";
      char c;
      boolean wasSpaceBefore = true;
      str = str.toLowerCase();

      for(int i = 0; i < str.length(); i++)
      {
         c = str.charAt(i);
         if(Character.isWhitespace(c)) wasSpaceBefore = true;
         else if(Character.isLowerCase(c) && wasSpaceBefore)
         {
            c = Character.toUpperCase(c);
            wasSpaceBefore = false;
         }
         sum += c;
      }
      return(sum);
   }

   public static void main(String args[])
   {
        String text = "i   like   this program very much";
        System.out.println(capitalizeAll(text));
   }
}
