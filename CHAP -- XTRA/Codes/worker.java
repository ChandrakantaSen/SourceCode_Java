import java.io.*;
class worker
{
    public String name;
    public int basic;
    public worker(String s,int bas)
    {
        name=s;
        basic=bas;
    }
    void display()
    {
        System.out.println("Name--->"+name);
        System.out.println("Basic--->"+basic);
    }
}