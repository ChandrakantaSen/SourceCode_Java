import java.io.*;
class string26_4
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,c=0,j;
System.out.println("Enter the string");
s=br.readLine();
s=s+" ";
l=s.length();
System.out.println("Each extracted word and the number of vowles in each extracted words from the sentence are as follows");
for(i=0;i<l;i++)
{
if(s.charAt(i)!=' ')
{
k=k+s.charAt(i);
}
else
{
c=0;
for(j=0;j<k.length();j++)
{
if((k.charAt(j)=='A')||(k.charAt(j)=='a')||(k.charAt(j)=='E')||(k.charAt(j)=='e')||(k.charAt(j)=='I')||(k.charAt(j)=='i')||(k.charAt(j)=='O')||(k.charAt(j)=='o')||(k.charAt(j)=='U')||(k.charAt(j)=='u'))
{
c++;
}
}
System.out.println(k+"  "+c);
k="";
    }
}
    }
}