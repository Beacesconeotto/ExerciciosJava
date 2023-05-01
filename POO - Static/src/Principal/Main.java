package principal;

import Model.Bebida;

public class Main {

    public static void main(String[] args) {
        String codigoatual = "2568715";
        String novocodigo = codigoatual;
        Bebida objetobebida1 = new Bebida();
        System.out.println("TESTE 1 : Cod.: " + novocodigo); // output será: TESTE 1 : Cod.: 2568715
        novocodigo = objetobebida1.Incluircodigo_inicio(codigoatual);
        System.out.println("TESTE 2 : Cod.: " + novocodigo); // output será: TESTE 2 : Cod.: BR01SC2568715
        novocodigo = objetobebida1.Incluircodigo_fim(novocodigo);
        System.out.println("TESTE 3 : Cod.: " + novocodigo); // output será: TESTE 3 : Cod.: BR01SC2568715FLN
    }
}
