#include <stdio.h>
#include <math.h>

int main() {
    float nota1, nota2, nota3, media, notaExame;
    printf("Digite a primeira nota: ");
    scanf("%f%*c", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%f%*c", &nota2);
    printf("Digite a terceira nota: ");
    scanf("%f*c", &nota3);
    media = (nota1 + nota2 + nota3) / 3;
    printf("Média aritimética:%f ", media);
    if( (media>=0) && (media<3) ){
        printf("Reprovado");
    }
    else if( (media>=3) && (media<7) ){
        printf("Exame: ");
        notaExame = 12 - media;
        printf("Deve tirar a nota: %f para ser aprovado", notaExame);
    }
    if( (media>=7) && (media<=10) ){
        printf("Aprovado");
    }

    
}