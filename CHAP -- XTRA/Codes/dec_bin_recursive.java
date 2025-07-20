import java.io.*;
public class dec_bin_recursive
{
static int dec(int n)
{
if(n<2)
return n;
return( (n%2)+(10*dec(n/2)));
    
    }

public static void main( String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
   System.out.println("enter a decimal no.");
   int m=Integer.parseInt(br.readLine());
   int d=0;
   d=dec(m);
   System.out.println(d);
}
    }