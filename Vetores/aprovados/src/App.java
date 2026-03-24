import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
        igual a 6.0 (seis). 
    */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        double media;

        String[] alunos = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];

        for (int i = 0; i < alunos.length; i++) {
            
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i + 1);

            sc.nextLine();
            alunos[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunos.length; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if (media >= 6.0) {
                System.out.println(alunos[i]);
            }
        }

        sc.close();
    }
}
