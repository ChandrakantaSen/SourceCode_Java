class tellephonebill
{public static void main(double u)
    {double a=0.0;
     if (u<=100 )
        a=250;
     else if (u>100&& u<=150)
        a=250+((u-100)*2.5);
     else if (u>150)
     a=250+(50*2.5)+(u-150);
     System .out.print("total amount is "+a);
    }
}
        
        
        
        
        
        
        
        
