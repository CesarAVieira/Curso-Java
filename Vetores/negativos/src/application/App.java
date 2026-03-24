package application;

import java.util.Scanner;

/*
    Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
    e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.print("Digitem um valor menor que 10: ");
            n = sc.nextInt();
        }

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) { 
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
