package All;

class func
{
    int length,breadth;
    
    void getdata(int x, int y)
    {
        length=x;
        breadth=y;
    }
    
    int rectArea()
    {
        int area = length * breadth;
        return area;
    }
    
    public static void main()
    {
        int p;
        func obj = new func();
        
        obj.getdata(10,12);
        p= obj.rectArea();
        
        
    }
}