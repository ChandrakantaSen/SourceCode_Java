class Animal
{
	void eat()
	{
		System.out.println("eating... | Base Class Method");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("barking... | Derived Class Method");
	}
}

class SingleInheritence
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.bark();
		d.eat();

	}
}