class prog1
{
    String str,n;
    prog1(String s)
    {
        str=s;
        n="";
    }
    void compute()
    {
        int l=str.length();
        n=n+str.charAt(0);
        int p=str.lastIndexOf(' ');
        for(int i=1;i<p;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            n=n+'.'+str.charAt(i+1);
        }
        n=n+'.'+str.substring(p,l);
    }
    void display()
    {
        System.out.print(n);
    }

void main(String q)
{
    prog1 ob1=new prog1(q);
    ob1.compute();
    ob1.display();
}
}
