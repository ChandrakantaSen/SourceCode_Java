class calculator1
{
double result;
public calculator1()
{
double of=0;;
result=of;
    }
    public void enterfirst(double x)
    {
        result=x;
    }
    public void showResult()
    {
        if(result==(long)result)
        System.out.println("Result "+(long)result);
        else
        System.out.println("Result "+result);
    }
    public void add(double n)
    {
        result=result+n;
    }
    public void subtract(double n)
    {
        result=result-n;
    }
    public void multiply(double n)
    {
        result=result*n;
    }
    public void divide(double n)
    {
        result=result/n;
    }
    
    public void clear()
    {
        double of=0;
        result=of;
    }
}
    

