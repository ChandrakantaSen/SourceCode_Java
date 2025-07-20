package All;

import java.util.*;
class transport
{
    public static void main(String args[])
    {
        double charges,weight=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Number");
        charges=scan.nextDouble();
        if(weight<=10)
        {
        charges=weight*20;
        }
        else if (weight>10&&weight<=30)
        {
        charges=weight*10;
    }
    else if(weight>30&&weight<=50)
    {
        charges=weight*8;
    }
    else if(weight>50)
    {
        charges=weight*5;
    }
    System.out.print("The Transportation charge of a parcel from Delhi to Kolkata is " +charges);
}
}
   