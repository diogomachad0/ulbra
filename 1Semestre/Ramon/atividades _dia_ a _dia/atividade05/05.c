#include <stdio.h>

int main () {
    int idade, falta;

    printf("Digite a idade:\n");
    scanf("%d%*c", &idade);

    if (idade>=18){
        printf("Você é de maior e já pode frequentar o Clube dos Coroas no Entrevero!!!\n Sua idade é: %d", idade);
    }
     else {
        falta=18-idade;
        printf("Você é menor de idade %d, falta %d anos para ir ao clube.", idade, falta);
    }
}