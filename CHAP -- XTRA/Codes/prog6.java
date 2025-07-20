import java.io.*;
class prog6
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void display()throws IOException
{int a=Integer.parseInt(br.readLine());   
 int b=Integer.parseInt(br.readLine()); 
  a=a+b;b=a-b;a=a-b;
  System.out.println("a="+a);
  System.out.println("b="+b);
}}
  

 