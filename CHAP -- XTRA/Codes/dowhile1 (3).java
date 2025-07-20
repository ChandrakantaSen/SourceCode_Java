import java.io.*;
class dowhile1
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));

int i=10;
do
{
System.out.println(i);
i--;
}
while(i>0);
}
}