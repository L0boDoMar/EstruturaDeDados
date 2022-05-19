package exemplovetores;

import java.util.Scanner;

public class ExemploVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = in.nextInt();

        }

        System.out.println("Elementos digitados:");

        for (int i = 0; i < vetor.length; i++) {

            System.out.println(vetor[i]);

        }

    }

}
