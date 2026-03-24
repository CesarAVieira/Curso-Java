package application;

import java.util.Locale;
import java.util.Scanner;

/*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    - Imprimir todos os elementos do vetor
    - Mostrar na tela a soma e a média dos elementos do vetor
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("VALORES =");
        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
            sum += vetor[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / vetor.length;
        System.out.printf("MEDIA = %.2f", avg);

        sc.close();
    }
}
