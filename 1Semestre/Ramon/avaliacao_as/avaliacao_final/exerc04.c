#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, opcao;
    float vetor[5];

    for (i = 0; i < 5; i++)
    {
        printf("Digite o valor da posição %d: ", i);
        scanf("%f%*c", &vetor[i]);
    }

    do
    {
        printf("\n0 - Finalizar\n 1 - Imprimir o vetor\n 2 - Imprimir o vetor inverso\n");
        scanf("%d%*c", &opcao);

        switch (opcao)
        {
        case 0:
            printf("Finalizando...\n");
            break;
        case 1:
            for (i = 0; i < 5; i++)
            {
                printf("%.2f ", vetor[i]);
            }
            printf(" ");
            break;
        case 2:
            for (i = 4; i >= 0; i--)
            {
                printf("%.2f ", vetor[i]);
            }
            printf(" ");
            break;
        default:
            printf("Opção invalida!\n");
        }
    } while (opcao != 0);
}