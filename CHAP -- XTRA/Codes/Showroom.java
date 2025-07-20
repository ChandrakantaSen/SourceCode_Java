class Showroom
{public static void main(int c)
    {int d,netpay = 0;
        if(c<=2000)
        {
            d = (c*5)/100;
        }
        else if ((c>2000)&&(c<=5000))
        {
            d = (c*25)/100;
        }
        else if ((c<5000)&&(c<=10000))
        {
            d = (c*35)/100;
        }
        else
        {
            d = (c*50)/100;
        }
        netpay = (c-d);
        System.out.println("Cost price "+c);
        System.out.println("discount "+d);
        System.out.println("net pay "+netpay);
    
    }
}
