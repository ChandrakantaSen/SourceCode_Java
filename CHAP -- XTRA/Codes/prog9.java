import java.io.*;
class prog9
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void main()throws IOException
{int x=Integer.parseInt(br.readLine());   
 if((x%5==0)&&(x%2!=0))
 System.out.println("the no. is divisible by 5 and not 2");
 else System.out.println("the no. is not");
}}