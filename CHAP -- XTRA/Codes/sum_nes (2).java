import java.io.*;
class sum_nes                                                                                                                                                                                                                                                                                                                        
    {
        static int i,n,s,m,d;
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void input()throws IOException
        {          
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
        }
        public static void show()
        {
            System.out.println("Sum of the digits :- ");
            for(i=100;i<=n;i++)
            {
                m=i;
                s=0;
                d=0;
                while(m>0)
                {
                    d=m%10;
                    s=s+d;
                    m=m/10;
                }
                System.out.println("The sum of the digits of "+i+" is = " +s);
            }
        }
        public static void main()throws IOException
        {
            sum_nes ob=new sum_nes();
            ob.input();
            ob.show();
        }
    }
