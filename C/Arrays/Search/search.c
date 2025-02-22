#include<stdio.h>

int main(){

    int sk,lm;//SearchKey,LiMit
    printf("Enter array limit\n");
    scanf("%d",&lm);

    printf("Enter values to search\n");
    int a[lm];
    for(int i=0;i<lm;i++){
        scanf("%d",&a[i]);
    }
    printf("Enter one of the value\n");
    scanf("%d",&sk);
    int p=0;
    for(int i=0;i<lm;i++){
        if(sk==a[i]){
            printf("Entered value %d is %d in order you entered\n",a[i],i+1);
            p=1;
        }
    }
    if(p==0){
        printf("Go sleep\n");
    }

    return 0;
}