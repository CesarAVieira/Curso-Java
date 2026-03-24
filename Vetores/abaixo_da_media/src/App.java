import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
    */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double sum = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];
        }

        double media = sum / vetor.length;
        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f", media);
        System.out.println();

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < media) {
                System.out.printf("%.1f", vetor[i]);
                System.out.println();
            }
        }

        sc.close();
    }
}
