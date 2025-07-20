import java.io.*;
class string_len
{
public static void main(String args[])throws IOException
{
int t=0,k;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter the size of the array");
int m=Integer.parseInt(br.readLine());
String a[]=new String[m];
int b[]=new int [m];
for(int i=0;i<m;i++)
{
System.out.println("enter name:");
a[i]=br.readLine();
b[i]=a[i].length();
    }
    for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(b[j]>b[i])
                {
                    t=b[j];
                    b[j]=b[i];
                    for(k=i;k>j;k--)
                    {
                    b[k]=b[k-1];
                }
                    b[k+1]=t;
                    }
                }
        }
        for(int x=0;x<m;x++)
        {
        System.out.println(a[x]+" "+b[x]);
    }
}}
