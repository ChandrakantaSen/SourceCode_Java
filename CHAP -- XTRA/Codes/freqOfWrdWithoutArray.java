import java.io.*;
class freqOfWrdWithoutArray
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string");
int l=0,i,j,f=0;
String s=" "+br.readLine()+" ",wrd="",s2="",wrd1="";
for(i=1;i<s.length();i++)
{
char c=s.charAt(i);
if(c!=' ')
wrd=wrd+c;
else
{f=0;
    for(j=0;j<i;j++)
    {
        char c2=s.charAt(j);
        if(c2!=' ')
        wrd1=wrd1+c2;
        else
        {
            if(wrd1.equals(wrd)==true)
            f++;
            wrd1="";
        }
    }
    if(f==0)
    s2=s2+wrd+" ";
    wrd="";
        }
}
for(i=0;i<s2.length();i++)
{
char c=s2.charAt(i);
if(c!=' ')
wrd=wrd+c;
else
{f=0;
    for(j=0;j<s.length();j++)
    {
        char c2=s.charAt(j);
        if(c2!=' ')
        wrd1=wrd1+c2;
        else
        {
            if(wrd1.equals(wrd)==true)
            f++;
            wrd1="";
        }
    }
    System.out.println("Frequency of '"+wrd+"' is "+f);
    wrd="";
    }
}
    }
}