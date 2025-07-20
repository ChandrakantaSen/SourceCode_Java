import java.io.*;
class do_while
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("The no. from 1-10 are as follows");
i=1;
do
{
System.out.println(i);
i++;
    }
while(i<=10);
    }
}
