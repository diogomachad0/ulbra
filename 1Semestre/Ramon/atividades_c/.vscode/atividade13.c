#include <stdio.h>

int main() {
    float pes, polegada, jarda, milha;
    printf("Digite uma medida em pes: ");
    scanf("%f%*c", &pes);
    
    polegada = pes * 12;
    jarda = pes /3;
    milha = jarda /1.760;

    printf("Letra a) %.1f\n", polegada);
    printf("Letra b) %.1f\n", jarda);
    printf("Letra c) %.1f\n", milha);
    return 0;
    

}