class Room
{
	int length;
	int breath;
	Room()
	{
		length=10;
		breath=10;
	}
	Room(int x,int y)
	{
		length = x;
		breath = y;
	}
	int area()
	{
	 return(length*breath);
	}
}
class BedRoom extends Room
{
	int height;
	BedRoom()
	{
		super();
		height=10;
	}
	BedRoom(int x, int y, int z)
	{
		super(x,y);
		height = z;
	}
	int volume()
	{
		return (length * breath * height);
	}
}
	class Inhertest
	{
		public static void main(String args[])
		{
			System.out.println(" By passing default argument constructor");
			BedRoom room1=new BedRoom();
			int area1=room1.area();
			int volume1=room1.volume();
			System.out.println("Area="+area1);
			System.out.println("volume="+volume1);
			System.out.println("By passing argument constructor");
			System.out.println("***********************************");
			BedRoom room2=new BedRoom(3,5,4);
			int area2=room2.area();
			int volume2=room2.volume();
			System.out.println("Area="+area2);
			System.out.println("volume="+volume2);

		}
	}

