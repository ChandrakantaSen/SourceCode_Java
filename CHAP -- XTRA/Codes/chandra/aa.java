class aa
{
    static void main()
    {
        int m=21,u=0,c=0,x=0;
        while(m>1)
        {
            u=(int)(Math.random()*4+1);
            c=5-u;
            System.out.println("You pick "+u+" Sticks and Computer picks "+c+" sticks");
            m=m-(u+c);
        }
        System.out.println("Computer WIN!!!");
         System.out.println(Math.pow(x,0));
    }
}