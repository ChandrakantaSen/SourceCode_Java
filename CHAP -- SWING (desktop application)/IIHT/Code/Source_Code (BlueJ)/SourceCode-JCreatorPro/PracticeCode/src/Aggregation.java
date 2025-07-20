class Address
{
	String street;
	String city;
	String state;
	String zip;

	Address(String street, String city, String state, String zip)
	{
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
}

class Student
{
   int roll;
   Address address;

   Student(int rollNo, Address addressDetail)
   {
      roll = rollNo;
      address = addressDetail;
   }

    void printStudentDetails(Address address1)
    {
       System.out.println("Roll   : " + roll);
       System.out.println("Street : " + address1.street);
       System.out.println("City   : " + address1.city);
       System.out.println("State  : " + address1.state);
       System.out.println("Zip    : " + address1.zip);
    }
}

class Aggregation
{
	public static void main (String[] args)
	{
       Address address1;
       address1 = new Address("1-ST","PN","Mah","41");
       Student s1 = new Student(1,address1);
       s1.printStudentDetails(address1);
    }
}