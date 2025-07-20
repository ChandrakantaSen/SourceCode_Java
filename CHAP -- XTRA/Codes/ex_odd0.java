import java.io.*;
class ex_odd0
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,c=0,j,t=0,l,c1=0;
String s,k="",p="",g="",d="";
System.out.println("Enter a sentence ");
s=buf.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
c1++;
t++;
k=s.substring(c,i);
 if(t==1)
    {
     g=k;   
    }
else if(t==2)
{
p=k;
    }
    
   else if(t==3)
   {
       t=0;
       d=d+k+" "+p+" "+g;
       k="";
       p="";
       g="";
    }
    c=i+1;
    }
}
if(c1%2==0)
{
d=d+" "+k;
    }
System.out.println(d);
    }
}