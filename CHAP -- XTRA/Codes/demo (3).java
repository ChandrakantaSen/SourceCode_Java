import java.io.*;
class demo
{
public void main()
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("name");
String Name=br.readLine();
System.out.println("age");
int age=Integer.parseInt(br.readLine());
System.out.println("height");
double height=Double.parseDouble(br.readLine());
System.out.println("name");
System.out.println("age");
System.out.println("height");
    }
catch(Exception e)
{    }
}
    }
