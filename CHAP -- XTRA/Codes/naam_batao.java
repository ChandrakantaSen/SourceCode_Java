import java.io.*;
class naam_batao
{
public static void main(String[]args)throws IOException
{
String a,c; 
int b,d,e,f=0,c1=0;
BufferedReader qads =new BufferedReader(new InputStreamReader(System.in));
System.out.println("N'ter thy pass");
a=qads.readLine();
b=a.length();
for(d=0;d<b;d++)

System.out.println("re-enter");
c=qads.readLine();
c1=c.length();
for(e=0;e<c1;e++)
{
if(d==c1)
System.out.println("U R LOGGED IN.....");
else
System.out.println("RE-TYPE");
     }   }
}
