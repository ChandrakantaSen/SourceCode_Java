class Library
{
    String name,author;
    int price;
    Library()
    {
    }
    Library(String n,String a,int p)
    {
        name=n;
        author=a;
        price=p;
    }
    void show()
    {
        System.out.println("Name of book :"+name);
        System.out.println("Author of book :"+author);
        System.out.println("Price of book : Rs."+price);
    }
}