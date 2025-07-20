import java.io.*;
class prog8
{BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void main()throws IOException
{int x=Integer.parseInt(br.readLine());   
 if((x%2==0)&&(x%5!=0))
 System.out.println("the no. is divisible by 2 and not 5");
 else System.out.println("the no. is not");
}}