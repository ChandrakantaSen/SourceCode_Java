import java.io.*;
public class Sfactfa
{
    void Sfact(int n,int m)
    {
        double s=0,s1=0,s2=0,s3=0,f=1;
        for(int g=1;g<=n;g++)
        {
            for(int i=1;i<=g;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    f=f*i;
                }
                s1=s1+i/f;
            }
        }
        for(int g=1;g<=m;g++)
        {
            for(int i=1;i<=g;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    f=f*i;
                }
                s2=s2+i/f;
            }
        }
        for(int g=1;g<=n-m;g++)
        {
            for(int i=1;i<=g;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    f=f*i;
                }
                s3=s3+i/f;
            }
        }
        s=(s1)/(s2*s3);
        System.out.print("S = (n!)/(m!*(n-m)!) = "+s);
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int g,h,i;
        System.out.print("Enter the number{n}:- ");
        g=Integer.parseInt(br.readLine());
        System.out.print("Enter the number{m}:- ");
        h=Integer.parseInt(br.readLine());
        Sfactfa ob=new Sfactfa();
        ob.Sfact(g,h);
    }
}