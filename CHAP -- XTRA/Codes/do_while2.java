import java.io.*;
class do_while2

{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("The no. from 10-1 are as follows");
i=10;
do
{
System.out.println(i);
i--;
    }
while(i>=1);
    }
}
