import java.util.*;
class rev_rec
{
    static int rev(int n,int r)
    {
        if(n==0)
        {
            return r;
        }
        else
        {
            r=r*10+n%10;
            return (rev(n/10,r));
        }
    }
    static void main()
    {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        num = sc.nextInt();
        
        sum = rev(num,0);
        System.out.println("Reverse of digit is: "+sum);
    }
}