import java.io.*;
class extrct_strng
  {
       public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s,s1="";
            int i,l;
            char c;
            System.out.println("enter a string=");
            s=br.readLine();
            s=s+" ";
            l=s.length();
            for(i=0;i<l;i++)
              {
                  if(s.charAt(i)!=' ')
                  {
                  s1=s1+s.charAt(i);
                }
                  else
                 { 
                  System.out.println(s1);
                  s1="";
                }
            }
        }
    }