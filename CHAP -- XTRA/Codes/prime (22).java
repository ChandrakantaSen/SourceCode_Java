import java.io.*;
class prime
{
    public static void main(String args[])throws IOException
    {
       int b,c=0;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter The Number");
       b=Integer.parseInt(br.readLine());
        for(int i=1;i<=b ; i++)
        {
           if(b%i==0)
        {
            c++;
        }
    }
        if(c==2)
    
        System.out.println("the number is prime");
        else
        System.out.println("the number is not prime");
    }
}
    

       
        
        