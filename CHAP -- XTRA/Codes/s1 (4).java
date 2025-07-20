import java.io.*;
class s1
  {
       public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String s,s1="";
            char c;
            int l,i;
             System.out.print("Enter the  string");
             s=br.readLine();
             s=s+" ";
             l=s.length();
             for(i=0;i<l;i++)
               {
                   c=s.charAt(i);
                   if(c!=' ')
                   {s1=c+s1;
                    }
                   else
                   {
                   System.out.println(s1);
                   s1=" ";
                }
            }
            }
        }
           
             
            