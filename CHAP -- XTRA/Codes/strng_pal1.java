import java.io.*;
class strng_pal1
  {
       public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s,strng,s1="";
            
            char c;
             System.out.print("Enter the  string");
             s=br.readLine();
            int l=s.length(),i;
            for(i=l-1;i>=0;i--)
            {
                s1=s1+s.charAt(i);
            }
             if(s.compareTo(s1)==0)
             {
             System.out.print(s+" is a palindrome string");
            }
             else
             {
System.out.print(s+" is not a palindrome string");
            }
        }
    }