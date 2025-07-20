import java.io.*;
class patt
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,n;
        System.out.println("Enter the range: ");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
            {
                //System.out.print(" * ");
            
        for(j=1;j<=i;j++)
            {
               if(j%2==0)
                System.out.print(" a ");
           else
           System.out.print(" * ");
            }
            
        System.out.println();
    }
}
}