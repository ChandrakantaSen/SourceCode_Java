import java.io.*;

class factorial
{
    int n,f,x;
    factorial()
    {
        x=1;  
        n=0;
        f=1;
    }

    int fact(int n)
    {
        if(n>0)//this programme is compiled by gulzar
            return n*(fact(n-1));
        else
            return 1;
    }

    void getnumber(int x)
    {
        f=fact(x);
        System.out.println("the factorial is...."+f);
    }

    void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        factorial ob=new factorial();
        System.out.println("enter the no....");
        n=Integer.parseInt(br.readLine());
        ob.getnumber(n);
    }
}
