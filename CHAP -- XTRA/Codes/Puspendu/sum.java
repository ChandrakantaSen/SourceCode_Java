package Puspendu;

class sum
{
    private int x,y,z;
    private void getValue()
    {
        x=5;
        y=8;
    }
    void add()
    {
        getValue();
        z=x+y;
    }
    void display()
    {
        System.out.println("Sum of the 4 numbers : "+z);
    }
}
class abc
{
public static void main()
{
    sum ob=new sum();
    ob.add();
    ob.display();
}
}