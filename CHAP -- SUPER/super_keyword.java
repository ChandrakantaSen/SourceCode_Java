	class Animal{
		public void move(){
			System.out.println("Animals can move");
		}
	}

	class Dog extends Animal{
		public void move(){
			super.move(); // invokes the super class method
			System.out.println("Dogs can walk and run");
		}
	}
	
	public class super_keyword{
		public static void main(String args[]){
			Animal b = new Dog(); // Animal reference but Dog object
			b.move(); //Runs the method in Dog class
		}
	}