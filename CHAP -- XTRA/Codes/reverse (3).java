import java.io.*;
class reverse
{
public static void main() throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a String");
     String s=br.readLine();
     s=" "+s;
     int z=s.length();
     for(int i=s.length()-1;i>=0;i--)
     {
         if(s.charAt(i)==' ')
         {
             System.out.print(s.substring(i,z));
         z=i;
        }
    }
}
    }
    

