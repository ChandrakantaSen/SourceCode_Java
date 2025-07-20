import java.io.*;
class Sumv1
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
                double c=0,j;
                for(int i=1;i<=10;i++)
                {
                    j=1;
                    if(i%2==0)
                    {
                        j=j*2*(-i);
                        c=c+j;
                    }
                    else
                    {
                        j=j*2*i;
                        c=c+j;
                    }
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