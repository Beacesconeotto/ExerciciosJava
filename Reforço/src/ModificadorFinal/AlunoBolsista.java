package ModificadorFinal;

import ModificadorStatic.Aluno;
import javax.swing.JOptionPane;

/* CLASSE FINAL
    • Não possui herdeiros (não pode ser estendida);
    • Garantir que o comportamento da classe não seja modificado;
 */
public final class AlunoBolsista extends Aluno {

    /* ATRIBUTO FINAL
        • Atributo final: Só pode ter o seu valor atribuído uma única vez;
        • É uma constante;                                              */
    private final double porcentagemBolsa = 0.45; // 45%

    public AlunoBolsista() {
    }

    public AlunoBolsista(int fase, String curso, double mensalidade) {
        super(fase, curso, mensalidade);
    }

    /* MÉTODO FINAL
        • Não pode ser sobrescrito (Override);
        • Comportamento não pode ser modificado pelas subclasses;       */
    public final void efetuarPagamento() {
        double valorTotal, desconto;

        desconto = this.getMensalidade() * this.porcentagemBolsa;
        valorTotal = this.getMensalidade() - desconto;

        JOptionPane.showMessageDialog(null,
                "Pagamento de R$" + valorTotal + " efetuado com sucesso!"
        );
    }

    /* POR QUE UTILIZAR O MODIFICADOR FINAL?
        • Código mais rápido e eficiente;
        • Garantir a integridade dos dados;
        • Legibilidade do código;                                       */
}
