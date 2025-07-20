import java.io.*;
class bkprg2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]={54,11,23,56,76,80};
int i;
System.out.println("The values in the array are as follows : -");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
    }
    System.out.println("The values in the array after reversing are as follows: -");
    for(i=6-1;i>=0;i--)
    {
        System.out.println(a[i]);
    }
}
    }
