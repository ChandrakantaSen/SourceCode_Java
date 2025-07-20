import java.io.*;
class Fibonacci
{
    public void show(int p,int c,int n)
    {
        int next;
        if(n==0)
            return;
        next=p+c;
        System.out.print(" "+next);
        p=c;
        c=next;
        show(p,c,n-1);
    }

    public static void main(String args[])throws IOException
    {
        Fibonacci ob=new Fibonacci();
        int p=0,c=1,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of elements in the series:");
        n=Integer.parseInt(br.readLine());
        System.out.print("The Fibonacci series is= "+p+" "+c);
        ob.show(p,c,n-2);
    }
}