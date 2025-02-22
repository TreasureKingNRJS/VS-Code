#include<stdio.h>
int sl(char s[100]){
    int a=0;
   for (int i=0;i<100;i++){
        if(s[i]!='\0'){
            a++;
        }else{
            break;
        }
    } 
    return a;
}
int main (){

    printf("Enter a string calculate it's string length\n");
    
    char s[100];
    gets(s);
    int a=sl(s);
    
    printf("String length of \"%s\" is %d\n",s,a);
    return 0;
}