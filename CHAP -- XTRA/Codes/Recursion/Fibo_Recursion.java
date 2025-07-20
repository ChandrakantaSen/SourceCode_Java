import java.io.*;
class Fibo_Recursion
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c,limit;
    Fibo_Recursion() //Constructor
    {
        a=0;
        b=1;
        c=0;
        limit=0;
    }

    void input()throws IOException //Function to input the limit
    {
        System.out.print("Enter the limit : ");
        limit=Integer.parseInt(br.readLine());
    }

    int fib(int n) //Recursive function generating the 'nth' term of Fibonacci Series
    {
        if(n<=1)
            return a;
        else if(n==2)
            return b;
        else
            return (fib(n-1)+fib(n-2));
    }

    void generate_fibseries() //Function generating all the Fibonacci Series numbers upto 'n' terms
    {
        System.out.println("The Fibonacci Series is:");
        for(int i=1;i<=limit;i++)
        {
            c=fib(i);
            System.out.print(c+"  ");
        }
    }

    public static void main(String args[])throws IOException
    {
        Fibo_Recursion ob=new Fibo_Recursion();
        ob.input();  
        ob.generate_fibseries();
    }
}