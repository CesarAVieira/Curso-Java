package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

/*
    Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
    N funcionários. Não deve haver repetição de id.

    Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
    mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
    conforme exemplos.

    Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
    ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
    aumento por porcentagem dada.
*/
public class App {
    public static void main(String[] args) throws Exception {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();
        System.out.println();

        List<Funcionario> list = new ArrayList<>();
        boolean idExiste = true;

        for (int i = 0; i < n; i++) {
            
            System.out.printf("Funcionário #%d:%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();

            do {
                idExiste = false;
                for (Funcionario e : list) {
                    if (e.getId() == id) {
                        idExiste = true;
                        System.out.print("Id já existe, digite outro: ");
                        id = sc.nextInt();
                        break;
                    }
                }
            } while (idExiste);

            System.out.print("Nome: ");
            sc.nextLine(); // limpar buffer
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            System.out.println();

            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp);
        }

        System.out.print("Digite o ID do funcionário que terá aumento de salário: ");
        int empId = sc.nextInt();

        boolean encontrado = false;
        for (Funcionario e : list) {
            if (e.getId() == empId) {
                System.out.print("Digite a porcentagem: ");
                double porcentagem = sc.nextDouble();
                e.aumentaSalario(porcentagem);
                encontrado = true;
                break;
            } 
        }

        if (!encontrado) {
            System.out.println("Id inexistente!");
        }

        System.out.println();
        System.out.println("Lista de Empregados:");

        for (Funcionario e : list) {
            System.out.println(e);
        }

        sc.close();
    }
}

/*
 * 📊 Avaliação do código ChatGPT
 *
 * ✅ Pontos positivos:
 * - Uso correto de List<Funcionario>, demonstrando entendimento de estruturas dinâmicas (melhor que vetores para esse caso).
 * - Implementação da validação de ID duplicado utilizando loop + do/while, garantindo consistência dos dados.
 * - Lógica de busca do funcionário para aumento salarial está correta (uso de break ao encontrar).
 * - Uso adequado de encapsulamento com o método aumentaSalario(), evitando alteração direta do salário.
 * - Controle de fluxo bem aplicado com variável "encontrado" para validar existência do ID.
 * - Código bem indentado e com nomes de variáveis claros (idExiste, encontrado, porcentagem).
 *
 * ⚠️ Pontos de melhoria:
 * - Organização: toda a lógica está concentrada no método main.
 *   Em projetos maiores, o ideal é extrair métodos como:
 *   -> hasId(List<Funcionario>, int id)
 *   -> findById(List<Funcionario>, int id)
 *   Isso melhora reutilização e legibilidade.
 *
 * - Separação de responsabilidades: o código mistura entrada de dados, validação e regras de negócio.
 *   O ideal é separar essas responsabilidades para facilitar manutenção.
 *
 * - Reutilização de lógica: a verificação de ID poderia ser reaproveitada em um método ao invés de
 *   reescrever o loop dentro do main.
 *
 * - Escalabilidade: a busca por ID é linear (O(n)). Para listas maiores, poderia ser otimizada
 *   com estruturas como Map<Integer, Funcionario>.
 *
 * - Pequena melhoria de clareza: a variável "idExiste" poderia ter escopo menor (declarada dentro do loop),
 *   evitando uso desnecessário fora do contexto.
 *
 * 💡 Consideração final:
 * O código está correto, robusto e bem estruturado para nível iniciante/intermediário.
 * Demonstra domínio de listas, controle de fluxo e encapsulamento.
 * Próximo passo é evoluir na organização (extração de métodos) e começar a utilizar
 * recursos mais modernos do Java, como Streams, para tornar o código mais limpo e expressivo.
 */