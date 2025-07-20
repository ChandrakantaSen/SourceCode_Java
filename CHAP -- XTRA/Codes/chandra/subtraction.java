import java.io.*;
class subtraction
{
    public static void main(String args[])throws IOException
    {
        int a,b,c;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1:");
        a = Integer.parseInt(in.readLine());
        System.out.println("Enter number 2:");
        b = Integer.parseInt(in.readLine());
        
        c = (a-b);
        System.out.println("Sum is: "+c);
    }
}