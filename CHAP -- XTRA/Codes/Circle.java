class Circle
{
    public static void main(String args[])
    {
        int r1,r2;
        double ar,ar1,ar2,c1,c2;
        r1 = 21;
        r2 = 14;
        ar1 = (22/7)*r1*r1;
        ar2 = (22/7)*r2*r2;
        ar = ar2-ar1;
        c1 = 2*(22/7)*r1;
        c2 = 2*(22/7)*r2;
        System.out.println("area of the outer circle"+ar1);
        System.out.println("area of the inner circle"+ar2);
        System.out.println("area 0f the ring "+ar);
        System.out.println("circumference of inner circle"+c1);
        System.out.println("circumference of outer circle"+c2);
    }
}
