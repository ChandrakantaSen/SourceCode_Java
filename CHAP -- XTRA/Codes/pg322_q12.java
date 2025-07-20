import java.io.*;
public class pg322_q12
{
public static void palin()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k="";;
int i,l;
System.out.println("Enter the string to check wheather the string is palindrome or not : - ");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
k=k+s.charAt(i);
    }
    if(s.compareTo(k)==0)
    {
System.out.println(s+" is a palindrome string ");        
    }
    else
    {
System.out.println(s+" is not a palindrome string ");        
}
    }
public static void main(String args[])throws IOException
{
pg322_q12 ob=new pg322_q12();
ob.palin();
    }
}

    