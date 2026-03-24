import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
        considerando a primeira posição como 0 (zero). 
    */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double maiorNum = 0.0;
        int posicao = 0;
        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            if (vetor[i] > maiorNum) {
                maiorNum = vetor[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.println("MAIOR VALOR = " + maiorNum);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

        sc.close();
    }
}
