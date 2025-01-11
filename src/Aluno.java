/**
 * Classe que representa um aluno, que é uma subclasse de Pessoa.
 */
public class Aluno extends Pessoa {
    private String curso;

    /**
     * Construtor para inicializar os atributos de um aluno.
     * @param nome Nome do aluno.
     * @param idade Idade do aluno.
     * @param endereco Endereço do aluno.
     * @param matricula Matrícula do aluno.
     * @param curso Curso do aluno.
     */
    public Aluno(String nome, int idade, String endereco, String matricula, String curso) {
        super(nome, idade, endereco, matricula);
        this.curso = curso;
    }

    /**
     * Obtém o curso do aluno.
     * @return Curso do aluno.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define o curso do aluno.
     * @param curso Curso do aluno.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Exibe as informações do aluno, incluindo o curso.
     */
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }
}
