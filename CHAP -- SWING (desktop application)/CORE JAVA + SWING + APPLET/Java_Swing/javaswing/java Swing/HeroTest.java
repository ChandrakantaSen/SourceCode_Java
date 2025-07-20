// HeroTest.java

// Starting version, Project 1
// Updated 1/10/2003

// calls to clone() will not compile in this version

import java.util.Date;
import java.text.DateFormat;

class Canine
{
	public Canine( String pName )
	{
		name = pName;
	}
		
	public String toString( )
	{
		return name;
	}
			
	private String name;	
}	

class Hero 
{	
	public Hero( String pName )
	{ 
		name = pName; 
	}

	public String getName( )
	{
		return name;
	}	
	
	public void setName( String pName )
	{
		name = pName;
	}	
	
	private	String name;	
}  // Hero	
	
	
class SuperHero extends Hero 
{	
	public SuperHero( String pName, boolean pCanFly, Date pDiscoveredWhen )
	{
		super( pName );
		canFly = pCanFly;
		discoveredWhen = pDiscoveredWhen;
	}	
	
	private	boolean canFly;
	private	Date discoveredWhen;

}	// SuperHero


class HeroTest 		// rename to: HeroTestDone
{	
	// YOU MAY NOT MODIFY ANY CODE FROM THIS POINT ONWARD:

	public static void main( String args[] )
	{
		DateFormat df = DateFormat.getDateInstance( );
        Date d1 = null;
        Date d2 = null;

        try
        {
            d1 = df.parse( "Jan 4, 1950" );
            d2 = df.parse( "Mar 3, 1939" );
        }
        catch( java.text.ParseException e )
        { 
            System.out.println( e );
        }
        
		Hero h1 = new SuperHero( "Green Lantern", true, d1 );
		System.out.println( "h1 = " + h1.toString( ) );
		Hero h3 = null;
		System.out.println( "evaluating (h1.equals(h3)): " + h1.equals( h3 ) );

		// compare a Hero to a Canine, both having same name:
		Hero h2 = new Hero( "Hercules" );
		Canine c2 = new Canine( "Hercules" );
		System.out.println( "h2 = " + h2 );
		System.out.println( "c2 = " + c2 );
		System.out.println( "evaluating (h2.equals(c2)): " + h2.equals( c2 ) );		

		Hero h5 = h2; 		// make a reference copy of Hercules
		h5.setName( "Samson" );
		System.out.println( "h2 = " + h2 );

		System.out.println( "------------ clones follow ---------------" );		
		try 
		{
			h3 = (Hero) h1.clone( );
	        System.out.println( "h3 is a clone of h1" );	
			System.out.println( "hash codes: h3=" + h3.hashCode( ) + ", h1=" + h1.hashCode( ) );
			System.out.println( "evaluating (h3 == h1): " + (h3 == h1) );
			System.out.println( "evaluating (h3.equals(h1)): " + h3.equals( h1 ) );

			System.out.println( "" );
			Hero h4 = (Hero) h3.clone( );
	        System.out.println( "h4 is a clone of h3" );		
			System.out.println( "evaluating (h4.equals(h3)): " + h4.equals( h3 ) );
			System.out.println( "evaluating (h4.equals(h1)): " + h4.equals( h1 ) );

       	}
        catch( CloneNotSupportedException e )
        {
            System.out.println( "CloneNotSupportedException was thrown" );
        }		
	}	
	
}	// HeroTest