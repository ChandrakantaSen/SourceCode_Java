import java.util.*;
class Detail
{
    String address;
    long telno;
    int rent;
    Detail (String ad,long t,int r)
    {
        address=ad;
        telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println("Address: "+address);
        System.out.println("Telephone number: "+telno);
        System.out.println("Rent: "+rent);
    }
}