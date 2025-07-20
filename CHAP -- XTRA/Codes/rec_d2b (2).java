class rec_d2b
{
public static int main(int n)//decimal to binary
{
if(n<2)
return n;
return main(n%2)+10*(main(n/2));
    }
}