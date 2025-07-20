import java.io.*;
class oefor
{
public static void main(String args[])throws IOException
{
int i,n,se=0,so=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
if(i%2==0)
{
se=se+i;

    }
    else
    {
        so=so+i;
    }

    }
    System.out.println("The sum of the even no. upto"+n+"are"+se);
    System.out.println("The sum of the odd no. upto"+n+"are"+so);    
}

}