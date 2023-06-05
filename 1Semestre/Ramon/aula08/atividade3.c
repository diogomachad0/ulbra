#include <stdio.h>

int main() {
    float n1, n2;
    printf("Digite o numero 1: ");
    scanf("%f%*c", &n1);
    printf("Digite o numero 2: ");
    scanf("%f%*c", &n2);
    if(n1<n2){
        printf("O numero 1 é menor que o numero 2");
    }
    if(n1>n2){
        printf("O numero 2 é menor que o numero 1");
    }
    
}