#include <stdlib.h>
#include <stdio.h>

int main()
{
    int i, vetor[10], aux[10], a, b;
    for (i = 0; i < 10; i++)
    {
        printf("Digite uma sequencia de 10 numeros:\n");
        scanf("%d", &vetor[i]);
        for (a = 0; a < i; a++)
        {
            if (vetor[i] == vetor[a])
            {
                printf("\nO número é repetido, escolha outro.\n");
                i--;
            }
        }
    }
    for (i = 0; i < 10; i++)
    {
        printf("\n%d", vetor[i]);
    }
}