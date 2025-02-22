#include<stdio.h>

int main(){

    int limit;
    printf("Enter array limit\n");
    scanf("%d",&limit);

    printf("Enter values to see sum\n");
    int a[limit];
    for(int i=0;i<limit;i++){
        scanf("%d",&a[i]);
    }
    int sum = 0;
    for(int i=0;i<limit;i++){
        sum = sum + a[i];
    }

    printf("Sum of\t");
    for(int i=0;i<limit;i++){
        if(i==limit-1){
            printf("%d\t",a[i]);
            break;
        }
        printf("%d + ",a[i]);
    }
    printf(" = %d",sum);

    return 0;
}