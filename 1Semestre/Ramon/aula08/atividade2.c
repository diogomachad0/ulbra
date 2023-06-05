#include <stdio.h>

int main() {
    float nota1, nota2, media, notaExame;
    printf("Digite a primeira nota: ");
    scanf("%f%*c", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f%*c", &nota2);
    media=(nota1+nota2)/2;
    printf("A sua média foi: %f ", media);
    if( (media>=0) && (media<4) ){
        printf("Você foi reprovado.");
    }
    else if( (media>=4) && (media<7) ){
        printf("Você está no exame!");
    }
    if( (media>=7) && (media<=10) ){
        printf("Você está aprovado!!!");
    }
}