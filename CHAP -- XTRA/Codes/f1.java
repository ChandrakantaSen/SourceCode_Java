import java.io.*;
class f1
  {
      public static void main()throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(read);
            int i,l;
            String t,s,k=" ";
            System.out.println("enter a string :-");
            s=br.readLine();
            System.out.println("enter the word to be searched :-");
            t=br.readLine();
            s=s+" ";
            l=s.length();
            for(i=0;i<l;i++)
              {
                  if(s.charAt(i)!=' ')
                  k=k+s.charAt(i);
                }
                else
                {
                    for(j=0;j<k.length();j++)
                      {
                          int p=0;
                          if(k.charAt(j)==t.charAt(p))
                           {
                               if(k.charAt(j+1)==t.charAt(p+1))
                                {
                                    flag=1;
                                    break;
                                }
                                else
                                {
                                    j++;
                                }
                            }
                            if(flag==1)
                             c=c+1;
                            }
                        }
                        System.out.println(c);
                    }
                }
            