#include<stdio.h>
int main(){

    printf("\n\n_______Prime Numbers below 5000_______\n\n");
    printf("1. 2\n2. 3\n");
    for(int i=4,sn=2;i<=5000;i++){
        int fact = 0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                fact++;
                break;
            }
        }
        if(fact==0){
            sn++;
            printf("%d. %d\n",sn,i);
        }
    } 

    return 0;
}