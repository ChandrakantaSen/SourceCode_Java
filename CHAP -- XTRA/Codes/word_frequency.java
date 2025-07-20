import java.io.*;
class word_frequency
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
String s;
int i,l,w=0;
char c;
System.out.println("Enter a sentence:-");
s=br.readLine();
System.out.println("Enter the word to be searched:-");
c=(char)br.read();
l=s.length();
for(i=l-1;i>=0;i--)
{
    if(s.charAt(i)==c)
    {
        w++;
    }
}
System.out.println("frequency"+c+"is:-"+w);
}
}
