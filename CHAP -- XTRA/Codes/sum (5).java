import java.io.*;
class sum
{
    void sum()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c=0;
        System.out.println("Enter two numbers");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("sum="+c);
    }
    public static void main(String args[])throws IOException
    {
        sum ob=new sum();
        ob.sum();
    }
}