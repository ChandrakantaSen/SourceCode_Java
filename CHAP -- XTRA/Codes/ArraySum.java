import java.io.*;
class ArraySum
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[10],sum=0;
        System.out.println("num dalo");
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            sum=sum+a[i];
            
        }
        System.out.print(sum);
    }
}
            