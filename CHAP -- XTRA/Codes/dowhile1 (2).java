import java.io.*;
class dowhile1
{
public static void main(String args[])throws IOException
{
int i=1;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
do
{
System.out.println(i);
i++;
    }
    while(i<=10);
}
    }