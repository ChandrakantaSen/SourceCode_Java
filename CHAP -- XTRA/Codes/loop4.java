import java .io.*;
class loop4
{
public static void main (String args[]) throws IOException
{
int i;
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
i=10;
do
{
System.out.println (i);
    i--;
    }
while(i>=1);    
}
}
