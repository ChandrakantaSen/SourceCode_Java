import java.io.*;
class sum_digits                                                                                                                                                                                                                                                                                                                        
    {
        static int i,n,s=0;
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static void input()throws IOException
        {          
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
        }
        public static void show()
        {
            for(i=1;i<=n;i++)
            {
                s=s+i;
            }
                System.out.println("Sum is "+s); 
            
        }
        public static void main()throws IOException
        {
            sum_digits ob=new sum_digits();
            ob.input();
            ob.show();
    }
}
               