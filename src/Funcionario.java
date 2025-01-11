/**
 * Classe que representa um funcionário, que é uma subclasse de Pessoa.
 */
public class Funcionario extends Pessoa {
    private String cargo;

    /**
     * Construtor para inicializar os atributos de um funcionário.
     * @param nome Nome do funcionário.
     * @param idade Idade do funcionário.
     * @param endereco Endereço do funcionário.
     * @param matricula Matrícula do funcionário.
     * @param cargo Cargo do funcionário.
     */
    public Funcionario(String nome, int idade, String endereco, String matricula, String cargo) {
        super(nome, idade, endereco, matricula);
        this.cargo = cargo;
    }

    /**
     * Obtém o cargo do funcionário.
     * @return Cargo do funcionário.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     * @param cargo Cargo do funcionário.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Exibe as informações do funcionário, incluindo o cargo.
     */
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cargo: " + cargo);
    }
}
