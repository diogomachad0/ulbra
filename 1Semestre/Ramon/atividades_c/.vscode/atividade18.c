#include <stdio.h>

int main (){

    float pesoRacao, racaoDiaria, gastoRacao, quantRestante;
    printf("Digite o peso do saco de racao: Kg");
    scanf("%f%*c", &pesoRacao);
    printf("Digite a quantidade de racao diaria em gramas: ");
    scanf("%f%*c", &racaoDiaria);

    pesoRacao = 1000;
    gastoRacao = racaoDiaria * 5;
    quantRestante = (pesoRacao - gastoRacao) / 1000;
    printf("A quantidade de ração restante após 5 dias é de: %.1fKg\n", quantRestante);
    return 0;




}