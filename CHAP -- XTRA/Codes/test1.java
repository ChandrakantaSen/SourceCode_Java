class test1
{//class open
    public static void main(int p,int t,int r)
    {//main()function open
        double a,si,ci;
        si=(p*t*r)/100;
        a=p*(Math.pow((1+r/100.0),t));
        ci=a-p;
        System.out.println(" the si is " +si);
        System.out.println(" the ci is " +ci);
    }//main()function close
}//class close, 