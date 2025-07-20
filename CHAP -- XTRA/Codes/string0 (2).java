import java.io.*;
class string0
{
void main()throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int l,i,c=0,w=0,t=0;
System.out.println("Enter A String :"); 
s=buf.readLine();
l=s.length();
for(i=1;i<l;i=i+2)
{
k=k+s.charAt(i)+s.charAt(i-1);
    }
    if(l%2==1)
    {
  k=k+s.charAt(l-1);      
    }
System.out.println(k);
    }
}