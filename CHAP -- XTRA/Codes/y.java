import java.io.*;
class Biblio_Graphy
{
public static void main(String args[])throws IOException
{
String s;
int i,l,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any string:-");
s=br.readLine();
l=s.length();
System.out.print(s.charAt(i-1));
for(i=0;i<l;i++)
{
if(s.charAt(i)==' ')
{
    for(i=1;i<l;i++)
    {
        if(s.charAt==' ')
        {
            System.out.println(" "+s.charAt(i+1));
        }
    }
}