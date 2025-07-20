/* Problem: Numeric problems */
#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include<math.h>

using namespace std;

class NumericProblem 
{
    int rng, num;
public:
    void getdata();
    void getNumber();
    void addition();
    void sumDigit();
    void revDigit();
    void evenSeries();
    void primeSeries();
    void removeZero();
    void factorial();
    void factors();
    void perfectnos();
    void armstrongnos();
    void palindromenos();
    void scndLargest();
    void nonFibonacci();

};

void NumericProblem::getdata() {
    cout << "" << "\n";
    cout << "Enter the range: ";
    cin >> rng;
    cout << "";
}

void NumericProblem::getNumber() {
    cout << "" << endl;
    cout << "Enter the number: ";
    cin >> num;
}

void NumericProblem::addition() {
    int i;
    double sum = 0;

    getdata();
    for (i = 0; i <= rng; i++) {
        sum = sum + i;
    }
    cout << "Required Sum is: " << sum;
    cout << "" << endl;
}

void NumericProblem::sumDigit() {
    int temp, d;
    double sum = 0;

    getNumber();
    temp = num;
    while (temp != 0) {
        d = temp % 10;
        sum = sum + d;
        temp = temp / 10;
    }
    cout << "Sum of the digit is: " << sum;
    cout << "" << endl;
}

void NumericProblem::revDigit() {
    int temp, d;
    double sum = 0;

    getNumber();
    temp = num;
    while (temp != 0) {
        d = temp % 10;
        sum = (sum * 10) + d;
        temp = temp / 10;
    }
    cout << "Reverse of the number is: " << sum;
    cout << "" << endl;
}

void NumericProblem::evenSeries() {
    int i;
    getdata();
    for(i = 0; i <= rng; i++)
    {
        if(i != 0 && i % 2 == 0)
        {
            cout << " " << i; 
        }
    }

}

void NumericProblem::primeSeries(){
    int i,j;
    int count = 0;
    getdata();
    for(i = 0; i <= rng; i++)
    {
        for(j = 1; j <= i; j++)
        {
            if(i % j == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            cout << " " << i;
        }
        count = 0;
    }
}

void NumericProblem::removeZero() {
    int temp, d, count;
    int sum = 0;
    getNumber();
    temp = num;
    count = 0;
    while(temp != 0)
    {
        d = temp % 10;
        if(d != 0)
        {
            sum = sum + d * pow(10,count);
            count++;
        }
        temp = temp / 10;
    }
    cout << "New number is: " << sum;
}

void NumericProblem::factorial(){
    int i, f = 1;
    getNumber();
    
    for(i = 1; i <= num; i++)
    {
        f = f * i;
    }
    cout << "Factorial is: " << f;
}

void NumericProblem::factors(){
    int i;
    getNumber();
    
    for(i = 1; i < num; i++)
    {
        if(num % i == 0)
        {
            cout << " " << i;
        }
    }
}

void NumericProblem::perfectnos(){
    int i, sum = 0;
    getNumber();
    for(i = 1; i < num; i++)
    {
        if(num % i == 0)
        {
            sum += i;
        }
    }
    if(sum == num)
    {
        cout << "Perfect Number...!" << endl;
    }
    else
    {
        cout << "Not a Perfect Number...!" << endl;
    }    
}

void NumericProblem::armstrongnos(){
    int sum = 0, temp, d;
    int count = 0;
    getNumber();
    
    temp = num;
    while(temp != 0)
    {
        temp = temp / 10;
        count++;
    }
    temp = num;
    
    while(temp != 0)
    {
        d = temp % 10;
        sum = sum + pow(d,count);
        temp = temp / 10;
    }
    
    if(sum == num)
    {
        cout << "armstrong number...!";
    }
    else
    {
        cout << "not an armstrong number...!";
    }
}

void NumericProblem::palindromenos() {
    int temp, d, sum = 0;
    getNumber();
    
    temp = num;
    while(temp != 0)
    {
        d = temp % 10;
        sum = sum * 10 + d;
        temp = temp / 10;
    }
    if(sum == num)
    {
        cout << "Palindrome Number" << endl;
    }
    else
    {
        cout << "Not a Palindrome Number" << endl;
    }
}

void NumericProblem::scndLargest() {
    int a,b,c;
    int second_max;
    cout << "" << endl;
    cout << "Enter the first number: ";
    cin >> a;
    cout << "Enter the second number: ";
    cin >> b;
    cout << "Enter the third number: ";
    cin >> c;
    
    if(a < b)
    {
        if ( b < c ) second_max = b;
        else second_max = ( a < c ? c : a );
    }
    else
    {
        if ( a < c ) second_max = a;
        else second_max = ( b < c ? c : b );
    }
    cout << "Second maximum value: " << second_max << endl;
}

void NumericProblem::nonFibonacci() {
    int n, f0 = 0, f1 = 1, f2 = 0, f3, i;
    cout << "Enter the upper range: ";
    cin >> n;
    
    while(f2 <= n)
    {
        f2 = f0 + f1;
        f0 = f1;
        f1 = f2;
        f3 = f0 + f1;
        
        for(i = f2+1; i < f3; i++)
        {
            if(i <= n)
            {
                cout << " " << i;
            }
            else
            {
                break;
            }
        }
    }
}

int main() {
    int ch;
    NumericProblem obj;
    
    
    cout << "--- Contents ---" << endl;
    cout << "0. Exit Program" << endl;
    cout << "1. Addition of n numbers." << endl;
    cout << "2. Sum of digit" << endl;
    cout << "3. Reverse of digit" << endl;
    cout << "4. Even Number Series" << endl;
    cout << "5. Prime Number Series" << endl;
    cout << "6. Remove zero from a number" << endl;
    cout << "7. Find the factorial of the number" << endl;
    cout << "8. Find the factors of a number" << endl;
    cout << "9. Check a number is perfect number or not" << endl;
    cout << "10. Check a number is Armstrong number or not" << endl;
    cout << "11. Check a number is Palindrome number or not" << endl;
    cout << "12. Find the 2nd largest number among three nos." << endl;
    cout << "13. Print non-Fibonacci Series" << endl;
    
    while (true) 
    {
        cout << endl << endl;
        cout << "Enter the choice: ";
        cin >> ch;

        switch (ch) 
        {
            case 0: exit(0);                    break;
            case 1: obj.addition();             break;
            case 2: obj.sumDigit();             break;
            case 3: obj.revDigit();             break;
            case 4: obj.evenSeries();           break;
            case 5: obj.primeSeries();          break;
            case 6: obj.removeZero();           break;
            case 7: obj.factorial();            break;
            case 8: obj.factors();              break;
            case 9: obj.perfectnos();           break;
            case 10: obj.armstrongnos();        break;
            case 11: obj.palindromenos();       break;
            case 12: obj.scndLargest();         break;
            case 13: obj.nonFibonacci();        break;
            default: cout << "Wrong Input";     break;
        }
    }
    return 0;
}