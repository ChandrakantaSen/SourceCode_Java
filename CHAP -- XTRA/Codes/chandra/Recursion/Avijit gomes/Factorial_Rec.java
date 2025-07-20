import java.io.*;
public class FactorialRecursion
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int num=0;  
    void input()throws Exception
    {
        System.out.print("Enter the Number to get the Factorial : ");
        num=Integer.parseInt(br.readLine());
    }    
    int factorial(int n)
    {
        if((n==1)||(n==0))
            return 1;
        else
            return (n*factorial(n-1));
    }  
    public static void main(String args[])throws Exception
    {
        FactorialRecursion obj=new FactorialRecursion();
        obj.input();
        int result=obj.factorial(num);
        System.out.println("\nThe Factorial of "+num+" is : "+result);
    }
}