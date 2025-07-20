import java.util.*; //Importing Utilization package
class Prime_range //Declaring class
{
    static void main() //Main method
    {
        Scanner sc=new Scanner(System.in);
        Prime_range ob=new Prime_range();
        System.out.println("Enter the lower limit and then upper limit :-");
        int low=sc.nextInt();
        int up=sc.nextInt();
        System.out.println("The prime numbers in the given range are :-");
        for(int i=low;i<=up;i++)
        {
            if(ob.IsPrime(i))
            System.out.println(i);
        }
    }
    boolean IsPrime(int x) //To check whether a number is prime or not
    {
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            return false;
        }
        return true;
    }
}