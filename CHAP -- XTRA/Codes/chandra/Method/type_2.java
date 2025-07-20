package Method;

/*
 * With return type, no parameter
 */
import java.io.*;

class type_2
{
    int add()throws IOException
    {
        int a,b,c;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number 1: ");
        a = Integer.parseInt(in.readLine());
        
        System.out.println("Enter number 2: ");
        b = Integer.parseInt(in.readLine());
        
        c=(a+b);
        
        return c;
    }
    
    public static void main(String args[])throws IOException
    {
        int z;
      
        type_2 obj = new type_2();  //object creation
        
        z = obj.add();
        
        System.out.println("Sum is: "+z);
    }
}