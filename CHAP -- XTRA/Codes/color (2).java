class color
{
String colTop,colBottom;
    
    color()
    {
        colTop=pink;
        colBottom=black;
    }
    color(String t,String b)
    {
        colTop=t;
        colBottom=b;
    }
    public static void main(String args[])
    {
        color obj=new color();
        System.out.println("the colours of dresses are"+obj.colTop+"\t"+obj.colBottom);
        String c1="red";
        String c2="blue";
        color obj1=new color(c1,c2);
        System.out.println("The colours of the second dress are:"+obj1.colTop);
    }
}