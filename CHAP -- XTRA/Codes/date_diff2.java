import java.io.*;
class date_diff2
{
    public static int leap(int y)
    {
        if(y%4==0  ||  y%100==0)
        return 1;
        else 
        return 0;
    }
      public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        date_diff2 obj=new date_diff2();
        int d=0,y,n=0,c,i=0,t=0,j=0,k=0,p=t,x;
        int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("\nEnter day number : -  ");
        d=Integer.parseInt(br.readLine());
        System.out.print("\nEnter the year : -  ");
        y=Integer.parseInt(br.readLine());
        System.out.print("\nEnter the number after which the date is to be found (N) : -  ");
        n=Integer.parseInt(br.readLine());
        if(d>365)
        {
            c=d/365;
            d=d%365;
            y=y+c;
        }
        if(leap(y)==1)
        {
            mon[1]=29;
        }
        while(i<d)
        {
        for(j=0;j<mon[t];)    
        {
            i++;
            j++;
           if(i==d) 
               break;
        }
        t++;
        }
        switch(t)
        {
            case 1:
            System.out.println(j+"th "+" January"+" "+y);
            break;
            case 2:
            System.out.println(j+"th"+" February"+" "+y);
            break;
            case 3:
            System.out.println(j+"th"+" March"+" "+y);
            break;
            case 4:
            System.out.println(j+"th"+" April"+" "+y);
            break;
            case 5:
            System.out.println(j+"th"+" May"+" "+y);
            break;
            case 6:
            System.out.println(j+"th"+" June"+" "+y);
            break;
            case 7:
            System.out.println(j+"th"+" July"+" "+y);
            break;
            case 8:
            System.out.println(j+"th"+" August"+" "+y);
            break;
            case 9:
            System.out.println(j+"th"+" September"+" "+y);
            break;
            case 10:
            System.out.println(j+"th"+" October"+" "+y);
            break;
            case 11:
            System.out.println(j+"th"+" November"+" "+y);
            break;
            case 12:
            System.out.println(j+"th"+" December"+" "+y);
            break;
                        }
                        x=n+d;
                i=0;
                p=0;
           if(x>365)
        {
            int c1=x/365;
            x=x%365;
            y=y+c1;
        }
        if(leap(y)==1)
        {
            mon[1]=29;
        }
            while(i<x)
        {
        for(k=0;k<mon[p];)    
        {
            i++;
            k++;
           if(i==x) 
               break;
        }
        p++;
        }
        System.out.println("Date after N number of days : ");
        switch(p)
        {
            case 1:
            System.out.println(k+"th "+" January"+" "+y);
            break;
            case 2:
            System.out.println(k+"th"+" February"+" "+y);
            break;
            case 3:
            System.out.println(k+"th"+" March"+" "+y);
            break;
            case 4:
            System.out.println(k+"th"+" April"+" "+y);
            break;
            case 5:
            System.out.println(k+"th"+" May"+" "+y);
            break;
            case 6:
            System.out.println(k+"th"+" June"+" "+y);
            break;
            case 7:
            System.out.println(k+"th"+" July"+" "+y);
            break;
            case 8:
            System.out.println(k+"th"+" August"+" "+y);
            break;
            case 9:
            System.out.println(k+"th"+" September"+" "+y);
            break;
            case 10:
            System.out.println(k+"th"+" October"+" "+y);
            break;
            case 11:
            System.out.println(k+"th"+" November"+" "+y);
            break;
            case 12:
            System.out.println(k+"th"+" December"+" "+y);
            break;
                    }

            }
}


