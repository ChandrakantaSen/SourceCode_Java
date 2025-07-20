
import java.io.*;
 class MenuDriven
    {
        public static void main(String args[]) throws IOException
        {
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
         int n=0,c=0,digit=0,i,small;
         System.out.println("Enter 1 for c");
         System.out.println("Enter 2 for i");
         int ch=Integer.parseInt(obj.readLine());
            switch(ch)
            {
             case 1:
             System.out.println("Enter the number");
             n=Integer.parseInt(obj.readLine());
             for(i=1;i<=n;i++)
             {
                 if(n%i==0)
                 {
                     c++;
                    }
             }
             if(c>2)
             {
                System.out.println(n+"composite number");
             }
              else
              {
                System.out.println(n+"not a composite number");
              } 
              break;
              case 2:
              System.out.println("Enter the number");
              n=Integer.parseInt(obj.readLine());
              small=n%10;
              while(n!=0)
              {
                  digit=n%10;
                  n/=10;
                  if(digit<small)
                  small=digit;
              }
              System.out.println("s d : " + small);
              break;
              default:
              System.out.println("Enter only 1/2" );
            }
        }
    }
