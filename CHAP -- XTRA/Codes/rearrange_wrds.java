import java.io.*;
class rearrange_wrds
{
public static void main()throws IOException
{int lwrd=0,i,x=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string");
String s=" "+br.readLine()+" ",wrd="",s2="",store="";
    for(i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c!=' ')
wrd=wrd+c;
else
{
x++;
if((x%3)==1)
store=wrd;
else if((x%3)==2)
{
s2=s2+" "+wrd+" "+store;
store="";
    }
else if((x%3)==0)
s2=s2+" "+wrd;
wrd="";
    }
}
System.out.println("rearranged string = "+s2);
    }
}