/**
 * Given two positive numbers M and N,
 * such that M is between 100 and 10000 and N is less than 100. 
 * Find the smallest integer that is greater than M and whose digits add (SUM OF DIGITS) up to N.
 *
 * Write a program to accept the numbers M and N from the user
 * and print the smallest required number whose sum of all its digits is equal to N.
 * Also, print the total number of digits present in the required number. 
 * 
 * INPUT  : 
 * M = 100     N = 11
 * 
 * OUTPUT : 
 * The required number = 119
 * Total number of digits = 3
 **/

import java.util.*;

class Smallest_Integer_ISC2015
{
    int sumDig(long n) // Function to find sum of digits of a number
    {
        int sum = 0, d;
        while(n>0)
        {
            d = (int)(n%10);
            sum = sum + d;
            n = n/10;
        }
        return sum;
    }

    int countDig(long n) // Function to count the number of digits in a number
    {
        String s = Long.toString(n);
        int len = s.length();
        return len;
    }

    public static void main()throws Exception
    {
        Smallest_Integer_ISC2015 ob = new Smallest_Integer_ISC2015();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of 'm' from 100 to 10000 : ");
        int m = sc.nextInt();
        System.out.print("Enter a value of n from 1 to 99 : ");
        int n = sc.nextInt();

        if(m<100 || m>10000 || n<1 || n>99)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            long i = (long)m; // Required number can be out of range of 'int'

            while(ob.sumDig(i)!=n) 
            {
                i=i+1;
            }
            System.out.println("The required number = "+i);
            System.out.println("Total number of digits = "+ob.countDig(i));
        }
    }
}
