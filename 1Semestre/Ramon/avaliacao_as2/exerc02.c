#include <stdio.h>

int main()
{

    float nota1[10];
    float nota2[10];
    float media[10];
    char nome[10][10];
    char outro;
    int i, opcao, referencia, posicao;

    for (i = 0; i < 10; i++)
    {
        printf("digite a nota 1:\n");
        scanf("%f%*c", &nota1[i]);
        printf("digite a nota 2:\n ");
        scanf("%f%*c", &nota2[i]);
        printf("digite o nome do aluno:\n");
        scanf("%s%*c", nome[i]);
        printf("deseja adicionar um novo aluno? (1 para não e 2 para sim!)\n");
        scanf("%c%*c", & outro);

        media[i] = (nota1[i] + nota2[i]) / 2;

        if (outro == '2')
        {
            continue;
        }
        else if (outro == '1')
        {
            break;
        }
    }

    printf("escolha uma opção (1, 2, 3 ou 4)\n");
    scanf("%d%*c", &opcao);

    switch (opcao)
    {
    case 1:
        i = 0;
        for (i = 0; i < 10; i++)
        {
            if (media[i] >= 7)
            {
                printf("%s foi aprovado!\n", nome[i]);
            }
        }
        break;
    case 2:
        i = 0;
        for (i = 0; i < 10; i++)
        {
            if (media[i] < 7)
            {
                printf("%s foi reprovado!\n", nome[i]);
            }
        }
        break;

    case 3:
        printf("digite a nota referencia");
        scanf("%d%*c", &referencia);
        i = 0;
        for (i = 0; i < 10; i++)
        {
            if (media[i] > referencia)
            {
                printf("%s tem uma media maior que a informada\n", nome[i]);
            }
        }
        break;

    case 4:
        printf("digite uma posição:\n");
        scanf("%d%*c", &posicao);

        printf("aluno: %s\n", nome[i]);
        printf("nota 1: %.1f\n", nota1[i]);
        printf("nota 2: %.1f\n", nota2[i]);
        printf("media: %.1f\n", media[i]);

        break;
      default:
      break;
    }
}