#include <stdio.h>
#include <stdlib.h>
#include <locale.h> //necess�rio para usar setlocale

int main(){
	
	 setlocale(LC_ALL, "Portuguese");
	 
	int a,b,c;
	
	printf("digite dois n�meros: ");
	scanf("%d %d", &a, &b);
	
	c= a+b;
	
	printf("%d\n",c);
	
	return 0;
}
