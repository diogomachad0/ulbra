#include <stdio.h>

int main(){

    float soma, a [6] = {1, 0, 5, -2, 5, 7};
    int i; 
    printf("%d %d %d\n", a[0], a[1], a[5]);
    a[4] = 100;
    for(i=0;i<5;i++){
        printf("A soma é: %d\n", a[i]);
    }
}