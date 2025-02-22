#include<stdio.h>
void hw();//without argument and return value
void sum(int,int);//with argument and no return value
int dif(int,int);//with argument and return value
int pro();//without argument and return value exist
int main(){

    hw();
    printf("Enter 2 numbers\n");
    int a , b;
    scanf("%d%d",&a,&b);
    sum(a,b);
    //int d = dif(a,b);
    printf("Difference =  %d\n",dif(a,b));
    //int product = pro();
    printf("Product = %d\n",pro());
    return 0;
}

void hw(){
    printf("Hello World\n");
}
void sum(int n1 , int n2){
    printf("Sum = %d\n",n1 + n2);
}
int dif(int n1 , int n2){
    if(n1<n2){
        return n2-n1;
    }else{
        return n1-n2;
    }
}
int pro(){
    printf("Enter other 2 numbers\n");
    int a , b;
    scanf("%d%d",&a,&b);
    return a*b ;
}