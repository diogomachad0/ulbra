#include <stdio.h>
#include <string.h>

int main (){

    char nome[14];
    char sobrenome[]="Lummertz";
    char meio[]="Dos";
    char nomeCompleto[20];
    printf("Digite o nome:\n");
    scanf("%s", nome);

    printf("%s %s %s\n", nome, meio, sobrenome);

    if(strcmp(nome, "Ramon")==0){
        printf("Nomes iguais\n");
    }else{
        printf("Nomes diferentes\n");
    }
    strcat(nomeCompleto, nome);
    strcat(nomeCompleto, " ");
    strcat(nomeCompleto, sobrenome);

    printf("Seu nome completo é:%s", strdup(nomeCompleto));



}