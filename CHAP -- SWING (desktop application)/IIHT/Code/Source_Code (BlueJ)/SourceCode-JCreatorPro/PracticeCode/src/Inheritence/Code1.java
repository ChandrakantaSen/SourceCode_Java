import java.io.*;

class Square
{
	protected int side;
	public Square(int s)
	{
		side = s;
	}
	public int GetArea()
	{
		return side * side;
	}
	public void Display()
	{
		System.out.println("Side is: " + side);
		System.out.println("The area is: " + GetArea());
	}
}

class Screen extends Square
{
    private int price;
    public Screen(int s)
    {
    	super(s);
    }
    public int GetPrice()
    {
        int price;
        price = GetArea() * 10;
        return price;
    }
    public void Display()
    {
        super.Display();
        System.out.println("The price is: " + GetPrice());
    }
}

class Code1
{
	public static void main (String[] args)throws IOException
	{
		int num;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter the number: ");
        num = Integer.parseInt(in.readLine());

        Screen s = new Screen(num);
        s.Display();
	}
}
