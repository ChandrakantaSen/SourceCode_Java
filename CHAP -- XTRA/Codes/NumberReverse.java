/*W.a.p to find the reverse of the given digit*/
class Reverse
{
	int a;
	public int cal(int x)
	{
		a=x;
		int dig=0;
		int num=0;
		while(a!=0)
		{
			dig=a%10;
			num=10*num+dig;
			a=a/10;
		}
		return(num);
	}
}
			

class NumberReverse
{
	public static void main(String args[])
	{
		int n=12345;
        Reverse Reverse1=new Reverse();
        int r1=Reverse1.cal(n);
        System.out.println("The original number is " + n + " Reverse number is " + r1);
	}
}