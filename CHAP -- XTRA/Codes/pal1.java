import java.io.*;
class pal1
  {
       public static void main(String args[])throws IOException
        {
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           String s,s1="",s3="";
           char c;
           int i,l;
           System.out.print("enter a string");
           s=br.readLine();
           s=s+" ";
           l=s.length();
           for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if(c!=' ')
                 {
                     s1=s1+c;
                    }
                    else
                    System.out.print(s1);
                    int l1=s1.length();
                    for(i=l1-1;i>=0;i--)
                     {
                         s3=s3+s1.charAt(i);
                        }
                        
                        if(s1.equals(s3)==true)
                        {
                            System.out.println(s3);
                        l1=0;
                        s3="";
                    }
                }
            }
            }
                    