/**A smith number is a composite number, the sum of whose digits is the sum of
the digits of its prime factors obtained as a result of prime factorization
(excluding 1). The first few such numbers are 4, 22, 27, 58, 85, 94, 121 …

Example :

    1.  666
      Prime factors are 2, 3, 3 and 37
      Sum of the digits are (6+6+6) = 18
      Sum of the digits of the factors (2+3+3+(3+7) = 18

    2.  4937775
      Prime factors are 3, 5, 5, 65837
      Sum of the digits are (4+9+3+7+7+7+5) = 42
      Sum of the digits of the factors (3+5+5+(6+5+8+3+7) = 42

    Write a
program
to input a number and display whether the number is a Smith



*/


import java.util.Scanner;

class Smith {
public static void main(String args[])

{
int i, n, num;
int a[] = new int[100];

int k = 0, sum1 = 0, sum2 = 0;
int digit;

Scanner in = new Scanner(System.in);
System.out.println("\nEnter a number: ");

n = in.nextInt();
num = n;
while (num != 0) {
digit = num % 10;
sum1 += digit;
num /= 10;
}
num = n;
for (i = 2; i < n; i++) {
while (num % i == 0) {
a[k] = i;
k++;
num /= i;
}

}
System.out.println("Prime Factorisation");
for (i = 0; i < k; i++)
System.out.print(a[i] + " ");
for (i = 0; i < k; i++) {
while (a[i] != 0) {
digit = a[i] % 10;
sum2 += digit;
a[i] /= 10;
}
}
System.out.println("\nSum of digits of the number: " + sum1);
System.out.println("\nSum of digits of the prime factors: " + sum2);
if (sum1 == sum2)
System.out.println("It is a Smith Number.");
else
System.out.println("It is not a Smith Number.");

}
}

