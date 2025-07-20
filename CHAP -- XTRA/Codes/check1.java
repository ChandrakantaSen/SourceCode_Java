package All;

class check1
{
    public static void main(int cp, int sp)
    {
        if(sp>cp)
        {
            double p=((sp-cp)/cp)*100.0;
            System.out.println("profit percent = "+p);
        }
        else
        {
        double l=((cp-sp)/cp)*100.0;
        System.out.println("loss percent = "+l);
    }
}
}

        