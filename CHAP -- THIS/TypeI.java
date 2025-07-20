/*Case - 1: Used to refer current class instance variable */

class Student
{  
    int rollno;  
    String name;  
    float fee;  
	
	/*Student(int rollno, String name, float fee)
	{  
    	rollno = rollno;  
    	name = name;  
    	fee = fee;  
    }*/
    
    Student(int rollno, String name, float fee)
	{  
    	this.rollno = rollno;  
    	this.name = name;  
    	this.fee = fee;  
    }  
    	
    void display()
    {
    	System.out.println("Roll No. is: " + rollno);
    	System.out.println("Name is: " + name);
    	System.out.println("Fee is: " + fee);
    }  
}  

class Type1
{  
    public static void main(String args[])
    {  
    	Student obj = new Student(111,"Chandrakanta",5000);  
    	obj.display();
	}
}  