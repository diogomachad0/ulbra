#include <stdio.h>

int main () {

    int num, soma;
    soma=0;

    for(int i=0;i<10;i++){
    printf("Digite um numero:\n");
    scanf("%d%*c", &num);
    soma=num+soma;
}
    printf("A soma é:%d", soma);
    
} 