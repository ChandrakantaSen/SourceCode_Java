class Address
{
	String city,state,country;

	Address(String city, String state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

class Emp
{
	int id;
	String name;
	Address op;	//Aggregation

	Emp(int id, String name,Address op)
	{
		this.id = id;
		this.name = name;
		this.op = op;
	}

	void display()
	{
		System.out.println(id + " " + name + " " + op.city + " " + op.state + " " + op.country);
	}
}

class Aggregation2
{
	public static void main (String[] args)
	{
		Address address1=new Address("gzb","UP","india");
		Address address2=new Address("gno","UP","india");

		Emp e1 = new Emp(111,"varun",address1);
		Emp e2 = new Emp(112,"arun",address2);

		e1.display();
		e2.display();
	}
}