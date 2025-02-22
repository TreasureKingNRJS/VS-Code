#include<stdio.h>
int main(){
    printf("Enter your name\n");
    int i=0;
    char name[100];
    gets(name);
    for(;i<100;i++){
        
        if(((name[i]>122)&&(name[i]<97))&&((name[i]<65)&&(name[i]>90))){
            name[i]=32;

    }
        if((name[i]==32)&& ((name[i+1]<123)&&(name[i+1]>96))){
            name[i+1]=name[i+1]-32;
        }
        }
        
    if((name[0]<123)&&(name[0]>96)){
            name[0]-=32;
        }
    printf("%s is your name\n",name);
    return 0;
}