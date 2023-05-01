package Principal;

import ModificadorStatic.Aluno;
import ModificadorFinal.AlunoBolsista;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        AlunoBolsista alunoB = new AlunoBolsista(3, "Sistemas", 1800);
        alunoB.efetuarPagamento();

        int i;

        // Estrutura de repetição criando 5 objetos do tipo Aluno
        for (i = 0; i < 5; i++) {
            Aluno aluno = new Aluno();
        }

        // Estrutura de repetição criando 3 objetos do tipo AlunoBolsista
        for (i = 0; i < 3; i++) {
            AlunoBolsista aluno = new AlunoBolsista(i, "Sistemas", 1800);
        }

        // Acessando valor de qtdadeAlunos a partir do nome da Classe (Aluno)
        JOptionPane.showMessageDialog(null,
                "Valor armazenado em qtdadeAlunos: " + Aluno.getQtdadeAlunos()
        );
    }
}
