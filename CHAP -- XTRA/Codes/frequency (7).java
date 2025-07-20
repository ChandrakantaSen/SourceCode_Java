import java.io.*;
class frequency
  {
      public static void main()throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(read);
            String s,s1,s2=" ";
            int i,c=0,z,z1,flag=0;
            char ch;
            System.out.println("enter the string :-");
            s=br.readLine();
            s=s+' ';
            z=s.length();
            System.out.println("enter the word to be searched :-");
            s1=br.readLine();
            z1=s1.length();
            for(i=0;i<z;i++)
              {
                  int p=0;
                  ch=s.charAt(i);
                  if(ch!=' ')
                  {
                  s2=s2+s;
                }
                  else
                  if((s1.charAt(p))==(s.charAt(ch))   
                  {
                   flag=0;
                   c=c+1;
                   i++;
                }
                else
                flag=1;
                i++;
                System.out.println(c);
            }
        }
    }
                 
                  