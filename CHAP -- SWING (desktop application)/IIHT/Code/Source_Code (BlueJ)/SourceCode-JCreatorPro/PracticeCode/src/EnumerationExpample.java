
enum WeekDays
{ 
	sun, 
	mon, 
	tues, 
	wed, 
	thurs, 
	fri, 
	sat 
}

class EnumerationExpample
{
	public static void main(String args[])
 	{
 		//wk is an enumeration variable of type WeekDays
  		WeekDays wk; 
  		//wk can be assigned only the constants defined under enum type Weekdays
  		wk = WeekDays.sun; 
  		System.out.println("Today is "+wk);
 	}
}