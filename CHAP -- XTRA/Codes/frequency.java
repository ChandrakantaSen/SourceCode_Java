import java.io.*;
public class frequency
{
public static void main(String args [])throws IOException
{
int i,j,flag=0,c=0,l;
String s;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the string to find the frequency of each of its alphabets");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
{
if(s.charAt(i)==s.charAt(j))
{
c++;
}
}
for(j=i-1;j>=0;j--)
{
if(s.charAt(i)==s.charAt(j))
{
flag=1;
}

}
if(flag!=1)
{
System.out.println(s.charAt(i)+" "+c);
}
flag=0;
c=0;
}
}
}