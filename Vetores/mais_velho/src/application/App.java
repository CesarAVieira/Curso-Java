package application;

import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
        da pessoa mais velha. 
    */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        int maioridade = idade[0];
        int posicaomaior = 0;
        for (int i = 0; i < nome.length; i++) {
            
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            if (idade[i] > maioridade) {
                maioridade = idade[i];
	            posicaomaior = i;
            }
        }
   
        System.out.print("PESSOA MAIS VELHA: " + nome[posicaomaior]);
        sc.close();
    }
}
