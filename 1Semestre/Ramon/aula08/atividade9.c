#include <stdio.h>

int main() {
    float salario, SalarioReaju;
    printf("Digite o valor do salario: ");
    scanf("%f", &salario);
    if(salario<=300){
        SalarioReaju=(0.15*salario)+salario;
        printf("Salario com reajuste=%.2f\n", SalarioReaju);

    }
    else if(salario>300){
        SalarioReaju=(0.35*salario)+salario;
        printf("Salario com reajuste=%.2f\n", SalarioReaju);
    }
}