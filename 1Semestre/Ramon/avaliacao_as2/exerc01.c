#include <stdio.h>
#include <time.h>

int main()
{

    int vetor[100], i;

    for (i = 0; i < 100; i++)
    {
        printf("%d");
        scanf("%d%*c", &vetor[i]);
    }
}