#include <stdio.h>
#include <math.h>

int main() {
    float notaTrab, avalSem, exame, media;
    printf("Digite a nota do trabalho de laboratório: ");
    scanf("%f%*c", &notaTrab);
    printf("Digite a nota da avaliação semestral: ");
    scanf("%f%*c", &avalSem);
    printf("Digite a nota do exame final: ");
    scanf("%f%*c", &exame);
    media = (notaTrab * 2 + avalSem * 3 + exame * 5) / 10;
    printf("Média ponderada:%f ", media);
    if( (media>=8) && (media<=10) ){ 
        printf("Obteve conceito A");
    }
    if( (media>=7) && (media<8) ){
        printf("Obteve conceito B");
    }
    if( (media>=6) && (media<7) ){
        printf("Obteve conceito C");
    }
    if( (media>=5) && (media<6) ){
        printf("Obteve conceito D");
    }
    if( (media>=0) && (media<5) ){
        printf("Obteve conceito E");
    }

        



}