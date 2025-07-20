import java.io.*;///   TO find the date after a given no of days  in a year ////
class date
{
    int leap(int yr)
    {
        if(yr%4==0 || yr%100==0)
        {
            return 1;
        }
        else 
        return 0;
    }
    int count(int N)
    {
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(i=0;i<=12;i++)
        {
            j=j+i;
            if(j>N)
            {
                m=i;
                break;
            }
        }
        mon=i-1;
    }
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int yr,N;
        System.out.print("Enter the no. of days : ");
        N=Integer.parseInt(br.readLine());
        System.out.print("Enter the date : ");
        d=Integer.parseInt(br.readLine());
        System.out.print("Enter the year : ");
        yr=Integer.parseInt(br.readLine());
        n=N;
        while(n>0)
        {
            d1=n%365;
            n=n/365;
            c++;
        }
        
    }
}
        
        