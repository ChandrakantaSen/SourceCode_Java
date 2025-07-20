import java.util.Scanner;

class Happy_Recursion
{
    public static int n;
    Happy_Recursion()  //constructor
    {
        n=0;
    }

    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Happy_Recursion ob=new Happy_Recursion();
        System.out.println("Enetr a number");
        n=in.nextInt();
        ob.getnum(n);  
        ob.ishappy();
    }

    public void getnum(int nn)  
    {
        n=nn;
    }

    public void ishappy() //check if number is Happy Number
    {
        int a=n;
        while(a>9)
        {
            a=sum_sq_digits(a);
        }
        if(a==1)
            System.out.println(n+" is a Happy Number");
        else
            System.out.println(n+" is not a Happy Number");
    }

    public int sum_sq_digits(int x) 
    {                               
        if(x==0)
            return 0;
        else   
        {
            int d=x%10;
            return (d*d+sum_sq_digits(x/10));
        }  
    }  
} 