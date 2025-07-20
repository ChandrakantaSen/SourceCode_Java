class error_handling_2{
	public static void main(String args[]){
		int a,b,c;
		int x,y;
		a=10;
		b=5;
		c=5;
		
		try{
			x=(a/(b-c)); 	//Exception Here
		}
		catch (ArithmeticException e){
			System.out.println("division by zero!");
		}
		y=(a/(b+c));
		System.out.println("y=\t"+y);
	}
}