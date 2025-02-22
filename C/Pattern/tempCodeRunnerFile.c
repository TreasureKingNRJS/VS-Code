#include<stdio.h>

int main(){
    int n=10,p,j,i,k;

    for (i=1;i<=n;i++){
        p=0;
        for (j=1;j<=i;j++){

            for(k = n-i;k>=1;k--){
                if(p==1){
                    break;
                }
                printf(" ");
            }
            p=1;

            printf("* ");
            
        }
        printf("\n");
    }
    for(i=n;i>0;i--){
        p=0;
        for(j=1;j<i;j++){
            printf(" ");
            for(k=1;k<=n-i;k++){
                if(p==1){
                    break;
                }
                printf(" ");
            }
            p=1;
            printf("*");

            
        }
        printf("\n");

    }

    return 0;
}