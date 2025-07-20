import java.io.*;
class Prg24
{
public static void main(String args[])throws IOException
{
String s;
int i,l,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any TEXt");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
k=(s.charAt(i));
if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='A')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
{
System.out.print("*");
    }
    else
    {
        System.out.print(s.charAt(i));
        
    }
}
    }
    }