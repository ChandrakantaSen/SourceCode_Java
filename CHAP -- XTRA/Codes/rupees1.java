import java.io.*;
public class rupees1
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n,i,t,f,h,y,o,g,u,r;t=0;f=0;h=0;y=0;o=0;g=0;u=0;r=0;
int t1,f1,h1,y1,o1,g1,u1,r1;t1=0;f1=0;h1=0;y1=0;o1=0;g1=0;u1=0;r1=0;
System.out.println("Enter the amount");
n=Integer.parseInt(br.readLine());
for(i=0;i<=n;i++)
{
t=n/1000;
t1=n%1000;
f=t1/500;
f1=t1%500;
h=f1/100;
h1=f1%100;
y=h1/50;
y1=h1%50;
g=y1/20;
g1=y1%20;
u=g1/10;
u1=g1%10;
r=u1/1;
r1=u1%1;
}
System.out.println(t+" * 1000");
System.out.println(f+" * 500");
System.out.println(h+" * 100");
System.out.println(y+" * 50");
System.out.println(g+" * 20");
System.out.println(u+" * 10");
System.out.println(r+" * 1");
}
}
