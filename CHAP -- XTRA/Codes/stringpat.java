//DIAMOND PATTERN
import java.io.*; 
class stringpat
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s;
int i,j,k,l;
System.out.println("Enter the string : - ");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
    }
 for(j=i*2;j<l*2-1;j++)
{
System.out.print(" ");
    }   
    for(k=l-i-1;k<l;k++)
{
System.out.print(s.charAt(k));
    }
    System.out.println();
    }
for(i=1;i<l;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(s.charAt(j));
    }
 for(j=i*2;j<l*2-1;j++)
{
System.out.print(" ");
    }   
    for(k=l-i-1;k<l;k++)
{
System.out.print(s.charAt(k));
    }
    System.out.println();
    }
}
    }

