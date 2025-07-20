class rec_b2d
{
public static int main(int n)//binary to decimal
{
if(n<2)
return n;
return main(n%10)+2*(main(n/10));
    }
}