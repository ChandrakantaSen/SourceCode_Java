import java.io.*;
class prime_nested
{
static int i,n,count,j; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  range : - ");
n=Integer.parseInt(br.readLine());
    } 

public static void primeshow()
{
System.out.println("Prime number are as follows :- ");
for(i=2;i<=n;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
            if(i%j==0)
            {
                count++;
            }
        }
            if(count==2)
        {
            System.out.println(i);
}
    }
}
    public static void main()throws IOException
    {
        prime_nested ob=new prime_nested();
        ob.input();
        ob.primeshow();
        }
    }
  
        
  