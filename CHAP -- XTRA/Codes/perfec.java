import java.io.*;
class perfec
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter range");
        int r=Integer.parseInt(br.readLine());;
        
        for(int i=1;i<=r;i++)
        {
           int   c=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    c=c+j;
                }
            }
            if(c==i)
           {
           System.out.println(i);
           }
        }
}
}
            