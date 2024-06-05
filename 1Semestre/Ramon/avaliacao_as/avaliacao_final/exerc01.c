#include <stdio.h>

int main()
{
    int valor[10], i, referencia;
    int contador = 0;
    int menores = 0;
    int iguais = 0;
    for (i = 0; i < 10; i++)
    {
        printf("Qual o %d° valor?\n ", i + 1);
        scanf("%d", &valor[i]);
    }
    printf("\nEntre com o valor de referencia:\n");
    scanf("%d", &referencia);

    for (i = 0; i < 10; i++)
    {
        if (valor[i] > referencia)
            contador++;
        else if (valor[i] < referencia)
            menores++;
        else
            iguais++;
    }
    if (referencia > 0)
    {
        printf("\nOs valores maiores que a referencia sao:\n");
        for (i = 0; i < 10; i++)
            if (valor[i] > referencia)
                printf("%d\n", valor[i]);
    }
    else
    {
        printf("\nNao existem valores maiores que a referencia\n");
    }
    if (menores > 0)
    {
        printf("\nExistem %d valores menores que a referencia\n", menores);
    }
    else
    {
        printf("\nNao existem valores menores que a referencia\n");
    }
    if (iguais > 0)
    {
        printf("\nExistem %d valores iguais ao da referencia\n", iguais);
    }
    else
    {
        printf("\nNao existem valores iguais ao da referencia\n");
    }
}