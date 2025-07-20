import java.io.*;
class bkprg10
{
public static void main(String args[])throws IOException
{
int i,c=0;
int a[]=new int[5];
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the values in the array : - ");
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
System.out.println("The values in the array are as follows: -");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
    }
    for(i=0;i<5-1;i++)
    {
    if(a[i]+1==a[i+1])
    {
        c++;
    }
}
System.out.println("Numbers of consecutive no.s present in the array is "+c);
}
    }