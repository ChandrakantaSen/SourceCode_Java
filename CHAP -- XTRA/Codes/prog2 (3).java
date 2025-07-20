import java.io.*;
class prog2
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void display()throws IOException
{int x=Integer.parseInt(br.readLine());   
 if(x%2==0)
 System.out.println("the no. is even");
 else System.out.println("the no. is odd");
}}