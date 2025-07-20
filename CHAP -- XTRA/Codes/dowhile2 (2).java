import java.io.*;
class dowhile2
{
public static void main(String args[])throws IOException
{
int i=10;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
do
{
System.out.println(i);
i--;
    }
    while(i>0);
}
    }