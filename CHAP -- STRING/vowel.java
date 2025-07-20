import java.lang.*;
import java.io.*;
public class vowel
{
 public static void main(String args[])
 {     int l,count=0;
int sp=0;
   // BufferedReader big=new BufferedReader(new InputStreamReader(System.in));
     //system.out.println("ente your string");
     String s="hello kolkata";
     l=s.length();
     char c;
     for(int i=0;i<l;i++)
     {
          c=s.charAt(i);
          if(c=='A'||c=='a'|| c=='E'|| c=='e'|| c=='I'||c=='i'||c=='o'|| c=='O'||
               c=='U'||    c=='u')
               {
                count++;
               }
               if(c==' ')
               {
                  sp++;
                }
              }
                System.out.println("no of="+count+"\n n o space"+sp);

        
      }

}
