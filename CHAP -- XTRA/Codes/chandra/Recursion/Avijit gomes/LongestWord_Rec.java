import java.io.*;
class longest
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s="",s1="";
     int p=0,i=0;
     void main()throws IOException
      {
          System.out.println("Enter a sentence");
          s=br.readLine();
          s=s+" ";
          longer();
        }
     void longer()
      {
          if(i<s.length())
           {
               if(s.charAt(i)==' ')
                {
                    if(s1.length()<(i-p))
                     {
                         s1=s.substring(p,i);
                        }
                    p=i;
                }
               i++;
               longer();
            }
          else
           {
               System.out.println(s1);
            }
        }
    }