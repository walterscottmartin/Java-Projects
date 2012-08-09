class Homework
{
    public static void main(String args []) 
    {
        Scanner sc = new Scanner(System.in);
        int score;
        
        
        while (true)
        {
            System.out.println ("What is the score :");
            score = sc.nextString();
            if (80 >= score <= 90)
            System.out.println("You got an A");
            else System.out.println ("You suck");
            System.exit (0);
            
        
        }
    }
}