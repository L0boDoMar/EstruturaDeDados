package exemplovetores;

import java.util.Scanner;

public class AdicionarPosicoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float notas[];
        System.out.println("Digite a quantidade de alunos:");
        int n = sc.nextInt();
        notas = new float[n];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota");
            notas[i] = sc.nextFloat();

        }

        float soma = 0;

        for (int i = 0; i < notas.length; i++) {

            soma += notas[i];

        }

        float media = soma / n;

        System.out.println("A média é " + media);

        
        float[] notas1 = new float[n+1];
        for(int i = 0; i<notas.length;i++){
            
            notas1[i]=notas[i]; // complexidade: n -> aumentar o vetor -> O(n) 
            
        }
        
        notas1[n]=sc.nextFloat(); //digita notas do novo aluno
        
    }

}
