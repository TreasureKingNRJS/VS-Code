#include<stdio.h>

int main(){

    float a,b;
    int op;
    printf("Enter two numbers and operator( 1 for '+', 2 for '-' , 3 for '*' , 4 for '/')\n");
    scanf("%f%f%d",&a,&b,&op);
    if(op==1){
        printf("Result = %.0f + %.0f = %.0f\n",a,b,a+b);
    }else if(op==2){
        if(b>a){
            printf("Result = %.2f - %.2f = %.2f\n",b,a,b-a);
        }else{
            printf("Result = %.2f - %.2f = %.2f\n",a,b,a-b);
        }
    }else if(op==3){
        printf("Result = %.2f * %.2f = %.2f\n",a,b,a*b);
    }else if(op==4){
        printf("Result = %.2f / %.2f = %.2f\n",a,b,a/b);
    }else{
        printf("Invalid entry\n");
    }
    return 0;
        
}