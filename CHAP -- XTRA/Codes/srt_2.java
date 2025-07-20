import java.io.*;
class srt_2
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,c;
        int n[]=new int[5];
        for(i=0;i<5;i++)
        {
        System.out.println("Enter the number:");
        n[i]=Integer.parseInt(br.readLine());
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4-i;j++)
            {
                if(n[j]<n[j+1])
                {
                    c=n[j];
                    n[j]=n[j+1];
                    n[j+1]=c;
                }
            }
        }
        System.out.println("DISPLAY:");
        for(i=0;i<5;i++)
        {
        System.out.print(n[i]+"  , ");
        }
    }
}