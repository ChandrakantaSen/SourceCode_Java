//A java program consisting one single file:
public class Example10
{
public static void main(String argv[])
{
Father father=new Father();
Mother mother=new Mother();
Son son=new Son();
Daughter daughter=new Daughter();
father.fatherMethod();
mother.motherMethod();
son.sonMethod();
daughter.daughterMethod();
    }
}
class Father
{
public void fatherMethod()
{
System.out.println("Hello Father");
    }
}
class Mother
{
public void motherMethod()
{
System.out.println("Hello Mother");
    }
}
class Son
{
public void sonMethod()
{
System.out.println("Hello Son");
    }
}
class Daughter
{
public void daughterMethod()
{
System.out.println("Hello Daughter");
    }
}