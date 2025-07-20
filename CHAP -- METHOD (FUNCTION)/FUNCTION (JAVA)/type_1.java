/*
 * With return type, with parameter
 */
import java.io.*;
class type_1
{
    int add(int a,int b)
    {
        int c;
        c=(a+b);
        return c;
    }
    
    public static void main(String args[])throws IOException
    {
        int x,y,z;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        x = Integer.parseInt(in.readLine());
        
        System.out.println("Enter number 2: ");
        y = Integer.parseInt(in.readLine());
        
        type_1 obj = new type_1();  //object creation
        
        z = obj.add(x,y);
        
        System.out.println("Sum is: "+z);
    }
}