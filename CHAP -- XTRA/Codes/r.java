import java.io.*;
class r
{
 
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());int s=0;
        for(int i=1;i<=x/2;i++)
        {
            if(x%i==0)
             s+=i;
            }
             if(x==s)
             System.out.println("it is perfect no.");
             else
             System.out.println("it is  not perfect no.");
            }
        }
    