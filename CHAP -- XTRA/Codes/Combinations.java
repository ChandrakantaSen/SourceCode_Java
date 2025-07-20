import java.util.*;
class Combinations
{
    int n,k;
    double C;
    Scanner sc=new Scanner(System.in);
    Combinations()
    {
        n=0;
        k=0;
        C=0.0;
    }
    void read()
    {
        System.out.println("Enter the values of k & n");
        k=sc.nextInt();
        n=sc.nextInt();
    }
    int fact(int x)
    {
        if(x==0)
        return 1;
        else
        return x*(fact(x-1));
    }
    void compute()
    {
        C=fact(n)/(fact(k)*fact(n-k));
    }
    void display()
    {
        System.out.println("The result is= "+C);
    }
    public void main()
    {
        Combinations ob=new Combinations();
        ob.read();
        ob.compute();
        ob.display();
    }
}