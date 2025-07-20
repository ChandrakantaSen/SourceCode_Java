import java.io.*;
class array0
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i;
int a[]=new int[5];
System.out.println("Enter the values in the array");
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("The values in the array are as follows");
 for(i=0;i<5;i++)
{
System.out.println(a[i]);
    }
}
    }