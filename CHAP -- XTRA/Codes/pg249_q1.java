import java.io.*;
public class pg249_q1
{
public static void main()throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a=0,s=0;
int m[]={23,31,44,56,72,55};
for(int i=0;i<6;i++)
{
s=s+m[i];
a=s/6;
}
System.out.println("The sum is "+s);
System.out.println("The average is "+a);
}
}
