import java.util.*;
class personal
{
    String name;
    int pan;
    double basic_pay;
    String acc_no;
    personal(String n,int p,double b,String a)
    {
        name=n;
        pan=p;
        basic_pay=b;
        acc_no=a;
    }
    void display()
    {
        System.out.println("Name= "+name);
        System.out.println("PAN= "+pan);
        System.out.println("Basic Pay= "+basic_pay);
        System.out.println("Account no.= "+acc_no);
    }
}