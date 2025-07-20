import java.io.*;
class bkprg1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int a[]={23,31,44,56,72,55};
int i,s=0,t;
System.out.println("the values in the array are as follows: -");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
     s=s+a[i];
    }
    System.out.println("The sum of the numbers in the array is "+s);
    t=s/6;
        System.out.println("Average is "+t);
}
}