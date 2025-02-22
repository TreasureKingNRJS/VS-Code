#include<stdio.h>

int main(){

    for(float i=0;i<10;i=i+0.055){
        printf("%.2f\n",i);
    }
    for(int i=1;i<11;i++){
        printf("\nHi ");
        if(i==5){
            break;
    }
        printf("Hello");
    }
    for(int i=1;i<11;i++){
        printf("\nHi ");
        if(i==5){
            continue;
    }
        printf("Hello");
    }
    return 0 ;
    
}