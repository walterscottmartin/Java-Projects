class Average
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int num, count = 0, sum = 0;
       double avg;
       
       while(true)
       {
           System.out.print("Your number please: ");
           num = sc.nextInt();
           if (num == 0) break;
           count += 1;          // count it
           sum += num;          // accumulate it
       }
       avg = (double)sum/count;
       if ( count > 0 )
       {
           System.out.println("\nNumber of numbers: " + count);
           System.out.println("Sum of numbers: " + sum);
           System.out.println("Average: " + avg);
       }
       else 
       {
           System.out.println("\nNo data entered");
       }

   }
}
