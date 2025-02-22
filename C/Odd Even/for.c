#include<stdio.h>

int main(){
    
    int lm = 100;
    int i=0;
    for(;i<=lm;i++){
        if(!(i%2 == 0)){
            printf("Odd  : %d\n",i);
        }else{
            printf("Even : %d\n",i);
        }
    }
    
    return 0 ;
}