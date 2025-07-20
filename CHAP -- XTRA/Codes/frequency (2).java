import java.io.*;
class frequency
{
public static void main(String args[])throws IOException
{
  BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
  String sent,x="";
  char k,m;
  int i,j=0,len,c=0;
  String a[]=new String[c];
  System.out.println("Enter a string");
  sent=br.readLine();
  sent=sent+" ";
  len=sent.length();
  for(i=0;i<len;i++)
  {
      k=sent.charAt(i);
      m=sent.charAt(i+1);
      if(k!=' '&&m==' ')