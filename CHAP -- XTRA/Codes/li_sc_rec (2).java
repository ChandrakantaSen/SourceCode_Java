import java.io.*;
class li_sc_rec
{int i=0,n;
public void liSc(int sc,int b[])
{
if(b[i]==sc)
return;
else if(i==n)
return;
else
{
i++;
liSc(sc,b);
}
    }
public void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter size of array");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("enter elements of array");
for(int j=0;j<n;j++)
{
a[j]=Integer.parseInt(br.readLine());
    }
System.out.println("enter no to search");
int sc=Integer.parseInt(br.readLine());
liSc(sc,a);
if(i<n-1)
System.out.println("no found at pos "+(i+1));
else
System.out.println("no not found");
    }
}