import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe principal do programa que gerencia o sistema escolar.
 */
public class Main {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();

    /**
     * Método principal que exibe o menu e gerencia as opções do usuário.
     * @param args Argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Funcionario");
            System.out.println("3. Listar todos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner);
                    break;
                case 2:
                    cadastrarFuncionario(scanner);
                    break;
                case 3:
                    listarTodos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    /**
     * Método para cadastrar um novo aluno.
     * @param scanner Scanner para entrada de dados do usuário.
     */
    private static void cadastrarAluno(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        System.out.print("Curso: ");
        String curso = scanner.nextLine();

        Aluno aluno = new Aluno(nome, idade, endereco, matricula, curso);
        pessoas.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    /**
     * Método para cadastrar um novo funcionário.
     * @param scanner Scanner para entrada de dados do usuário.
     */
    private static void cadastrarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Endereco: ");
        String endereco = scanner.nextLine();
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, idade, endereco, matricula, cargo);
        pessoas.add(funcionario);
        System.out.println("Funcionario cadastrado com sucesso!");
    }

    /**
     * Método para listar todas as pessoas cadastradas.
     */
    private static void listarTodos() {
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
            System.out.println("------------");
        }
    }
}
