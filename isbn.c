#include <stdio.h>
void main()
{
    long num, temp, digit, sum = 0,count=1;
    printf("Enter the number \n");
    scanf("%ld", &num);
    temp = num;
    while (num > 0&&num!=0)
    {
        digit = (num % 10)*count;
        sum  = sum + digit;
        num /= 10;
        count++;
    }
    if((sum%11)==0)
    {
        printf("ISBN number");
    }
    else
    {
        printf("Not ISBN number");
    }
}
