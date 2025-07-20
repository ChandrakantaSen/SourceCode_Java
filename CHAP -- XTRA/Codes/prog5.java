import java.io.*;
class prog5
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void display()throws IOException
{int x=Integer.parseInt(br.readLine());   
 int y=Integer.parseInt(br.readLine()); 
 int z=Integer.parseInt(br.readLine()); 
 if((x>y)&&(x>z))
 System.out.println("the largest no. is"+x);
 else if((y>x)&&(y>z))
 System.out.println("the largest no. is"+y);
 else System.out.println("the largest no. is"+y);
}}
 
 