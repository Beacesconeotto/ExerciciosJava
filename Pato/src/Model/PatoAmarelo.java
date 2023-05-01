package Model;

import javax.swing.JOptionPane;

public class PatoAmarelo extends Pato {

    public PatoAmarelo() {
    }
    
    public PatoAmarelo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void looksLike() {
        JOptionPane.showMessageDialog(null, 
            this.getNome() + " é um pato amarelão brabo, bonitão"
        ); 
    }
    
}
