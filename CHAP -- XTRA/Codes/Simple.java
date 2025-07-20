class Simple
{
    int acno;
    float balance;
    Simple(int a,int b)
    {
        acno=a;
        balance=b;
    }
    void withdraw(int w)
    {
        balance=balance-w;
    }
    void deposit(int d)
    {
        balance=balance+d;
    }
}