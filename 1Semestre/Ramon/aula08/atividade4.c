#include <stdio.h>

int main() {
    float n1, n2, n3;
    printf("Digite o numero 1: ");
    scanf("%f%*c", &n1);
    printf("Digite o numero 2: ");
    scanf("%f%*c", &n2);
    printf("Digite o numero 3: ");
    scanf("%f%*c", &n3);
    if(n1>n2){
        printf("O numero 1 é maior que o numero 2");
    }
    if(n1<n2){
        printf("O numero 2 é maior que o numero 1");
    }
    if(n1<n3){
        printf("O numero 3 é maior que o numero 1");
    }
    if(n3<n2){
        printf("O numero 2 é maior que o numero 3");
        
    }
    
}