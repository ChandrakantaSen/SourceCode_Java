import java.io.*;
class s1
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int c=0,i=0,m=0,j,n=0;
String s,k1="",k2="";
System.out.print("Enter A String :"); 
s=buf.readLine();
s=s+" ";
while(i<s.length())
{
if(s.charAt(i)==' ')
{
c++;
    }
i++;
}
i=0;
if(c%2==1)
{
n=1;
c=c-1;
}
for(i=0;i<s.length();i++)
{
if(c==0)
{
break;
    }
if(s.charAt(i)==' ')
{
k1=s.substring(m,i);
m=i+1;
i++;
while(s.charAt(i)!=' ')
{
i++;
    }
k2=s.substring(m,i);
m=i+1;
System.out.print(k2+" "+k1+" ");
c=c-2;
    }
}
s=s.trim();
m=s.length();
if(n==1)
{
for(i=s.length()-1;i>=0;i--)
    {
        if(s.charAt(i)==' ')
        {
            k1=s.substring(i+1,m);
            System.out.print(k1);
            break;
        }
    }
}
    }
}