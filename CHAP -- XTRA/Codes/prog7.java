import java.io.*;
class prog7
{
 
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());   
        if(x%10==0)
            System.out.println("the no. is divisible by 2 and 5");
        else 
            System.out.println("the no. is not");
    }
}