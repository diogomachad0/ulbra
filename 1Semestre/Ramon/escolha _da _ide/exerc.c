#include <stdio.h>

int main () {

    float nota1, nota2, nota3, media;
    printf("Digite a 1° nota: ");
    scanf("%f%*c", &nota1);
    printf("Digite a 2° nota: ");
    scanf("%f%*c", &nota2);
    printf("Digite a 3° nota: ");
    scanf("%f%*c", &nota3);

    media=(nota1+nota2+nota3)/3;

    if(media>=7){
        printf("Você foi aprovado!\n");
    }
    else if(media>=5){
        printf("Você está em recuperação!\n");
    }
    else{
        printf("Você foi reprovado!\n");
    }

    printf("A sua média foi:%.2f", media);


}