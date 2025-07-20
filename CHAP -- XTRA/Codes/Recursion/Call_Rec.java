class Call_Rec
{
    static void inc(Rec n)
    {
        System.out.println("Value before increament "+n.x);
        n.x = n.x+1;
        System.out.println("Value after increament "+n.x);
    }

    public static void main(String args[])
    {
        Rec obj = new Rec();
        obj.x = 3;
        System.out.println("Value before calling function "+obj.x);
        inc(obj);
        System.out.println("Value after calling function "+obj.x);
    }
}