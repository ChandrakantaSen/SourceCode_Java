import java.io.*;
class Triangle
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch,n;
        System.out.println("Type one for triangle& Two for inverted triangle");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            {
                System.out.println("Enter the number");
                n=Integer.parseInt(br.readLine());
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter the number");
                n=Integer.parseInt(br.readLine());
                for(int i=n;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(i);
                    }
                    System.out.println();
                }
                break;
            }
            default :
            System.out.println("Sorry please try again");
        }
    }
}