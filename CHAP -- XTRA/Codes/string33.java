import java.io.*;
class string33  
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,p;
System.out.println("Enter the string");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
p=(int)(s.charAt(i));
if((p>=65)&&(p<=90)||(p>=97)&&(p<=122))
{
if((p>=97)&&(p<=122))
{
p=p-32;
k=k+(char)(p);
    }
else if((p>=65)&&(p<=90))
{
p=p+32;
k=k+(char)(p);
    }
}
else
{
k=k+(s.charAt(i));
    }
}
System.out.println(k);
    }
}