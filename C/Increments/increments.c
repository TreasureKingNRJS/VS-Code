#include <stdio.h>
int main(){

    int a = 5;
    int b = ++a;//Pre Increment b=a=6
    ++a;
    int c = a;
    int d = a++;//Post Increment d=a and a= a+1

    printf("%d\n%d\n%d\n%d\n",a,b,c,d);

    b = --a;//Pre Decrement b=a=7
    --a;
    c = a;
    a--;//Post Decrement
    d = a--;// d=a , a= a-1

    printf("%d\n%d\n%d\n%d\n",a,b,c,d);

    return 0;
}