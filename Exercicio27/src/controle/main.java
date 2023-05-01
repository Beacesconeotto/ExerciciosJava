/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;
import model.Dados;
import model.Funcionario;
/**
 *
 * @author beace
 */
public class main {
    public static void main ( String[] args) {
        
        Dados objeto = new Dados();
        
        objeto.setnome( "Alan" );
        objeto.setidade ( 22 );
        objeto.setpeso ( 72 );
        
        JOptionPane.showMessageDialog( null,"Nome do aluno: " + objeto.getnome());
        JOptionPane.showMessageDialog(null, "Idade: " + objeto.getidade());
        JOptionPane.showMessageDialog(null, "Peso: " + objeto.getpeso());    
        
        
        
        Funcionario objeto2 = new Funcionario ();
        
        objeto2.setnome ( "Thais" );
        objeto2.setSalario ( 2300 );
        
        JOptionPane.showMessageDialog( null,"Nome  do funcionario: " + objeto.getnome() + "\n"
                + "Salario: " + objeto2.getSalario());
        
    }
}