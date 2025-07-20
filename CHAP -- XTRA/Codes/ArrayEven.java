import java.io.*;
class ArrayEven
{
    public static void main(String args[])throws IOException
    {
        int i,sum1=0,sum=0, eve=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m[]=new int[5];
        for(i=1;i<5;i++)
        {
            System.out.println("Enter The Value");
            m[i]=Integer.parseInt(br.readLine());
        }
        for(i=1;i<5;i++)
       {
            
            if(m[i]%2==0)
            {
                sum=sum+m[i];
            }
            else
            sum1=sum1+m[i];
        
    }
    System.out.println("The Even Number is "+sum);
    System.out.println("The Odd Number is "+sum1);
}
}
        
            