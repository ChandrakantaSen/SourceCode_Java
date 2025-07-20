import java.io.*;
class prog3
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void display()throws IOException
{int x=Integer.parseInt(br.readLine());  
    while(x<=1000)
    {
   if(x%4==0)
 System.out.println("it is a leap year");
 else System.out.println("not a leap year");
}}}