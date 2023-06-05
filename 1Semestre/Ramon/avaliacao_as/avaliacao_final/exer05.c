#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
    int vetorA[10];
    int vetorB[10];
    int vetorC[10];
    int i;

    for (i = 0; i < 10; i++)
    {

        printf("Digite um valor inteiro: ");

        scanf("%d", &vetorA[i]);
    }

    printf("\n");

    for (i = 0; i < 10; i++)
    {

        printf("Digite um valor inteiro (b): ");
        scanf("%d", &vetorB[i]);
    }

    printf("\n");

    for (i = 0; i < 10; i++)
    {

        vetorC[i] = vetorA[i] - vetorB[i];

        printf("Vetor A - Vetor B e igual: %d\n", vetorC[i]);
    }
}
