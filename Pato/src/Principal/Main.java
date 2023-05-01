package Principal;

import Model.Pato;
import Model.PatoAmarelo;
import Model.PatoCinza;

public class Main {

    public static void main(String[] args) {
        PatoAmarelo pato1 = new PatoAmarelo("João", 5);
        PatoCinza pato2 = new PatoCinza();

        /* 
        Pato pato3 = new Pato();  
        
        Obs.: Objeto(Pato) não pode ser instanciado, pois a classe é abstrata  
         */
        pato1.looksLike();
        pato2.looksLike();
    }
}
