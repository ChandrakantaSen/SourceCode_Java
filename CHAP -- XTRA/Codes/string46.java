import java.io.*;
class string46
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char ch;
int l;
System.out.println("Enter the chracter : - ");
ch=(char)(br.read());
l=(int)(ch);
System.out.println("The ascii value of "+ch+" is : - "+l);
    }
}