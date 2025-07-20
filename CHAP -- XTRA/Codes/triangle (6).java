class triangle
{//opening class
    public static void main(int a,int b,int c)
    {//opening main()function
       if(a==b&&b==c)
        {
           System.out.println("Triangle is equilateral");
        }
        else if(a==b||b==c||c==a)
        {
            System.out.println("Triangle is isosceles");
        }
        else if(a!=b &&b!=c&&c!=a)
        {
            System.out.println("Triangle is scalene");
        }
    }//closing main()function
}//closing class
