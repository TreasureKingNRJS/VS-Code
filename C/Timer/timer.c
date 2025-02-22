#include<stdio.h>
#include <time.h>
 
void delay(ms){
    clock_t start = clock();
    while(clock() < start + ms);
}
 

int main(){
    int h,m,s;
    for(h=0;h<800;h++){
        for(m=0;m<60;m++){
            for(s=0;s<60;s++){
                printf("%d : %d : %d \n",h,m,s);
                delay(1000);
            }
        }
    }
    return 0;
}