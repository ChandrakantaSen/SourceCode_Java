package All;

import java.util.*;
class Triangular_number
{
    int n;
    Scanner sc=new Scanner(System.in);
    Triangular_number()
    {
        n=0;
    }
    void input()
    {
        System.out.println("Enter the upper range :-");
        n=sc.nextInt();
    }
    void display()
    {
        int k=2,num=0,i;
        while(true)
        {
            for(i=1;i<=k;i++)
            num+=i;
            if(num<=n)
            System.out.println(num);
            else
            break;
            k++;num=0;
        }
    }
    public static void main()
    {
        Triangular_number ob=new Triangular_number();
        ob.input();
        System.out.println("The triangular numbers in the input range are :"); 
        ob.display();
    }
}
            