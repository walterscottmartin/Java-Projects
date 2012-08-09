/*

Author: W. Scott Martin
Date  : 07/16/08
Program Name: Arrays.java


*/

import java.util.*;

class Arrays
{
//*******************************display()********************************
    public static void display(int num[])
    {
        for(int n : num) System.out.print(n + " ");
        System.out.println();
    }
//*******************************reverse()********************************
    public static int[] reverse(int num[])
    {
        int n = num.length;
        int temp[] = new int[n];
        
        for(int i = 0; i < n; i++) temp[n - i - 1] = num[i];
        return(temp);
    }
//*******************************smallest()*******************************
    public static int smallest(int num[])
    {
        int s = num[0];
        for(int n : num) if(n < s) s = n;
        return(s);
    }
//*******************************largest()********************************
    public static int largest(int num[])
    {
        int L = num[0];
        for(int n : num) if(n > L) L = n;
        return(L);
    }
//*********************************avg()**********************************
    public static double avg(int num[])
    {
        int sum = 0;
        for(int n :  num)  sum += n;
        return((double)sum/num.length);
    }
    
//*********************************main()*********************************
    public static void main(String args[])
    {
        int num[] = { 45, 23, 56, 16, 9, 23, 14, 32 };
        
        System.out.println("The array is:");
        display(num);
        
        System.out.println("The largest number is: " + largest(num));
        System.out.println("The smallest number is: " + smallest(num));
        System.out.println("The reverse of the array is:");
        for(int n : reverse(num)) System.out.print(n + " ");
        System.out.println();
        System.out.printf("The average is: %.2f\n", avg(num));
        
    }
}
