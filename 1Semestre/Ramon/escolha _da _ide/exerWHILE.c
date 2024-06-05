#include <stdio.h>

int main(){
    float nota, media, total;
    total = 0;
    int contador = 1;
    while(contador<=4){
        printf("Digite a nota: ");
        scanf("%f%*c", &nota);
        total = total + nota;
        contador++;
    }
    media = total/4;
    printf("Nota média: %.2f", media);
}