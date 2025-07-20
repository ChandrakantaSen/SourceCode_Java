class recursion
{
public static void main(int n)//when input=5;output=5,4,3,2,1,
{
if(n==0)
return;
System.out.print(n+" ");
main(n-1);
    }
}