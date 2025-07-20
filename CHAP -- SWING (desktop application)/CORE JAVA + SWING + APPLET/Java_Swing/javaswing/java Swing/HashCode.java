// HashCode.java

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
    
	public int hashCode()
	{
		return getName().hashCode();
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
        return getTalent( ).equals( other.getTalent( ) );
	}

	public int hashCode()
	{
		return super.hashCode() ^ getTalent().hashCode();
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
		Hero h2 = new Hero( "Aquaman", "swims fast" );
		
		// two Heroes are (and should be) equal:
		System.out.println("h1 hashCode = " + h1.hashCode() );
		System.out.println("h2 hashCode = " + h2.hashCode() );
		System.out.println( "h1.equals( h2 ): " + h1.equals( h2 ) );
		
	
	}


}		