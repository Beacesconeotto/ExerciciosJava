package Principal;

import Model.Aluno;
import java.util.*;
import javax.swing.*;

public class TestesPilha {

    public static void main(String[] args) {
        Stack<Aluno> pilha = new Stack<Aluno>();
        
        for (int i=0; i < 4; i++) {
        
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt (JOptionPane.showInputDialog("Digite sua idade: "));
        int fase = Integer.parseInt (JOptionPane.showInputDialog("Digite sua fase: "));
        String curso = JOptionPane.showInputDialog("Digite seu curso: ");
        int id = Integer.parseInt( JOptionPane.showInputDialog("Digite seu id: "));
        pilha.push(new Aluno (curso, fase, id, nome, idade));
        }
        
        
        // System.out.println("Topo:" + pilha.peek().getId() + " - " + pilha.peek().getNome());   
        // Interator utilizado para correr a pilha, veja mais na documenta ção JAVA
        for (Iterator it = pilha.iterator(); it.hasNext();) {
            Aluno c = (Aluno) it.next();
            System.out.println(c.getId() + " - " + c.getNome());
        }
        System.out.println("Removendo:" + pilha.peek().getNome());
        pilha.pop();
        System.out.println("Topo:" + pilha.peek().getNome());
    }
}
