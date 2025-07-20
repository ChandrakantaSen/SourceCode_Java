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

class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("weeping... | 2nd Derived Class Method");
	}
}

class MultiLevelInheritance
{
	public static void main(String args[])
	{
		BabyDog d=new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}