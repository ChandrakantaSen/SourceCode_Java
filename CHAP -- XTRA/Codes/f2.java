import java.io.*;
class f2
  {
      public static void main()throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(read);
            String s,k,s1=" ";
            int i,l,flag=0,c=0;
            char t;
            System.out.println("enter a string :-");
            s=br.readLine();
            s=s+" ";
            l=s.length();
            System.out.println("enter the word to be searched :-");
            k=br.readLine();
            for(i=0;i<l;i++)
              {
                  t=s.charAt(i);
                  if(t!=' ')
                    {
                        s1=s.substring(0,i);
                    }
                    else
                    {
                        if(s1.compareTo(k)==0)
                        {
                         flag=1;
                         break;
                        }
                        else
                        {
                        i++;
                    }
                }
                    if(flag==1)
                    {
                     c=c+1;
                    }
                }
                    System.out.println(c);
                }
            }  