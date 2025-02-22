#include<stdio.h>
int main(){

    int limit;
    printf("Enter array limit\n");
    scanf("%d",&limit);
    int a[limit];//Or replace "limit as 100"
    printf("Enter values\n");
    for(int i=0;i<limit;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<limit;i++){
        printf("%d\n",a[i]);
    }

    return 0;
}