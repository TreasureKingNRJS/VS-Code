#include<stdio.h>

int main(){

    int lm;//LiMit
    printf("Enter array limit\n");
    scanf("%d",&lm);

    printf("Enter values to sort\n");
    int a[lm];
    
    for(int i=0;i<lm;i++){
        scanf("%d",&a[i]);
    }
    printf("In increase(1) or Decrease(2)\n");
    int s;
    scanf("%d",&s);
    if(s==1){
        for(int i=0;i<lm-1;i++){
            for(int j=i+1;j<lm;j++){
                if(a[i]>a[j]){
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }else if(s==2){
        for(int i=0;i<lm-1;i++){
            for(int j=i+1;j<lm;j++){
                if(a[i]<a[j]){
                    int temp = 0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
            }
        }
    }
    }else{
        printf("Invalid Entry\n");
        return 0;
    }
    printf("\n\n____________Sorted Result____________\n\n");
    for(int i=0;i<lm;i++){
        printf("                 %d\n",a[i]);
    }

    return 0;
}