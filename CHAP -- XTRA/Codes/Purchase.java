class Purchase 
{
    public static void main (int a,int b)
    {
        int l,p,k; 
        int netl,netp;
        l = (a*15)/100;
        p = (b*10)/100;
        netl = (a-l);
        netp = (b-p);
        k = (netl+netp);
        System.out.println("cost of laptop "+a);
        System.out.println("discount of laptop "+l);
        System.out.println("net pay of the laptop "+netl);
        System.out.println("cost of printer "+b);
        System.out.println("discount of the printer "+p);
        System.out.println("net pay of the printer "+netp);
        System.out.println("total cost i have to pay "+k);
        
    }
}