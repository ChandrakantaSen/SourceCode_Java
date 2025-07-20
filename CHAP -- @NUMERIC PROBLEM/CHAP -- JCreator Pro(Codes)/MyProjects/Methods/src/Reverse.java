import java.util.Scanner;

public class Reverse
{
	void rev()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the range: ");
		int n = scan.nextInt();

		System.out.println("Enter the elements: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
		{
			arr[i] = scan.nextInt();
		}

		System.out.println("Elements are in reverse order:");
		for (int i = n - 1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args)
	{
		Reverse obj = new Reverse();
		obj.rev();
	}
}