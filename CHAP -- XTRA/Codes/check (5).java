class check
{
    public static void main(int d)
    {
        int y= d/365;
        int nm= d%365;
        int m= nm%30;
        int day= nm%30;
        System.out.println(y+"years" +m+"months"+day+"days");
    }
}