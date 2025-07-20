class Employee
{
	private int empId;
	private String empName;
	private Date empDOB;
}

class DataHiding
{
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		emp1.empName = "abc";

		Employee emp2 = new Employee();
		emp2.empName = "efg";
		System.out.println("Value of Object-1: " + emp1.empName);
		System.out.println("Value of Object-2: " + emp2.empName);
	}
}
