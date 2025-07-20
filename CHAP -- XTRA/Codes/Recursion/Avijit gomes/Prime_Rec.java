import java.io.*;
class prime
 {
   BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
     void main()throws IOException
      {
          int a=0;
          System.out.println("Enter a number");
          a=Integer.parseInt(br.readLine());
          int x=primed(a,2);
          if(x==0)
           {
               System.out.println("Prime");
            }
          else
           {
                System.out.println("Not Prime");
            }
        }
     int primed(int a,int b)
      {
         if(b<a)
          {
              if(a%b==0)
               {
                   return 1;
                }
              else
               {
                   primed(a,(b+1));
                }
            }
              return 0;
            }
        }
