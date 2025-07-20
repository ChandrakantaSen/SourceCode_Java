import java.io.*;
class even_odd
{
    void even_odd()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.println("Enter  numbers");
        a=Integer.parseInt(br.readLine());
        if(a%2==0)
        {
        System.out.println("Number is even");
        }
        else
        {
         System.out.println("Number is odd");
        }
    }
    public static void main(String args[])throws IOException
    {
        even_odd ob=new even_odd();
        ob.even_odd();
    }
   }