import java.io.*;
class poweris
{
    static int n,m;//instance variables
    static double p;//instance variables
    poweris()//default constructor
    {
        n=0;
        m=0;
        p=0.0;
    }

    public static int power(int n,int m)
    {
        if(m==0)
            return 1;
        else
            return (n*power(n,m-1));
    }

    public static void findresult()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("enter the no....");
        n=Integer.parseInt(br.readLine());//store the number
        System.out.println("enter the power....");
        m=Integer.parseInt(br.readLine());//store the power
        int f=0;int g=0;
        if(n<0){
            n=-n;
            g=1;
        }
        if(m<0){
            m=-m;
            f=1;}
        p=power(n,m);
        if(f==1)
            p=1/p;;
        if(g==1)
            p=-p;
    }

    void printresult()
    {
        System.out.println("The power is ...."+p);
    }

    public static void main(String args[])throws IOException
    {
        poweris ob=new poweris();
        ob.findresult();
        ob.printresult();
    }
}