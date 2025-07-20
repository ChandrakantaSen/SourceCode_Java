import java.util.*; //Importing Utilization package
class palindrome_range //Declaring class
{
    static void main() //Main method
    {
        Scanner sc=new Scanner(System.in);
        palindrome_range ob=new palindrome_range();
        System.out.println("Enter the lower limit and then upper limit :-");
        int low=sc.nextInt();
        int up=sc.nextInt();
        System.out.println("The palindrome numbers in the given range are :-");
        for(int i=low;i<=up;i++)
        {
            if(ob.IsPalindrome(i))
            System.out.println(i);
        }
    }
    boolean IsPalindrome(int x) //To check whether a number is palindrome or not
    {
        int rev=0,copy=x;
        while(copy!=0)
        {
            rev=(rev*10)+(copy%10);
            copy=copy/10;
        }
        if(rev==x)
        return true;
        return false;
    }
}
