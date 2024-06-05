#include <stdio.h>
#include <stdlib.h>

int main () {
    float salario, salarioAumento;
    char nome[41],sobrenome[40];
    printf("Informe nome e sobrenome do funcionario:\n");
    scanf("%s%s", &nome, &sobrenome);
    printf("Informe o salario do funcionario:\nR$");
    scanf("%f", &salario);
    salarioAumento=salario+(salario*0.3);  
    if(salario>800){
        printf("%s%s não tem direito a um aumento\n", nome, sobrenome);
        
    }
    else{
        printf("O novo salario de %s%s é: R$%.2f\n", nome, sobrenome, salarioAumento);

    }
    
}