import java.io.*;
class Auto_for
{
public static void main()throws IOException
{
 int i,n,m,d,c=0,c1=0,n1; 
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
n1=n*n;
for(m=n1;m>0;c++)
{
m=m/10;
}  
d=0;
if(c==2)
{
for(m=n1;m>0;c1++)
{
d=m%10;
if(c1==1)
{
break;
}
}
}
if(c==3)
{
for(m=n1;m>0;c1++)
{
d=m%100;
if(c1==1)
{
break;
}
}
}    
if(d==n)
{
System.out.println(n+" is an automorphic number . ");
}
else
{
System.out.println(n+" is not an automorphic number . ");
}
}
}

    