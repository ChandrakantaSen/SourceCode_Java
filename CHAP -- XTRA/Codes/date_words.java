import java.io.*;
class date_words
{
    static int day,year,month[]={31,28,31,30,31,30,31,31,30,31,30,31};
    static int i=0,j,c=0,ctr=0;
    static int leapyear(int a)
    {
        if((a%4==0)||(a%100==0)&&(a/400==0))
        {
            return(1);
        }
        else
        {
            return(0);
        }
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the days : ");
        day=Integer.parseInt(br.readLine());
        System.out.println("Enter the year : ");
        year=Integer.parseInt(br.readLine());
        if(day>365)
        {
            c=day/365;
            year=year+c;
            day=day%365;
        }
        if (leapyear(i)==1)
        {
            month [1]=29;
        }
        while(i<day)
        {
            for(j=0;j<month[ctr];)
            {
                i++;
                j++;
                if(i==day)
                break;
            }
            ctr++;
        }
        switch(ctr)
        {
            case 1:
            System.out.println("January"+j+" "+year);
            break;
            case 2:
            System.out.println("February"+j+" "+year);
            break;
            case 3:
            System.out.println("March"+j+" "+year);
            break;
            case 4:
            System.out.println("April"+j+" "+year);
            break;
            case 5:
            System.out.println("May"+j+" "+year);
            break;
            case 6:
            System.out.println("June"+j+" "+year);
            break;
            case 7:
            System.out.println("July"+j+" "+year);
            break;
            case 8:
            System.out.println("August"+j+" "+year);
            break;
            case 9:
            System.out.println("September"+j+" "+year);
            break;
            case 10:
            System.out.println("October"+j+" "+year);
            break;
            case 11:
            System.out.println("November"+j+" "+year);
            break;
            case 12:
            System.out.println("December"+j+" "+year);
            break;
        }
    }
}
        
