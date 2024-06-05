#include <stdio.h>
#include <string.h>

int main(void)
{

    char nome[20];
    int contador, numerosDeVogais = 0;

    printf("Digite o seu nome: ");
    scanf("%s%*c", nome);

    for (contador = 0; contador < nome[contador]; contador++)
    {

        if (nome[contador] == 'a' || nome[contador] == 'e' || nome[contador] == 'i' || nome[contador] == 'o' || nome[contador] == 'u' || nome[contador] == 'A' || nome[contador] == 'E' || nome[contador] == 'I' || nome[contador] == 'O' || nome[contador] == 'U')
        {
            numerosDeVogais++;
        }
    }

    printf("O nome digitado contem %d vogais\n", numerosDeVogais);
}