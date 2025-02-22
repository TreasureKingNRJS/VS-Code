#include<stdio.h>
int main (){

    char n[] = "Nithin Raj" ;
    char name[100] ;
    //char nm [] = {'N','I','T','H','I','N',' '};

    printf("Enter your name\n");
    scanf("%s",name);

    printf("%s , %s\n",n,name);
    /* //Not working
    printf("Enter a name\n");
    char nam[20];
    gets(nam);
    printf("%s ",nam);*/

    return 0;
}