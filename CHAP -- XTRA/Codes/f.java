import java.io.*;
class f
{
void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("n");
int n=Integer.parseInt(buf.readLine());
int a[]=new int[n];
int i,t,wc,lp;
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(buf.readLine());
}
for(wc=1;wc<n;wc++)
{
lp=0;
while(a[lp]<a[wc])
{
lp++;
}
t=a[wc];
for(i=wc-1;i>=lp;i--)
{
a[i+1]=a[i];
}
a[lp]=t;
}
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}

}
}
