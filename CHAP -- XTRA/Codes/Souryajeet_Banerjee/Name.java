import java.io.*;
   class Name
     {
       void input()throws IOException
       {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter your name");
          String s=br.readLine(),s1="";
          s=" "+s;
          int len=s.length();
          char a;
          for(int i=0;i<=len;i++)
          {
              a=s.charAt(i);
              if(a == i )
              {
                  s1=s1+s.charAt(i+1)+".";
              }
          }
          System.out.println("Initials are   " + s1);
       }
   }