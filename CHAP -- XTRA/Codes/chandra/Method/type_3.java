package Method;

/*
 * Without return type, with parameter
 */
import java.io.*;

class type_3
{
    void add(int a,int b)
    {
        int c;
        c=(a+b);
        System.out.println("Sum is: "+c);
    }

    public static void main(String args[])throws IOException
    {
        int x,y;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        x = Integer.parseInt(in.readLine());

        System.out.println("Enter number 2: ");
        y = Integer.parseInt(in.readLine());

        type_3 obj = new type_3();  //object creation

        obj.add(x,y); 
    }
}