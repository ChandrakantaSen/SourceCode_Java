import java.io.*;
class no_to_wrd
{
    static void no(int n)
    {
        switch(n)
        {
            case 1:System.out.print("one ");break;
            case 2:System.out.print("two ");break;
            case 3:System.out.print("three ");break;
            case 4:System.out.print("four ");break;
            case 5:System.out.print("five ");break;
            case 6:System.out.print("six ");break;
            case 7:System.out.print("seven ");break;
            case 8:System.out.print("eight ");break;
            case 9:System.out.print("nine ");break;
            case 10:System.out.print("ten ");break;
            case 11:System.out.print("eleven ");break;
            case 12:System.out.print("twelve ");break;
            case 13:System.out.print("thirteen ");break;
            case 14:System.out.print("fourteen ");break;
            case 15:System.out.print("fifteen ");break;
            case 16:System.out.print("sixteen ");break;
            case 17:System.out.print("seventeen ");break;
            case 18:System.out.print("eighteen ");break;
            case 19:System.out.print("nineteen ");break;
            case 20:System.out.print("twenty ");break;
            case 30:System.out.print("thirty ");break;
            case 40:System.out.print("forty ");break;
            case 50:System.out.print("fifty ");break;
            case 60:System.out.print("sixty ");break;
            case 70:System.out.print("seventy ");break;
            case 80:System.out.print("eighty ");break;
            case 90:System.out.print("ninety ");break;
        }
    }
    static void main(int m)
    {
        System.out.print(m+":");
        int d1=0,d2=0,n=m;
        if(n>=10000000)
        {
            d1=n/10000000;
            if(d1>19)
            {
                d2=d1/10;
                no(d2*10);
                no(d1%10);
            }
            else
            {
            no(n/10000000);
            }
            System.out.print("crores ");
            n=n%10000000;
        }
        if(n>=100000)
        {
            d1=n/100000;
            if(d1>19)
            {
                d2=d1/10;
                no(d2*10);
                no(d1%10);
            }
            else
            {
            no(n/100000);
            }
            System.out.print("lakhs ");
            n=n%100000;
        }
        if(n>=1000)
        {
            d1=n/1000;
            if(d1>19)
            {
                d2=d1/10;
                no(d2*10);
                no(d1%10);
            }
            else
            {
            no(n/1000);
            }
            System.out.print("thousand ");
            n=n%1000;
        }
        if(n>=100)
        {
            d1=n/100;
            no(d1);
            System.out.print("hundred ");
            n=n%100;
        }
            if(n>19)
            {
                d2=n/10;
                no(d2*10);
                no(n%10);
            }
            else
            {
                no(n);
            }
        }
    }