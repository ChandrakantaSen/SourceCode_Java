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
		System.out.println("barking...");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("meowing...");
	}
}

class HierarchialInheritence
{
	public static void main(String args[])
	{
		Cat c=new Cat();
		c.meow();
		c.eat();
		//c.bark();//C.T.Error

		Dog d = new Dog();
		d.bark();
		d.eat();
	}
}