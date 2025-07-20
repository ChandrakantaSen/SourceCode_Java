class Detail
{
    String name,address,telno;
    int rent;
    Detail()
    {
    }
    Detail(String n,String a,String t,int r)
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println("Name of customer : "+name);
        System.out.println("Address of customer : "+address);
        System.out.println("Telephone Number. : "+telno);
    }
}
