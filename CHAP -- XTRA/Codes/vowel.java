import java.io.*;
class vowel
{
 void main()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String s,a="";
     int i,p=0,l,le,j;
     char c,ch;
     System.out.println("Enter a String");
     s=br.readLine();
     s=s+" ";
     l=s.length();
     for(i=0;i<l;i++)
     {
         ch=s.charAt(i);
              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
              {
                  System.out.print("");
                }
                else
                {
                  System.out.print(ch);
                  
            }
            }

            }
            
        }


