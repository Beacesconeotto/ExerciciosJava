package Model;

import javax.swing.JOptionPane;

public class PatoCinza extends Pato {

    public PatoCinza() {
    }

    public PatoCinza(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void looksLike() {
        JOptionPane.showMessageDialog(null, 
            this.getNome() + " é um pato cinzão brabo, bonitão"
        );
    }

    
}
