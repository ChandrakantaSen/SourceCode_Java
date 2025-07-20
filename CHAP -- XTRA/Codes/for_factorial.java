import java.io.*;
class for_factorial                                                                                                                                                                                                                                                                                                                        
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int i,n,s=1;
            System.out.println("Enter the range");
            n=Integer.parseInt(br.readLine());
            for(i=1;i<=n;i++)
            {
                s=s*i;
            }
                System.out.println("Sum is "+s); 
            
        }
    }
               