import java.io.*;
class Short_Form
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c=0;
char k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any string:-");
s=br.readLine();
l=s.length();
System.out.print(s.charAt(0));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
System.out.print(" "+s.charAt(i+1));
    }
}
    }
    }