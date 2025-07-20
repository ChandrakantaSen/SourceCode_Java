class AvgFun
{
    void avg(int x,int y,int z)
    {
        int d=(x+y+z)/3;
//        return d;
        System.out.print("Answer Yaha nahi hai -> "+d);
    }
    public static void main(int a,int b,int c)
    {
        //int p;
         AvgFun obj=new AvgFun();
        obj.avg(a,b,c);
        
    }
}
