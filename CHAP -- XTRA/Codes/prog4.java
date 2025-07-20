import java.io.*;
class prog4
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void display()throws IOException
{int x=Integer.parseInt(br.readLine());   
 for(int i=2;i<=10;i++)
   { if(x%2==0)
 System.out.println(i);
}}}