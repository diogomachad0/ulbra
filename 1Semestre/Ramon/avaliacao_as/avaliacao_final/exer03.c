#include <stdio.h>

int main()
{
    int num[10], i = 0, x = 0, aux;
    i = 0;
    x = 0;

    printf("Digite 10 numeros:\n");

    for (i = 0; i < 10; i++)
    {
        printf("(%i)", i + 1);
        scanf("%d", &num[i]);
    }

    printf("Numeros repetidos:\n");

    for (i = 0; i < 10; i++)
    {
        for (x = i + 1; x < 10; x++)
        {
            if (num[x] == num[i])
            {
                aux = num[i];
                printf("%d\n", aux);
            }
        }
    }
}