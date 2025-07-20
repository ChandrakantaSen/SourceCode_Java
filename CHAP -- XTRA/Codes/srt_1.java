import java.io.*;
class srt_1
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
            for(j=i+1;j<5;j++)
            {
                if(n[i]<n[j])
                {
                    c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        System.out.println("DISPLAY:");
        for(i=0;i<5;i++)
        {
        System.out.print(n[i]+" , ");
        }
    }
}