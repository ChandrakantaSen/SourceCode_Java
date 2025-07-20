import java.io.*;
class ifelse
{
public static void main(String args[])throws IOException
{
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number : - ");
a=Integer.parseInt(br.readLine());
if(a>0)
{
System.out.println(a+" is a positve number");
    }
    else if(a==0)
    {
        System.out.println(a+" is zero");
    }
    else
    {
        System.out.println(a+" is a negative number");
    }
}
    }
