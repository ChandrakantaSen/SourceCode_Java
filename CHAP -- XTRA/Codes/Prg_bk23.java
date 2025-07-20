import java.io.*;
class Prg_bk23
{
public static void main(String args[])throws IOException
{
int i=1,n;
double c=15;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the weight:-");
n=Integer.parseInt(br.readLine());
if(n<=1)
{
c=15;
    }
    else
    {
        for(i=2;i<=n;i++)
        {
c=c+(8*2);
    }
   
}
System.out.println("The amt. of the parcel is" +c);
    }
}