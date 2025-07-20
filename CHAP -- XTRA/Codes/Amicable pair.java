/*Question 70 : Write a program in Java to check whether two numbers are amicable or not.

Amicable Number : If two numbers are such that the sum of the perfect divisors of one number is equal to the other number and the sum of the perfect divisors of  the other number is equal to the first number, then the numbers are called Amicable Numbers.

Example : 220 and 284.
*/

class amicable
{
 static int a,b;
 static void input(int m,int n)
 {
     a=m;
     b=n;
     display();
    }
    static boolean check()
    {
        int s=0,i;
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s=s+i;
            }
        }
        if(s==b)
        {
            s=0;
            for(i=1;i<b;i++)
            {
                if(b%i==0)
                {
                    s=s+i;
                }
            }
            if(s==a)
            return true;
            else
            return false;
        }
        return false;
    }
    static void display()
    {
        if(check())
        System.out.print("The numbers are amicable");
        else
        System.out.print("The numbers are not amicable");
}
} 