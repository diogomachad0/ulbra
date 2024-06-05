#include <stdio.h>
#include <string.h>


    int main () {

        float idade;
        char analfabeto[5];
        printf("Você é analfabeto? (sim ou não)");
        scanf("%s%*c", analfabeto);
      if(strcmp(analfabeto, "sim")==0){
            printf("O seu voto é facultativo!");
        }
      else{printf("Digite a idade: ");
        scanf("%f%*c", &idade);
        
        if( (idade>=18) && (idade<=69) ){
            printf("Você é maior de idade, é obrigado a votar!\n");
        }
        if(idade>=70){
        printf("O seu voto é facultativo!");
        }
        if(idade<=15){
            printf("Você é menor de idade, não é obrigado a votar.");
        }
        if( (idade>=16) && (idade<=17) ){
            printf("Você é menor de idade e vota de forma facultativa.");
        }
        }
        
        return 0;

    }