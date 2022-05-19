#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int mdc(int x, int y){
	
	int resto,mdc;
	
	resto = x % y;

        while (resto != 0) {

            x = y;
            y = resto;
            resto = x % y;

        }

        mdc = y;

        return mdc;
        
}

int main(){
	
	setlocale(LC_ALL, "Portuguese");
	int a,b;
	
	printf("Digite o primeiro número ");
	scanf("%d",&a);
	
	printf("Digite o segundo número ");
	scanf("%d",&b);
	
	printf("O mdc de %d e %d é %d",a,b,mdc(a,b));
	
	return 0;
}
