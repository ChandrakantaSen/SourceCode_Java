import java.io.*;
class consecutive
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,l,c=0,flag=0;
System.out.println("Enter the text");
s=br.readLine();
l=s.length();
for(i=0;i<l-1;i++)
{
if((int)(s.charAt(i))+1==(int)(s.charAt(i+1)))
{
System.out.println(s.charAt(i)+"   "+s.charAt(i+1));
flag=1;
c++;
    }
}
if(flag==1)
{
System.out.println("The number of consecutive letters found in the upper string are :  -"+c);
}
else
{
System.out.println("No consecutive letters are found in the upper string ");
}
    }
}