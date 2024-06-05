#include <stdio.h>
#include <string.h>

int main () {
   char nome[6];
   char sobrenome[8]="Machado";
   char nomeCompleto[14];

   printf("Digite o nome:\n");
   scanf("%s", nome);

   printf("%s %s\n", nome, sobrenome);
   }