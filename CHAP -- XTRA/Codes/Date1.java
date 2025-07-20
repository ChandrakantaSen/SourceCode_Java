import java.io.*;
class Date1
{
    public static int leap(int y)
    {
        if(y%4==0  ||  y%100==0)
        return 1;
        else 
        return 0;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int d,x,c=0,p,k=0,i=0,y=0,m=0,m1=0;
        int mon[]={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter your input : ");
        d=Integer.parseInt(br.readLine());
        y=d%10000;
        m=d/10000;
        System.out.println("The number of days after which the date is to be found is "+m);
        x=m;
        p=0;
           if(x>365)
        {
            c=x/365;
            x=x%365;
            y=y+c;
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
        System.out.println("Date after "+m+" days : ");
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