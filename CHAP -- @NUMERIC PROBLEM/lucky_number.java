/*** 
Consider the sequence of natural numbers
1, 2, 3, 4, 5, 6, 7 ………………………….
Removing every second number produces the sequence
1, 3, 5, 7, 9, 11, 13, 15, 17 ………………………….
Removing every third number from the above sequence produces
1, 3, 7, 9, 13, 15, 19, 21, 25, 27 ………………………….

This process continues indefinitely by removing the fourth, fifth …... and so on, 
till after a fixed number of steps, certain natural numbers remain indefinitely. 
These are known as lucky numbers. Write a program to generate and print lucky numbers less than a given number N < 50.

SAMPLE INPUT : N = 10
OUTPUT :
THE LUCKY NUMBERS LESS THAN 10 ARE:
1
3
7

SAMPLE INPUT : N = 25
OUTPUT :
THE LUCKY NUMBERS LESS THAN 25 ARE:
1
3
7
13
19 
***/

	class Lucky
    {
        public static void main(int n)
        {
            int i,j=0;
            int a[]=new int[n];
            int b[]=new int[n/2];
            for(i=0;i<n;i++)
                  a[i]=i+1;
             //for(i=0;i<n;i++)
               //  System.out.println(a[i]);
            for(i=0;i<n;i=i+2)
            {
              b[j]=a[i]; 
              j++;
            }
            for(i=2;i<n/2;i=i+3)
            {
                b[i]=0;
            }
            for(i=0;i<n/2;i++)
            {
                if(b[i]!=0)
                System.out.println(b[i]);
            }
        }
    } 