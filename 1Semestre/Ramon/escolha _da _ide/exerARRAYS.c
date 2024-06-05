#include <stdio.h>

int main(){

    float notas [4] = {7.5, 8.0, 6.5, 3.5};
    int i;
    
    for(i=0;i<4;i++){
        printf("Nota %d = %.2f\n", i+1, notas[i]);

    }
}