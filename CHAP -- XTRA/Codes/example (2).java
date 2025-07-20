class example
{
    int a;
    static int count;
    example()
    {
        a=0;
    }
    void getcount()
    {
        a=++count;
    }
    void givecount ()
    {
        System.out.println ("value of a="+a);
        System.out.println ("counter value ="+count);
    }
}

        