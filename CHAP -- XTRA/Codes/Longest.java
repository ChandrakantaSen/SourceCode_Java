import java.io.*;
class Longest
{
public static void main(String args[])throws IOException
{
String s,k="",g="";
int i,l,c=0,j=0,t,a=0,m;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any string:-");
s=br.readLine();
s=" "+s;
l=s.length();
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
k=s.substring(c,i);
t=k.length();
if(i>j)
{
j=t;
g=k;
    }
    c=i+1;
}
    }
    {
    m=s.charAt(i);
    if((m=='A')||(m=='a')||(m=='E')||(m=='e')||(m=='I')||(m=='i')||(m=='O')||(m=='o')||(m=='U')||(m=='u'))
    {
        a++;
    }
}
System.out.println("The longest word is:-"+g);
System.out.println("No. of vowels are:-"+a);
    }
}