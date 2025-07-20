class error_handling{
	public static void main (String args[]){
		int a=10;
		int b=7;
		int c=5;
		
		int val;
		val = (a/(b-c));
		
		System.out.println("Value of a:\t"+a);
		System.out.println("Value of b:\t"+b);
		System.out.println("Value of c:\t"+c);
		System.out.println("Value of val: \t"+val);
		System.out.println("Error during division of zero!");
	}
}