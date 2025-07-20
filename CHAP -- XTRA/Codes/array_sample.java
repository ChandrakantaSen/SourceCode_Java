import java.io.*;
public class array_sample
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

int a[]={25,17,32,14,2};
int i=0;
System.out.println("The numbers in the arrays are as followed");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}
