package exemplovetores;

import java.util.Scanner;

public class RemoverPosicoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] v = {4, 3, 1, 5, 6, 7, 10, 8};
        int k;

        System.out.println("Digite a posição para remover:");
        k = sc.nextInt();

        for (int i = k; i < v.length - 1; i++) {

            v[i] = v[i + 1]; //no máximo n-1 -> O(n)
            

        }

        for (int i = 0; i < v.length; i++) {

            System.out.println("v[" + i + "]= " + v[i]);

        }
        
        System.out.println("Digite a posição para inserir:");
        k = sc.nextInt();

        for (int i = v.length - 1; i >= k; i--) {

            v[i] = v[i - 1]; //complexidade -> O(n)

        }
        
        System.out.print("Digite um número: ");
        v[k]=sc.nextInt();
        
        for (int i = 0; i < v.length; i++) {

            System.out.println("v[" + i + "]= " + v[i]);

        }

    }

}
