import java.io.*;
class nested
{
public static void main(String args[])throws IOException
{
int a,b,c,d=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter three no. to check which no. is greatest");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
d=(((a>b)&&(a>c))?a:((b>c)&&(b>a))?b:c);
System.out.println("Enter the greatest no. is "+d);
    }
}