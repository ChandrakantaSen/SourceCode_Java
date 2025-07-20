import java.util.Scanner;

class Smith {
public static void main(String args[])

{
int i,j, n,n1, num;
int a[] = new int[100];

int k = 0, sum1 = 0, sum2 = 0;
int digit;

Scanner in = new Scanner(System.in);
System.out.println("\nEnter lower limit and upper limit : ");
n = in.nextInt();
n1=in.nextInt();
for(j=n;j<=n1;j++)
{
num = j;
while (num != 0) {
digit = num % 10;
sum1 += digit;
num /= 10;
}
num = j;
for (i = 2; i < j; i++) {
while (num % i == 0) {
a[k] = i;
k++;
num /= i;
}

}
//System.out.println("Prime Factorisation");
//for (i = 0; i < k; i++)
//System.out.print(a[i] + " ");
for (i = 0; i < k; i++) {
while (a[i] != 0) {
digit = a[i] % 10;
sum2 += digit;
a[i] /= 10;
}
}
//System.out.println("\nSum of digits of the number: " + sum1);
//System.out.println("\nSum of digits of the prime factors: " + sum2);
if (sum1 == sum2)
System.out.println(j+" is a Smith Number.");
//else
//System.out.println("It is not a Smith Number.");
sum1=0;sum2=0;k=0;
}
}
}

