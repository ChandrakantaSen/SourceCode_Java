/*import java.io.*;
class TelDic
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n;
    
    public void input()throws IOException
    {
    System.out.println("Enter no of customers:");
    n=Integer.parseInt(br.readLine());
    String a[]=new String[n];
    String b[]=new String[n];
    for(int i=0;i<n;i++)
    {
    System.out.println("Enter ur name:");
    a[i]=br.readLine();
    System.out.println("Enter ur fone no:");
    b[i]=br.readLine();
    }
    }
    
    
    public void display()throws IOException
    {
       System.out.println("Name"+"\t\t"+"Fone no.");
       for(int i=0;i<n;i++)
       {
       System.out.println(a[i]+"\t"+b[i]);
    }


    }
    public void find_no()throws IOException
    {
    System.out.println("Enter ur name:");
    String s1=br.readLine();
    for(int i=0;i<n;i++)
    {
        if(s1.equalsIgnoreCase(a[i]))
        System.out.println("Ur fone no is"+b[i]);
        System.out.println()
    }
}

    public void change_no()throws IOException
    {
       System.out.println("Please enter ur name sir/mam");
       String s=br.readLine();
       String s2;
       for(int i=0;i<n;i++)
       {
           if(a[i].equalsIgnoreCase(s))
           {
      System.out.println("Do u want to change ur fone no(Y/N)");
      s2=br.readLine();
      if(s2.equalsIgnoreCase("Y"))
      {
      System.out.println("Enter ur new no");
      b[i]=br.readLine();
    }
      else
      {
          System.out.println("Thank u!4 using meh!!!!!!!");
        }
        break;
    }
}
    }
    
    public void menu()throws IOException
    {
        int ch;
        int f=1;
        do
        {
    System.out.println("  *M E N U*  ");
    System.out.println("PRESS 1 TO INPUT DATA");
    System.out.println("PRESS 2 TO DISPLAY DATA");
    System.out.println("PRESS 3 TO FIND THE NO FROM THE DIRECTORY");
    System.out.println("PRESS 4 TO CHANGE THE FONE NO");
    System.out.println("PRESS 5 TO EXIST");
    System.out.println("Enter ur choice please:");
    ch=Integer.parseInt(br.readLine());
    switch(ch)
    {
        case 1:
        input();
        break;
        
        case 2:
        display();
        break;
        
        case 3:
        find_no();
        break;
        
        case 4:
        change_no();
        break;
        
        case 5:
        f=0;
        System.out.println("Thank u!");
        break;
        default:
        System.out.println("Enter no from the menu(1-5)");
    }
}while(f!=0);
    }
}
    }
}
   */
  
  import java.io.*;

class TelDic
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String a[];
	String b[];
	int n;
    
	public void input() throws IOException          // method for taking input from user
	{
		System.out.println("How many names?");
		n=Integer.parseInt(br.readLine());
		a=new String[n];
		b=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			a[i]=br.readLine();              // names are stored in an array of type String
			System.out.println("Enter phone no.");
			b[i]=br.readLine();          // phone numbers are stored in an array of type String
		}
	}

	public void display()           
	{
		System.out.println("\n Name"+"\t\t"+"Telephone No."); 
		System.out.print("________________________________");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"\t"+b[i]);
		}
	}

	public void findNo() throws IOException    
	{
		System.out.println("Your Name Please: ");
		String s=br.readLine();
		for(int i=0;i<n;i++)
		{
			if(a[i].equalsIgnoreCase(s))  /* matches the name which is entered by the user
                                            with the existing names ignoring case */ 
			{
				System.out.println("Your Phone Number = "+b[i]);
				System.out.println();
				break;
			}
           
		}
	}
    
                                                                                                                                            
	public void changeNo() throws IOException
	{
		System.out.println("Your name please, Sir/Mam :");
		String s=br.readLine();
		String s1;
		for(int i=0;i<n;i++)
		{
			if(a[i].equalsIgnoreCase(s))     /* matches the name which is entered by the user
                                                with the existing names ignoring case */
			{
				System.out.println("Do you want to change phone number? (Y/N)");
				s1=br.readLine();
				if(s1.equalsIgnoreCase("Y"))       // true if the user enters y or Y 
				{
					System.out.println("Enter new phone number");
					b[i]=br.readLine();  // old phone number is replaced by the new one
				}
				else
				{
					System.out.println("Thank You for using me");
				}
				break;    // control comes out of the for loop
			}
		}
	}
    

	public void menu() throws IOException
	{
		int choice;
		int f=1;
		do
		{
			System.out.println("MENU");
			System.out.println("PRESS 1 TO ENTER DATA");
			System.out.println("PRESS 2 TO  DISPLAY DATA");
			System.out.println("PRESS 3 TO SEARCH ANY DATA");
			System.out.println("PRESS 4 TO CHANGE EXISTING PHONE NUMBER");
			System.out.println("PRESS 5 TO EXIT");
			System.out.println("Enter Your Choice Please :");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
					input();      // input() method is called from here
					break;
				case 2:
					display();  // display() method is called from here
					break;
				case 3:
					findNo();
					break;
				case 4:
					changeNo();
					break;
				case 5:
					f=0;
					System.out.println("Thank you, See U again");
					break;
				default:      // if user enters any choice other than 1 to 5 default case is executed
					System.out.println("Please enter a valid choice :(1 - 5)");
			}
		}while(f!=0);
	}
}
