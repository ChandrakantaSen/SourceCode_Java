import java.io.*;
public class array_sample2
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i=0;
int a[]=new int[5];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers in the arrays are as followed");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
}
}

