import java.io.*;
class string1
{
void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String s,k="",g="",p="",k1="";
int l,i,c=0,w=0,t=0,j,m;
System.out.println("Enter A String :"); 
s=buf.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
    {
     w++;
    }
}
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
 {
     k1="";
     t++;
k=s.substring(c,i);
m=k.length();
for(j=1;j<m;j=j+2)
{
k1=k1+k.charAt(j)+k.charAt(j-1);
    }
    if(m%2==1)
    {
k1=k1+k.charAt(m-1);
    }
if(t==1)
{
p=k1;
    }
    else
    {
g=g+k1+" "+p+" ";
t=0;        
    }
c=i+1;
    }
}
if(w%2==1)
{
g=g+k1;    }
System.out.println(g);
    }
}