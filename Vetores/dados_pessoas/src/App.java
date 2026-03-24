import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
        de homens.
    */
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] sexo = new char[n];
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double somaAlturasFem = 0.0;
        int countFem = 0;
        int countMasc = 0;

        for (int i = 0; i < altura.length; i++) {
            
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            sexo[i] = sc.next().toUpperCase().charAt(0);

            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            } 
            if (altura[i] < menorAltura) {
                menorAltura = altura[i];
            }

            if (sexo[i] == 'F') {
                somaAlturasFem += altura[i];
                countFem++;
            } else {
                countMasc++;
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", somaAlturasFem / countFem);
        System.out.printf("Numero de homens = %d%n", countMasc);
        
        sc.close();
    }
}

/*
 * 📊 Avaliação do código (ChatGPT)
 *
 * ✅ Pontos positivos:
 * - Uso correto de vetores paralelos (altura e sexo), mantendo consistência entre os dados.
 * - Lógica de cálculo de maior e menor altura está correta e eficiente (uma única passagem no vetor).
 * - Uso de Character.toUpperCase()/toUpperCase() para padronizar entrada do usuário (boa prática).
 * - Variáveis bem nomeadas, facilitando leitura e entendimento do código.
 * - Código enxuto, resolvendo múltiplos problemas em um único loop (boa eficiência).
 *
 * ⚠️ Pontos de melhoria:
 * - Organização: o código concentra leitura, processamento e cálculos em um único loop.
 *   Em cenários maiores, o ideal é separar responsabilidades (ex: um loop para leitura,
 *   outro para cálculos), facilitando manutenção e testes.
 *
 * - Robustez: não há tratamento para divisão por zero ao calcular a média das mulheres.
 *   Caso não haja nenhuma mulher, o programa pode lançar erro (ArithmeticException).
 *   -> Sugestão: validar se countFem > 0 antes de calcular a média.
 *
 * - Inicialização de maior valor: uso de Double.MIN_VALUE não é o mais indicado,
 *   pois representa o menor valor positivo possível. O ideal seria usar:
 *   Double.NEGATIVE_INFINITY para maiorAltura.
 *
 * 💡 Consideração final:
 * O código está correto, eficiente e bem estruturado para nível iniciante/intermediário.
 * Já demonstra boa compreensão de lógica, vetores e boas práticas básicas.
 * Próximo passo é evoluir na organização (separação de responsabilidades) e robustez.
 */