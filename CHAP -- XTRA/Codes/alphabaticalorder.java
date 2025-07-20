import java.io.*;
public class alphabaticalorder
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the string");
     String s=br.readLine();
     int l=s.length();
     int  i=0,j=0,k=0,a=0;char ch;
     for(i=97;i<=122;i++)
     {
          for(j=0;j<l;j++)
          {
              a=s.charAt(j);
              k=a;
              ch=s.charAt(j);
              if(k==i)
              System.out.println(ch);
            }
        }
    String rev=new String("");
    for(i=l-1;i>=0;i--)
    rev=rev+s.charAt(i);
    if(s.compareTo(rev)==0)
    System.out.println("Entered String is a palindrom string");
    else
    System.out.println("Entered string is not palindrom string");
    
}
    
}
