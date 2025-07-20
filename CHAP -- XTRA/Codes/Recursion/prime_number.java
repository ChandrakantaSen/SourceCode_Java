import java.io.*;

class prime_number 
{
    static int c=1;
    int prime(int n,int k)
    {

        while(k<n)
        {
            if(n%k==0)
                c=0;//returns the value of c as 0
            return(prime(n,k+1));
        }
        return c;//returns the value of c as 1

    }

    static void check(int m)
    {
        if(m==1)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    public static void main(String args[])throws IOException
    {

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);

        prime_number ob=new prime_number();

        System.out.println("Enter a number to check..");

        ob.check(ob.prime(Integer.parseInt(br.readLine()),2));

    }
}