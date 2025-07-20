import java.io.*;
public class Number
{
    void check()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<=9;i++)
        {
            System.out.print("Enter the number{f}:- ");
            int f=Integer.parseInt(br.readLine());
            int r=f*f*f;
            System.out.println("Cube of the "+f+" is = "+r+" .");
        }
    }
    public static void main(String args[])throws IOException
    {           
        Number ob=new Number();
        ob.check();
    }
}