/*Compile in prgrammiz Online C compiler*/
#include <stdio.h>

int main(){

    float a,b ;
    char ch;
    int op;

    printf("Do you want to show answers in decimals(.) or integers(i) (Enter the symbol)\n");
    scanf("%c",&ch);
    
    if(!((ch=='.')||(ch=='i'))){
        printf("Invalid entry");
        return 0;
    }

    printf("Enter two numbers\n");
    scanf("%f%f",&a,&b);
    printf("Enter 1 for + , 2 for - , 3 for * , 4 for /\n");
    scanf("%d",&op);

    if(ch=='.'){
        switch (op)
        {

        case 1:
            printf("Sum = %.2f + %.2f = %.2f",a,b,a+b);
            break;

        case 2:
            if(a<b){

                printf("Difference = %.2f - %.2f = %.2f",b,a,b-a);

            }else{

                printf("Difference = %.2f - %.2f = %.2f",a,b,a-b);

            }
            break;

        case 3:
            printf("Product = %.2f * %.2f = %.2f",a,b,a*b);
            break;

        case 4:
        printf("Quotient = %.2f / %.2f = %.2f",a,b,a/b);
        break;

        default:
            printf("Invalid entry(.)");
            break;

        }
    }
    else{
        int a1 = (int) a;
        int b1 = (int) b;
        switch (op)
        {

        case 1:
            printf("Sum = %d + %d = %d",a1,b1,a1+b1);
            break;

        case 2:
            if(a1<b1){

                printf("Difference = %d - %d = %d",b1,a1,b1-a1);

            }else{

                printf("Difference = %d - %d = %d",a1,b1,a1-b1);

            }
            break;

        case 3:

            printf("Product = %d * %d = %d",a1,b1,a1*b1);
            break;

        case 4:;

            int r;
            int Q = a1/b1;
            if( Q == 0 ){
                r = a1;
            }else{
                r = (int) a1 % b1;
            }
            printf("Quotient = %d / %d = %d\n",a1,b1,Q);
            printf("Remainder = %d",a1%b1);
            break;

        default:
            printf("Invalid entry(i)");
            break;
        }
    }

    return 0 ; 

}