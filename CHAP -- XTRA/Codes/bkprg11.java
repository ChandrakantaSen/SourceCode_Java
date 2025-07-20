import java.io.*;
class bkprg11
{
public static void main(String args[])throws IOException
{
int i;
Double f[]=new Double[20];
Double c[]=new Double[20];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Farenheit values in the array : - ");
for(i=0;i<20;i++)
{
f[i]=Double.parseDouble(br.readLine());
    }
    System.out.println("The Farenheit values in the array are as follows: -");
for(i=0;i<20;i++)
{
System.out.println(f[i]);
    }
    for(i=0;i<20;i++)
{
        c[i]=(5*f[i]-160)/9;
    }
    System.out.println("The Farenheit values \t The Centigrade values ");
for(i=0;i<20;i++)
{
System.out.println("\t"+f[i]+"\t\t\t"+c[i]);
    }
}
    }
