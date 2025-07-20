import java.io.*;               
class pg198q5
{
public static void main(String args[])throws IOException
{
  int i,l,c;String n;char b;c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the String");
n=br.readLine();
l=n.length();
for(i=0;i<l;i++)
{
b=n.charAt(i);
if(b=='a'||b=='A'||b=='e'||b=='E'||b=='i'||b=='I'||b=='o'||b=='O'||b=='u'||b=='U')
{
c++;
}
}
System.out.println("The no of alphabets excluding the vowels is"+(l-c));
}
}