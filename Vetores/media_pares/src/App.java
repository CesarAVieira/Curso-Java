import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
    */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < vetor.length; i++) {
            
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0) {
                sum += vetor[i];
                count++;
            }
        }

        if (count == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", sum / count);
        }

        sc.close();
    }
}
