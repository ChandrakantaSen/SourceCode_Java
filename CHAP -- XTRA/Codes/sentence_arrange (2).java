import java.io.*;
class sentence_arrange
{
public static void main(String args[])throws IOException
{
String s,k=" ";
int p=0,b,temp=0;
char c=' ',n=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a sentence in lowercase");
s=br.readLine();
int l=s.length();


/*if(s.charAt(i)==' ')
continue;
    
    else*/
 
  for(int j=97;j<=122;j++)
  {
      for(int i=0;i<l;i++)
      {
     
n=s.charAt(i);
      if(n==j)
      
    

System.out.print(n);
    }
}}
    }