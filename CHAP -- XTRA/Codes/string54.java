import java.io.*;
class string54
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";
int i,l,j,shift;
System.out.println("Enter the string : - ");
s=br.readLine();
System.out.println("Enter the shift : - ");
shift=Integer.parseInt(br.readLine());
l=s.length();
for(i=0;i<l;i++)
{
if(((int)(s.charAt(i))>=65)&&((int)(s.charAt(i))<=90))
{
j=((int)(s.charAt(i))+shift);
if(j>90)
{
j=j-26;
}
k=k+(char)(j);
}
else if(((int)(s.charAt(i))>=97)&&((int)(s.charAt(i))<=122))
{
j=((int)(s.charAt(i))+shift);
if(j>122)
{
j=j-26;
}
k=k+(char)(j);
}
else
{
k=k+s.charAt(i);
}
}
System.out.println(k);    
}
    }