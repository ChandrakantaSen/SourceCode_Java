import java.io.*;
public class b_search
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,j,lb,ub,p,k,ns,t,n;lb=0;ub=0;p=0;ns=0;t=0;k=0;
System.out.println("Enter the size of the arrays");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the numbers in the arrays");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("The numbers in the arrays are as followed");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("The no in the arrays after bubble sort are as follows");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
while (lb<=ub)
{
p=(lb+ub)/2;
if(a[p]<ns)
lb=p+1;
if(a[p]>ns)
lb=p-1;
if(a[p]==ns)
{
k=1;
break;
}
if(k==1)
System.out.println("Search succesful");
else
System.out.println("Search unsuccesful");
}
}
}


