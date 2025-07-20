import java.io.*;
class circular_base
{
	float radius;
	void get_radius(float r)
	{
		radius=r;
	}
	float show_base_area()
	{
		return(3.14F*radius*radius);
	}
}
class cylinder extends circular_base
{
	float height;
	void get_height(float h)
	{
		height=h;
	}
	float show_volume()
	{
		return(height*show_base_area());
	}
}
//----------------------------------------
class cylinder_volume
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the Radius of the Circular Base :"); 	cylinder obj1 = new cylinder();
	obj1.get_radius(Float.parseFloat(obj.readLine()));
	System.out.println("The Area of Circular Base is : "+obj1.show_base_area());
	System.out.print("Enter the Height of the Cylinder : "); 	obj1.get_height(Float.parseFloat(obj.readLine()));
	System.out.println("The Volume of the Cylinder is : "+obj1.show_volume());

	}


}
