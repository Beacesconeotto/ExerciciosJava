package Principal;

import Model.Aluno;
import java.util.*;
import javax.swing.JOptionPane;

public class TesteFila {

    public static void main(String[] args) {
        Queue<Aluno> fila = new LinkedList();
        for (int i = 0; i < 2; i++) {
            String curso = JOptionPane.showInputDialog("Digite seu curso: ");
            int fase = Integer.parseInt(JOptionPane.showInputDialog("Digite sua fase: "));
            int id = Integer.parseInt(JOptionPane.showInputDialog("Digite seu id: "));
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

            fila.offer(new Aluno(curso, fase, id, nome, idade));
        }
        System.out.println("Inicio da Fila:" + fila.peek().getId() + " - " + fila.peek().getNome());
// Interator utilizado para correr a fila, veja mais na documentação JAVA
        for (Iterator it = fila.iterator(); it.hasNext();) {
            Aluno c = (Aluno) it.next();
            System.out.println(c.getId() + " - " + c.getNome());
        }
        System.out.println("Removendo:" + fila.peek().getNome());
        fila.poll();
        System.out.println("Topo:" + fila.peek().getNome());
    }
}
