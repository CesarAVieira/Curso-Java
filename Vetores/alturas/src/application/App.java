package application;
import java.util.Locale;
import java.util.Scanner;

import identity.Pessoa;

/*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
    bem como os nomes dessas pessoas caso houver.
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serão digitas: ");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        double somaAltura = 0.0;
        for (int i = 0; i < pessoa.length; i++) {
            somaAltura += pessoa[i].getAltura();
        }
        System.out.println();
        double alturaMedia = somaAltura / pessoa.length;
        System.out.printf("Altura média: %.2f%n", alturaMedia);

        String nomesDosMenores = "";
        int menores16 = 0;
        for (int i = 0; i < pessoa.length; i++) {

            int idade = pessoa[i].getIdade();

            if (idade < 16) {
                nomesDosMenores += pessoa[i].getNome() + "\n";
                menores16++;
            }    
        }

        double porcentagem = (double) menores16 / pessoa.length * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
        System.out.println(nomesDosMenores);

        sc.close();
    }
}
