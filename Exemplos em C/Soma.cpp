#include <stdio.h>
#include <stdlib.h>
#include <locale.h> //necessário para usar setlocale

int main(){
	
	 setlocale(LC_ALL, "Portuguese");
	 
	int a,b,c;
	
	printf("digite dois números: ");
	scanf("%d %d", &a, &b);
	
	c= a+b;
	
	printf("%d\n",c);
	
	return 0;
}
