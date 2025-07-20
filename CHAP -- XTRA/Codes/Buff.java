import java.io.*;
class Buff
     {
       public static void main(String args[])throws IOException
            {
                 double i,p=0,n=0,m,r,s=0,num;
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("enter a range");
                 num=Double.parseDouble(br.readLine());
                 for(i=1;i<=num;i++)
                    {
                        m=n*10+2;
                        r=m+(Math.pow(0.1,(i*m)));
                        s=s+r;
                    }
                    System.out.print(s);
                }
            }
            