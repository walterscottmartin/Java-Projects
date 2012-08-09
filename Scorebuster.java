import java.util.*;
class Scorebuster
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        String name, totalstudents;
        int score = 0, count = 0;
        
        for (;;)
        {

        System.out.print("Please enter the name? :");
        name = sc.nextLine();
        //This is my first exit code
        if(name.equalsIgnoreCase("Quit"))break;
        
        System.out.print("Please enter score: ");
        score = sc.nextInt();
        sc.nextLine();
        //This is my second exit code
        if(score==999)break;
        else
        {
       

     if (score>=90)System.out.println(name + " got an A");
     if(score>=80&&score<90)System.out.println(name + " got a B");
     if(score>=70&&score<80)System.out.println(name + " got a C");
     if(score>=60&&score<70)System.out.println(name + " got a D");
     if(score<60)           System.out.println(name + " got an F");        
     count++;
        }
        }
        totalstudents = count + " students";
        System.out.print(totalstudents);
    }
}
