#include <stdio.h>

int main()
{
    int i, valores[10];
    int num;
    for (i = 0; i < 10; i++)
    {
        valores[i] = rand() % 10;
        printf("%d\n", valores[i]);
    }
    printf("digite um numero:");
    scanf("%d", &num);

    for (i = 0; i < 10; i++)
    {
        if (num == valores[i])
        {
            printf("esta no vetor na posicao %d\n", valores[i]);
        }
        else
        {
            printf("nao esta no vetor\n");
        }
    }
}