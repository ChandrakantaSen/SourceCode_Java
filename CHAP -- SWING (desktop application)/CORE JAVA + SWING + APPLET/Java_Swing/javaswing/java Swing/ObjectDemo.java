// ObjectDemo.java, by Mark Weiss

// Demonstrates toString(), equals(), clone(),
// and hashCode().

import java.util.Date;
import java.text.DateFormat;

class Person implements Cloneable
{
    private String name;		// doesn't need cloning
    private Date   birthDate;	// must be cloned
	
    public Person( String nm, Date bd )
    {
        name = nm;
        birthDate = bd;
    }
    
    public String getName( )
    {
        return name;
    }
    
    public Date getBirthDate( )
    {
        return birthDate;
    }

    public String toString( )
    {
        return getClass( ).toString( ) + " " + getName( ) + " " + getBirthDate( );
    }
 
/**
 	By definition, equals() must return false if either
 	object is null or the objects are not of the same class.
*/    
    public boolean equals( Object obj )
    {
        if( obj == null || getClass( ) != obj.getClass( ) )
            return false;
            
        Person other = (Person) obj;
        
        return getName( ).equals( other.getName( ) );
    }
    
/** 
	Generates and return a hash code from person's name.
*/    
    public int hashCode( )
    {
        return getName( ).hashCode( );
    }
    
/**	
 	Calls super.clone() before copying the birthDate.
 	String.clone() is not called because strings are immutable. 
*/ 	  
    public Object clone( ) throws CloneNotSupportedException
    {
        Object copy = super.clone( );
        ((Person)copy).birthDate = (Date) birthDate.clone( );
        return copy;
    }
}

class Student extends Person 
{
    public Student( String nm, Date bd, int studentId )
    {
        super( nm, bd );
        id = studentId;
    }
    
    public int getID( )
    {
        return id;
    }
    
    public boolean equals( Object obj )
    {
        // this test handles null and same class
        if( !super.equals( obj ) )
            return false;
        
        Student other = (Student) obj;
        return getID( ) == other.getID( );
    }
    
    // Returns a "custom" hash code that combines the one
    // returned by Person with the current ID number.
    public int hashCode( )
    {
        return super.hashCode( ) ^ id;
    }
        
    public String toString( )
    {
        return super.toString( ) + " " + getID( );
    }
    
    public Object clone( ) throws CloneNotSupportedException
    {
        Object copy = super.clone( );
        
        //Student copy = new Student( getName( ), getID( ) ); // WRONG!!
        return copy;
    }
    private int id;
}

class Undergrad extends Student
{
    public Undergrad( String nm, Date bd, int id )
    {
        super( nm, bd, id );
    }
}

class Faculty extends Person
{
    public Faculty( String nm, Date bd )
    {
        super( nm, bd );
    }
}

class ObjectDemo
{
    public static void main( String[] args )
    {
        DateFormat df = DateFormat.getDateInstance( );

        Date d1 = null;
        Date d2 = null;

        try
        {
            d1 = df.parse( "Jan 4, 2001" );
            d2 = df.parse( "Mar 3, 2002" );
        }
        catch( java.text.ParseException e )
        { 
            System.out.println( e );
        }

        Person s1 = new Student( "Jane Smith", d1, 1234 );
        Person s2 = new Faculty( "Jane Smith", d1 );
        Person s3 = new Student( "Jane Smith", d2, 1234 );
        Person s4 = new Undergrad( "Jane Smith", d2, 1234 );
        
        
        System.out.println( "s1: " + s1 + " " + s1.hashCode( ) );
        System.out.println( "s2: " + s2 + " " + s2.hashCode( ) );
        System.out.println( "s3: " + s3 + " " + s3.hashCode( ) );
        System.out.println( "s4: " + s4 + " " + s4.hashCode( ) );
        
        System.out.println( "s1.equals(s2): " + s1.equals( s2 ) );
        System.out.println( "s1.equals(s3): " + s1.equals( s3 ) );
        System.out.println( "s1.equals(s4): " + s1.equals( s4 ) );
        
        try
        {
            Person s5 = (Person) s4.clone( );
            System.out.println( "s5 (clone of s4) " + s5 + " " + s5.hashCode( ) );
            System.out.println( "s4.equals(s5): " + s4.equals( s5 ) );
        }
        catch( CloneNotSupportedException e )
        {
            System.out.println( "CloneNotSupportedException was thrown" );
        }
    }
}
