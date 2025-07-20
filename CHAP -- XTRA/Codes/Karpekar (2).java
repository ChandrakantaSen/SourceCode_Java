import java.io.*;
class Karpekar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,m,d,s;
        System.out.println("Enter a number of your choice :   ");
        n=Integer.parseInt(br.readLine());
        m=n;
        d=1;
        s=n*n;
        while(m>0)
        {
            d=d*10;
            m=m/10;
        }
        if((s%d)+(s/d)==n)
        {
            System.out.println(n+"  is a karpekar number ");
        }
        else
        {
            System.out.println(n+"  is not a karpekar number ");
        }
    }
}