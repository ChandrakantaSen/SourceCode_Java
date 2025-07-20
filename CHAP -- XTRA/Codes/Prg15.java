import java.io.*;
class Prg15
{
public static void main(String args[])throws IOException
{
String s;
int l,j,k,c=0;
char b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
s=br.readLine();
l=s.length();
for(j=0;j<l;j++)
{
k=(int)(s.charAt(j));
if(((k>=65)&&(k<=90))||((k<=97)&&(k<=122)))
{
{
c++;
if(((char)(k)!='A')&&((char)(k)!='E')&&((char)(k)!='I')&&((char)(k)!='O')&&((char)(k)!='U')&&((char)(k)!='a')&&((char)(k)!='e')&&((char)(k)!='i')&&((char)(k)!='o')&&((char)(k)!='u'))

{
System.out.println(c);
    }
}
    }
}
    }
}

