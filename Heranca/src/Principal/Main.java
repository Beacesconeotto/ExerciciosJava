package Principal;

import javax.swing.JOptionPane;
import Model.Pessoa;
import Model.Aluno;
import Model.Professor;
import Model.Funcionario;

public class Main {
    
    public static void main (String [] args) {
        
        Pessoa Objeto = new Pessoa ();
        
        Objeto.setId ( 3 );
        Objeto.setNome ("Richard ");
        Objeto.setIdade (23);
        
        
        JOptionPane.showMessageDialog(null, "Id: " + Objeto.getId());
        JOptionPane.showMessageDialog(null, "Nome da pessoa: " + Objeto.getNome());
        JOptionPane.showMessageDialog(null, "Idade: " + Objeto.getIdade());
        
        
        Aluno Objeto2 = new Aluno ();
        
        Objeto2.setCurso ("Matematica");
        Objeto2.setFase (3);
        
        JOptionPane.showMessageDialog(null, "Curso: " + Objeto2.getCurso());
        JOptionPane.showMessageDialog(null, "Fase: " + Objeto2.getFase());
        
        
        
        Professor Objeto3 = new Professor ();
        
        Objeto3.setSalario ( 3000 );
        Objeto3.setMateria ( " Geografia " );
        
        JOptionPane.showMessageDialog(null,"Materia: " + Objeto3.getMateria());
        JOptionPane.showMessageDialog(null,"Salario: " + Objeto3.getSalario());
        
        
        Funcionario objeto4 = new Funcionario ();

        objeto4.setProfissao ("Professor");
        objeto4.setCH (23);
        
        JOptionPane.showMessageDialog(null,"Profissao: " + objeto4.getProfissao());
        JOptionPane.showMessageDialog(null, "Carga Horaria: " + objeto4.getCH());
    }
}
