import java.io.*;
class string100
{
void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String s,k="",g="",p="";
int l,i,c=0,w=0,t=0;
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
     t++;
k=s.substring(c,i);        
if(t==1)
{
p=k;
    }
    else
    {
g=g+k+" "+p+" ";
t=0;        
    }
c=i+1;
    }
}
if(w%2==1)
{
g=g+k;
    }
System.out.println(g);
    }
}