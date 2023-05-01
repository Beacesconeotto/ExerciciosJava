package ModificadorStatic;

public class Aluno {

    private int fase;
    private String curso;
    private double mensalidade;

    /* ATRIBUTO STATIC
        • Pertencente à classe, não ao objeto
        • Não requer a criação de um objeto (instância) para ser acessado     */
    private static int qtdadeAlunos = 0;

    public Aluno() {
        qtdadeAlunos++;
    }

    public Aluno(int fase, String curso, double mensalidade) {
        this.fase = fase;
        this.curso = curso;
        this.mensalidade = mensalidade;
        qtdadeAlunos++;
    }

    public double getMensalidade() {
        return this.mensalidade;
    }

    /* MÉTODO STATIC
        • Não requer a criação de um objeto (instância) para ser acessado     */
    public static int getQtdadeAlunos() {
        return qtdadeAlunos;
    }

}
