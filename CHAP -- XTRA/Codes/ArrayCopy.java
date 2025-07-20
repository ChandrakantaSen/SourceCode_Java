import java.io.*;
class ArrayCopy
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("num dallo");
            a[i]=Integer.parseInt(br.readLine());
        }
        
        for(int i=0;i<5;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }
    }
}
        