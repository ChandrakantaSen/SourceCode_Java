import java.io.*;
class Detail
{
    public int rent;
    public String name,add,tel;
    public Detail(String n,String a,String t,int r)
    {
        name=n;
        add=a;
        tel=t;
        rent=r;
    }
    void show()
    {
        System.out.println("Name : "+name);
        System.out.println("Address : "+add);
        System.out.println("Telephone number : "+tel);
        System.out.println("Rent : "+rent);
    }
}