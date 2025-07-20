// ShallowCopy.java

// Example of both shallow and deep copying

// by Kip Irvine
// Updated 1/12/2003


class Account // implements Cloneable
{
	public Account( String pID, double bal )
	{
		id = pID;
		balance = bal;
	}	

	public String toString( )
	{
		return id + " " + balance;
	}	

	/*public Object clone( )
	{
		try 
		{
			return super.clone( );
		}
		catch( CloneNotSupportedException e )
		{
			System.out.println( "cannot clone Account" );
			return null;
		}	
	}*/

	public double withdrawAll( )
	{
		double temp = balance;
		balance = 0;
		return temp;
	}	

	void deposit( double dep )
	{
		balance += dep;
	}	

	private String id;
	private double balance;
}


class Customer implements Cloneable 
{
	public Customer( String nm, String id, double bal )
	{
		name = nm;
		checking = new Account( id, bal );
	}	

	public void deposit( double amt )
	{
		checking.deposit( amt );
	}	

/**	Shows how not to return a reference to a 
 	mutable instance field
*/
	public Account getChecking( )
	{	
		return checking;
		//return (Account) checking.clone( );
	}	

	public Object clone( ) throws CloneNotSupportedException
	{
		return super.clone( );		// shallow copy
		
		// deep copy:
		/*Customer cloned = (Customer) super.clone( );
		cloned.checking = (Account) checking.clone( );
		return cloned;*/
	}

	public String toString( )
	{
		return name + " " + checking.toString( );
	}	

	private String name;
	private Account checking;
}	

class ShallowCopyTest
{
    public static void main( String[] args )
    {
		Customer c1 = new Customer( "Jones", "1000", 500.0 );
		System.out.println( "Starting val of c1 = " + c1 );
		
		try {
			Customer c2 = (Customer) c1.clone( );
			c2.deposit( 100.0 );			
			System.out.println( "c1 = " + c1 );
			System.out.println( "c2 = " + c2 );
		}
		catch( CloneNotSupportedException e )
		{
			System.out.println( "Cannot clone the customer" );
		}

		// show how returning a reference can be dangerous	
		Account secret = c1.getChecking( );
		System.out.println( "Clearing out the referenced account" );
		double keepit = secret.withdrawAll( );
		
		System.out.println( "c1 = " + c1 );
	}
	
}		