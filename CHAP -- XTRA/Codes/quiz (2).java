import java.io.*;
class quiz
{
public static void main(String args[])throws IOException
{
String name;
int scsc=0;
InputStreamReader reader=new InputStreamReader (System.in);
BufferedReader br=new BufferedReader (reader);
System.out.println("Welcome to the LER quiz contest.");
System.out.println("Test your GK skills and get your national rating");
System.out.println("Win exciting prizes online");
System.out.println("Follow the simple instructions during the course of the game");
System.out.println("Its easy. Try it!!!");
level_1 obj1=new level_1();
level_2 obj2=new level_2();
level_3 obj3=new level_3();
System.out.println("enter you name");
name=br.readLine();
System.out.println("Instructions:-");
System.out.println("Read the questions and type in the correct option(A,B,C or D)");
System.out.println("LEVEL 1");
System.out.println("HISTORY");
obj1.history();
System.out.println("LITERATURE");
obj1.literature();
System.out.println("MYTHOLOGY");
obj1.mythology();
System.out.println("ENTERTAINMENT");
obj1.entertainment();
System.out.println("INDIA");
obj1.india();
System.out.println("LEVEL 2");
    System.out.println("GEOGRAPHY");
    obj2.geography();
    System.out.println("MATHS AND SCIENCE");
    obj2.maths_science();
   System.out.println("HISTORY");
    obj2.hist();
  System.out.println("GENERAL KNOWLEDGE");
    obj2.gk();
    System.out.println("SPORTS");
    obj2.sports();
  System.out.println("LEVEL 3");
     System.out.println("ASTRONOMY");
     obj3.astronomy();
    System.out.println("WILDLIFE");
     obj3.wildlife();
    System.out.println("GENERAL KNOWLEDGE");
     obj3.gk();
     System.out.println("POLITICS/CIVICS");
     obj3.politics_civics();
     System.out.println("ABBREVIATIONS");
     obj3.abbreviations();
    }
}
