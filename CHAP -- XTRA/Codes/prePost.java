class prePost
{
    public static void main(String args[])
    {
        int z=96;
        int d1 = (z*--z);
        int d2 = (z++ % z);
        
        int d3 = d1 + d2;
        
        System.out.println("Value of d: "+d1);
        System.out.println("Value of d: "+d2);
        System.out.println("Value of d: "+d3);
    }
}
