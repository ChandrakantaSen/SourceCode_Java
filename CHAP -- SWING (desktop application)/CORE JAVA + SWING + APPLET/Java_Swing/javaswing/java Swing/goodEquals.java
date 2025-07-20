// goodEquals.java

class Person 
{
	public Person( String pName )
	{ 
		name = pName; 
	}
	
    public boolean equals( Object rhs )
    {
        if( rhs == null || getClass( ) != rhs.getClass( ) )
            return false;
            
        Person other = (Person) rhs;
        
        return getName( ).equals( other.getName( ) );
    }
    
    public String getName( )
    { return name; }
    
    private String name;
}

class Hero extends Person 
{
	public Hero( String pName, String pTalent )
	{
		super( pName );
		talent = pTalent;
	}

	public boolean equals( Object rhs )
	{
        // this test handles null and same class
        if( !super.equals( rhs ) )
            return false;
        
        Hero other = (Hero) rhs;
        return getTalent( ) == other.getTalent( );
	}

    public String getTalent( )
    { return talent; }
    
	private String talent;
}			
		
class TestEquals {
	public static void main( String[] args )
	{
		Person p1 = new Person( "Superman" );
		Person p2 = null;
		Hero h1 = new Hero( "Superman", "flies fast" );
		Hero h2 = new Hero( "Superman", "flies fast" );
		
		// compare an Object to null
		System.out.println( "p1.equals( p2 ): " + p1.equals( p2 ) );	
		
		// two Heroes are (and should be) equal:
		System.out.println( "h1.equals( h2 ): " + h1.equals( h2 ) );
		
		// show how equals() preserves the symmetry rule. Both are
		// false because a Person is not a Hero.
		System.out.println( "p1.equals( h1 ): " + p1.equals( h1 ) );
		System.out.println( "h1.equals( p1 ): " + h1.equals( p1 ) );
	
	}


}		