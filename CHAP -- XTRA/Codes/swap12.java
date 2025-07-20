import java.io.*;
class swap12
{
    void swap1()throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c=0;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(r.readLine());
        b=Integer.parseInt(r.readLine());
        c=a+b;
        a=b;
        b=c-a;
        System.out.println("after swaping number is");
        System.out.print(a+" "+b);
    }
    public static void main(String args[])throws IOException
    {
        swap12 ob=new swap12();
        ob.swap1();
    }
}
        