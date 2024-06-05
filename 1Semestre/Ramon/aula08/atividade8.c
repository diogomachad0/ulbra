#include <stdio.h>

int main() {
    float salario, salarioReajuste;
     char percentual;
    printf("Informe seu salario: ");
    scanf("%f%*c", &salario);
    if(salario<=300){
        percentual=(35/100)*salario;
        salarioReajuste=salario+percentual;

    }
    else if(salario>300){
        percentual=(35/100)*salario;
        salarioReajuste=salario+percentual;

    }
    printf(percentual);
    printf("Seu salario reajustado é: ", salarioReajuste);
}