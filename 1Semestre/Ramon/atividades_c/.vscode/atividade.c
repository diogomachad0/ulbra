#include <stdio.h>
#include <math.h>

int main () {

    float idade, analfabeto;
    printf("Digite a idade: ");
    scanf("%f%*c", &idade);
    if(idade>=18){
        printf("Você é maior de idade, é obrigado a votar!");
    }
    if(idade<=15){
        printf("Você é menor de idade, não é obrigado a votar.");
    }
    if( (idade>=16) && (idade<=17) ){
        printf("Você é menor de idade e vota de forma facultativa.");
    }
    if(idade>=70){
        printf("Você vota de forma facultativa.");
    }

}