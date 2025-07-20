import java.io.*;
class u
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());   
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=i;j++)
        { 
            int h=j%2;
            System.out.print(h);
            
        }
        System.out.println(" ");
    }
}
}