import java.io.*;
class bk
{
public static void main(String args[])throws IOException
{
int i,so=0,se=0,sn=0;
BufferedReader bk=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no.");
i=Integer.parseInt(bk.readLine());
while(i!=0)
{
if(i<0)
{
sn=sn+i;
    }
    else if(i%2==0)
    {
        se=se+i;
    }
    else if(i%2==1)
    {
        so=so+i;
    }
    System.out.println("Enter any no.");
    i=Integer.parseInt(bk.readLine());
}
System.out.println("The sum of even no :"+se);
System.out.println("The sum of odd no. :"+so);
System.out.println("The sum of negative no. :"+sn);
    }
}
