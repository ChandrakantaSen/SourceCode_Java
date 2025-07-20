import java.io.*;
class string35
{
public static void main(String args[])throws IOException
{
String s;
int i,l,j,k,c=0;
char ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any text : - ");
s=br.readLine();
l=s.length();
for(j=0;j<l;j++)
{
k=(int)(s.charAt(j));
if(((k>=65)&&(k<=90))||((k>=97)&&(k<=122)))
{
if(((char)(k)!='A')&&((char)(k)!='E')&&((char)(k)!='I')&&((char)(k)!='O')&&((char)(k)!='U')&&((char)(k)!='a')&&((char)(k)!='e')&&((char)(k)!='i')&&((char)(k)!='o')&&((char)(k)!='u'))
{
c++;
    }
    }
    }
System.out.println("The number of consonant are in the above string are : - "+c);    
}
    }