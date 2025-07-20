import java.io.*;
class String_array
{
public static void main(String args[])throws IOException
{
int i,j,n;
String t;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the values in the array : - ");
String a[]=new String[n];
for(i=0;i<n;i++)
{
a[i]=br.readLine();
}
System.out.println("The values in the array are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i].length()>a[j].length())
{
t=a[i];
a[i]=a[j];
a[j]=t;
    }
}
    }
System.out.println("The values in the array after String array sorting are as folows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i].length());
}
}
    }
