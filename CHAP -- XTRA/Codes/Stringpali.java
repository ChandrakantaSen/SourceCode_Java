import java.io.*;
class Stringpali
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER YOUR STRING");
String s=br.readLine();
String a="",b="";
s=' '+s;
int be=0,e=0,i,c=1,num=0;
for(i=0;i<s.length();i++)
{
if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
{
if(c==1)
{
be=i+1;
c=2;
    }
else
{e=i-1;
 c=1;   
    
}
for(c=be;c<=e;c++)
{
a=a+s.charAt(c);
b=s.charAt(c)+b; 
    }
 if(a==b)
 {System.out.print(a);
     num++;}
}
    }
System.out.print("TOTAL NUMBER OF PALINDROME WORDS ARE "+num);
    
}
    }