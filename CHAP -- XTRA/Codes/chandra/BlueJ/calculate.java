import java.io.*;

public class calculate
{
    int m,n,s,d;
    public void inputdata()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("enter first number:");
        m= Integer.parseInt(in.readLine());
        System.out.println("enter second number:");
        n= Integer.parseInt(in.readLine());
    }
    
    public void calculate()
    {
        s = m+n;
        d = m-n;
    }
    
    public void outputdata()
    {
        System.out.println("sum of two number:"+s);
        System.out.println("difference of two number:"+d);
    }
}