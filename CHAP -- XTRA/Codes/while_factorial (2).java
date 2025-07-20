import java.io.*;
class while_factorial                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i=1,n,s=1;
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
            while(i<=n)
            {
                s=s*i;
                i++;
            }
                System.out.println("Factorial is "+s);
                
            
        }
}
               