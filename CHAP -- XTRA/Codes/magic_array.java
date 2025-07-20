import java.io.*;
class magic_array
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,m,d,s=0,n;
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array : - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The values in the array are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("The magic no.s in the array are as follows:-");
for(i=0;i<n;i++)
{
m=a[i];
s=0;
while(m>9)
{
s=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s>9)
    {
        m=s;
    }
}
        if(s==1)
        {
            System.out.println(a[i]);
        }
    }
    }
}

