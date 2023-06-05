#include <stdio.h>

int main () {
    int total=3;
    int matricula, i, n;
    char nome[10];
    float nota, soma, media;

    for(i=0;i<total;i++){
    printf("Digite o nome: %d\n", i+1);
    scanf("%s%*c", &nome);
    printf("Digite a matricula:\n");
    scanf("%d%*c", &matricula);
    soma=0;
        for(n=0;n<3;n++){
            printf("Digite a nota %d:\n", n+1);
            scanf("%f%*c", &nota);
            soma=soma+nota;
        }


    
    if(media>=7){
    printf("O aluno %s matricula %d foi aprovado media=%f\n", nome, matricula);
    }
    else{
        printf("O aluno %s matricula %d não foi aprovado media=%f\n", nome, matricula, media);
    }
    }
}