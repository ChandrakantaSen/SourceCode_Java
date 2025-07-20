import java.io.*;                                                                                                                                                       
public class words
{
 public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a String");
     String s=br.readLine();
     int l=s.length();
     int c=1;
     for(int i=0;i<l;i++)
     {
         if(s.charAt(i)==' ')
         {
             c++;
            }
        }
        System.out.println(c);
    }
}





















