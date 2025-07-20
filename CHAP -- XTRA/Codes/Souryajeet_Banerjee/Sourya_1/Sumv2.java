import java.io.*;
class Sumv2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch;
        System.out.println("Type one for sum & Two for x/sum");
        ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            {
                double c=0,j=2;
                for(int i=1;i<=10;i++)
                {
                    if(i%2==0)
                    {
                        c=c-j;
                    }
                    else
                    {
                        c=c+j;
                    }
                    j=j+2;
                }
                System.out.print(c);
                break;
            }
            case 2:
            {
                double c=0,k,x;
                System.out.println("Enter the number");
                x=Double.parseDouble(br.readLine());
                for(int i=1;i<=10;i++)
                {
                    k=x/(i*2);
                    c=c+k;
                }
                System.out.print(c);
                break;
            }
            default :
            System.out.println("Sorry please try again");
        }
    }
}