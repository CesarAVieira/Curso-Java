import java.util.Scanner;

public class App {

    /*
        Fazer um programa para ler dois numeros inteiros M e N, e depois ler
        uma matriz de M linhas por N colunas contendo números inteiros,
        podendo haver repetições. Em seguida, ler um número inteiro X que
        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        esquerda, acima, à direita e abaixo de X, quando houver, conforme
        exemplo.
    */
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == n) {
                    System.out.printf("Position %d,%d:%n", i, j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat[i].length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
