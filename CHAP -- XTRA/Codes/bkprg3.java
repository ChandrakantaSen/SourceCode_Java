import java.io.*;
class bkprg3
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]={63,38,14,50,92,25};
int i,j,t;
System.out.println("The values in the array are as follows :-");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
for(i=1;i<6;i++)
{
for(j=0;j<6-1;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
    }
}
    }
    System.out.println("The values in the array after sorting are as follows : - ");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
System.out.println("The Greatest no. in the array is "+a[6-1]);
    }
}