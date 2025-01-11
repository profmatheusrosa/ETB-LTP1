/**
 * Classe que representa uma pessoa com atributos básicos.
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String endereco;
    private String matricula;

    /**
     * Construtor para inicializar os atributos de uma pessoa.
     * @param nome Nome da pessoa.
     * @param idade Idade da pessoa.
     * @param endereco Endereço da pessoa.
     * @param matricula Matrícula da pessoa.
     */
    public Pessoa(String nome, int idade, String endereco, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    /**
     * Obtém o nome da pessoa.
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * @param nome Nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade da pessoa.
     * @return Idade da pessoa.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa.
     * @param idade Idade da pessoa.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o endereço da pessoa.
     * @return Endereço da pessoa.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa.
     * @param endereco Endereço da pessoa.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a matrícula da pessoa.
     * @return Matrícula da pessoa.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula da pessoa.
     * @param matricula Matrícula da pessoa.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Exibe as informações da pessoa.
     */
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereco: " + endereco);
        System.out.println("Matricula: " + matricula);
    }
}
