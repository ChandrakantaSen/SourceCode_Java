import java.io.*;
class Consonants
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
for(i=0;i<l;i++)
{
k=s.charAt(i);
if((k!='A')&&(k!='a')&&(k!='E')&&(k!='e')&&(k!='I')&&(k!='i')&&(k!='O')&&(k!='o')&&(k!='U')&&(k!='u'))
{
c++;
    }
    }
    System.out.println("No. of alphabhet excluding vowels are : -"+c);
    }
}
