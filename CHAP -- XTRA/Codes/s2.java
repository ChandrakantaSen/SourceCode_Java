import java.io.*;
class s2
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int c=0,i=0,m=0,j,n=0;
String s;
char k1,k2;
System.out.print("Enter A Word :"); 
s=buf.readLine();
s=s.trim();
c=s.length();
if(c%2==1)
{
n=1;
c=c-1;
}
for(i=0;i<s.length();i+=2)
{
if(c==0)
{
break;
    }
k1=s.charAt(i);
k2=s.charAt(i+1);
System.out.print(k2);
System.out.print(k1);
c=c-2;
    }
if(n==1)
{
System.out.print(s.charAt(s.length()-1));
}
    }
}
         