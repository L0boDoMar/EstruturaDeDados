package exemplomdc;

import java.util.Scanner;

public class ExemploMDC {

    public static int mdc(int x, int y){
        
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
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a, b;

        System.out.println("Exemplo MDC");
        
        System.out.print("Digite o primeiro número: ");
        a = in.nextInt();
        System.out.print("Digite o segundo número: ");
        b = in.nextInt();

        
        System.out.println("O mdc de " + a + " e " + b + " é " + mdc(a,b));

    }

}
