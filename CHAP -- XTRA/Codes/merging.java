import java.io.*;
class merging
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,j;
int a[]=new int[10];
int b[]=new int[10];
System.out.println("Enter the values in the first array");
for(i=0;i<10;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the first array are as  follows");
for(i=0;i<10;i++)
{
System.out.println(a[i]);
}
System.out.println("Enter the values in the second array");
for(i=0;i<10;i++)
{
b[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the second array are as  follows");
for(i=0;i<10;i++)
{
System.out.println(b[i]);
}
int M[]=new int[20];
i=0;
while(i<20)
{
for(j=0;j<10;j++)
{
M[i]=a[j];
i++;
    }
for(j=0;j<10;j++)
{
M[i]=b[j];
i++;
    }
}
    }
}