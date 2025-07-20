import java.io.*;
class unknown
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,m;
int l,j,k;
System.out.println("Enter the string");
s=(br.readLine());
l=s.length();
for(j=0;j<l;j++)
{
k=(int)(s.charAt(j));
if((k>=97)&&(k<=122))
{
System.out.print((char)(k-32));
    }
    else
    {
System.out.print((char)(k+32));
}
    }
}
    }