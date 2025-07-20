import java.io.*;
class sentence
{
public static void main(String args[])throws IOException
{int count=0,q;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a string");
String s=br.readLine();
int l=s.length();
for(int i=0;i<l;i++)
{
char ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch'u')
count++;
q=l-count;
//int lg=q.length();
for(int j=0;j<lg;j++)
{
System.out.println(