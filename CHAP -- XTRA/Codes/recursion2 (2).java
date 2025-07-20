class recursion2
{
public static void main(int n)//wken input=5;output=1,2,3,4,5,
{
if(n<1)
return;
main(n-1);
System.out.print(n+" ");
    }
}