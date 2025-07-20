import java.io.*;
class dowhile
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i=1;
do
{
System.out.println(i);
i++;
}
while(i<=10);
}
}