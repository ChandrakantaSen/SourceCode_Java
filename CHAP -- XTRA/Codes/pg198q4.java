import java.io.*;               
class pg198q4
{
public static void main(String args[])throws IOException
{
 int i,l;String n;char b;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the String");
n=br.readLine();
l=n.length();
for(i=0;i<l;i++)
{
b=n.charAt(i);
if(b=='a'||b=='A'||b=='e'||b=='E'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U')
{
}
else
{
System.out.print(n.charAt(i));
}
}
}
}