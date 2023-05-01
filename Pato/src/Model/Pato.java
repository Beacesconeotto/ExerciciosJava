
package Model;
import javax.swing.JOptionPane;

public abstract class Pato {
    
    private String nome;
    private int idade;

    public Pato() {
    }

    public Pato(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public abstract void looksLike(); // Comportamento comum com implementações diferentes nas subs
    
    public void quack(){
        JOptionPane.showMessageDialog(null, 
            this.nome + " - Quack!");
    }
    
    public void fazerAniversario(){
        this.idade++;
        
        JOptionPane.showMessageDialog(null, 
            this.nome + " está fazendo " + this.idade + " anos hoje!");
    }
    
}