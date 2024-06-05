#include <stdio.h>

int main () {
    float n1, n2, media, dif, prod, div;
    int opcao;
    printf("Entre com dois numeros:\n");
    scanf("%f",&n1);
    scanf("%f",&n2);
    printf("Escolha uma das opções:\n");
    printf("1. Media entre os numeros digitados\n");
    printf("2. Diferença do maior pelo menor\n");
    printf("3. Produto entre os numeros digitados\n");
    printf("4. Divisão do primeiro pelo segundo numero\n");
    scanf("%d", &opcao);
    if(opcao==1){
        media=(n1+n2)/2;
        printf("A media entre os numeros e: %.2f\n", media);

    }
    else{
        if(opcao==3)
    {
        prod=n1*n2;
        printf("O produto entre os numeros digitados e: %.2f/n", prod);
    }
    else{
        if(opcao==4 && n1!=0 && n2!=0)
        {
            div=n1/n2;
            printf("A divisão do primeiro pelo segundo é: %.2f\n", div);

    }
    else{
        printf("Opção invalida\n");

    }
    }
    }
    return 0;


    
}