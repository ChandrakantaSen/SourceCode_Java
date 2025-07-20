import java.io.*;
class Date
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int d,c=0,y=0,m=0,m1=0;
        System.out.println("Enter a date (dd/mm/yy) : ");
        d=Integer.parseInt(br.readLine());
        if(d>=1)
        {
            
        m=c=d/100;
        m1=m%100;
        c=d/10000;
        y=d%100;
        switch (m1)
        {
            case 1:
            {
        System.out.println(c+"/January/"+y);
            }
            case 2:
            {
        System.out.println(c+"/Febuary/"+y);
            }
            case 3:
            {
        System.out.println(c+"/March/"+y);
            }
            case 4:
            {
        System.out.println(c+"/SA/"+y);
            }
        }
        
        }
        else
        {
            System.out.println("no");
        }
    }
}