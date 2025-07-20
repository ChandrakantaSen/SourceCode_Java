import java.io.*;
class Prg16
{
public static void main(String args[])throws IOException
{
String s,t="";
int v=0,k,c=0,i,j,l;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter any string ");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
k=(int)(s.charAt(i));
if(((k>=65)&&(k<=90))||((k>=97)&&(k<=122)))
{
c++;
    }
if((s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U')||(s.charAt(i)=='A')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
{
v++;
    }
}
for(j=l-1;j>=0;j--)
{
t=t+s.charAt(j);
}
     System.out.println("Number of characters : - "+c);
    System.out.println("Number of vowles : - "+v);
     System.out.println("Reverse String : - "+t);
}  
}
