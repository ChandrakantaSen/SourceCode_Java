// toString.java

// By Kip Irvine.
// Demonstrating the toString( ) method in classes that use inheritance.
// Updated 1/1/2003

class Shape
{
	Shape( int _color )
	{ color = _color; }
	
	public String toString()
	{  
		return "color = " + color;
	}
	int color;
}

class Point
{	
	public Point( int xx, int yy )
	{ x=xx; y=yy; }

	public String toString()
	{
		return "(" + x + "," + y + ")";
	}

	private int x;
	private int y;
}

class Rectangle extends Shape
{
	public Rectangle( int color, Point ul, Point lr )
	{
		super( color );
		upperLeft = ul;
		lowerRight = lr;
	}

	public String toString()
	{
		return super.toString() + ", UL=" + upperLeft.toString()
			+ ", LR=" + lowerRight.toString();
	}

	private Point upperLeft;
	private Point lowerRight;
}

class ShapeTest 
{
	public static void main( String[] args )
	{
		Shape s1 = new Rectangle( blue, new Point(1,1), new Point(50,60) );

		System.out.println( s1 );
	
	}
	
	static final int blue = 1;
} // ShapeTest	