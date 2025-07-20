import java.io.*;
class shift_string
{
static String shift(String s, int n)
{int d;
char c;
String w=" ";
for(int i=0;i<s.length();i++)
{
c=s.charAt(i);
d=c;
d=d+n;
if(d>122 )
{
d=d-25;
    }
w=w+(char)d;
       }
    return w;
}
public static void main(String args[])throws IOException
{
int p=0;
String st3=" ",st=" ";
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter a sentence");
String m=br.readLine();
System.out.println("enter the shift");
int sf=Integer.parseInt(br.readLine());
m=m.concat(" ");
for(int j=0;j<m.length();j++)
{
if(m.charAt(j)==' ')
{
st=m.substring(p,j);
p=j+1;
st3=shift(st,sf);
System.out.print(st3+" ");
    }
}
    }
}
