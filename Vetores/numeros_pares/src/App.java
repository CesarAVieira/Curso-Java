import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
        tela todos os números pares, e também a quantidade de números pares.
    */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtyNum = sc.nextInt();
        int[] vetores = new int[qtyNum];

        int sum = 0;
        String pares = "";
        for (int i = 0; i < vetores.length; i++) {

            System.out.print("Digite um numero: ");
            vetores[i] = sc.nextInt();

            if (vetores[i] % 2 != 1 ) {
                sum++;
                pares += vetores[i] + " ";
            }
        }

        System.out.println();
        System.out.println("NUMEROS PARES:");
        System.out.println(pares);
        System.out.println();
        System.out.print("Quantidade de numeros pares: " + sum);

        sc.close();
    }
}
