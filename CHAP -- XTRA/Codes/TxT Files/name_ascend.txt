import java.io.*;
class name_ascend
{
public static void main(String args[])throws IOException
{
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
String s[]= new String[5] ;
for(int i=0;i<5;i++)
{
System.out.println("enter  names in" + i+"cell");
s[i]=br.readLine();
    }
String temp=" ";
for(int i=0;i<5;i++)
{
for(int k=i+1;k<5;k++)
{
if(s[i].compareTo(s[k])>0)
temp=s[i];
s[i]=s[k];
s[k]=temp;
    }}
    for(int i=0;i<5;i++)
    {
    System.out.println(s[i]);
}}}
        