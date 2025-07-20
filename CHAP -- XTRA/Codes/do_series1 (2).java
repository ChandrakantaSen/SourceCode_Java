import java.io.*;
class do_series1                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i=1,n,s=0;
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
            do
            {
                s=s+i;
                i++;
            }
            while(i<=n);
                System.out.println("Sum is "+s);
               
            
        } 
}
               