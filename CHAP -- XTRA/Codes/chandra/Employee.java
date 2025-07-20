class Employee
{
    int id;
    String name;
    public void setData(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void displayData()
    {
        System.out.println("Employee ID : "+this.id);
        System.out.println("Employee Name : "+this.name);
    }

    public static void main(String args[])
    {
        Employee emp[] = new Employee[2];
        emp[0]=new Employee();
        emp[0].setData(1,"ABC");
        emp[0].displayData();
        System.out.println("----------------------------------------------------------------");
        emp[1]=new Employee();
        emp[1].setData(2,"XYZ");
        emp[1].displayData();
    }
}
