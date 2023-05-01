/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;
import model.produto;

/**
 *
 * @author beace
 */
public class pincipal {
    // Método Principal, este determina a ORDEM das ações.

    public static void main(String[] args) {
// Instanciação, usando métodos construtores, de 3 Objetos da Classe Produto do Pacote Model
        produto ObjetoProduto1 = new produto(1, "Cerveja Longneck Budweiser 330ml", "Fardo com 6 unidades", 25.0, 60);
        produto ObjetoProduto2 = new produto(2, "Cerveja Caixa Heineken 350ml", "Caixa com 12 unidades", 30.0, 40);
// Instanciação de produto vazio
        produto ObjetoProduto3 = new produto();
// Uso dos métodos GET 
        JOptionPane.showMessageDialog(null, "\n\n------ TESTE 1 ---- Nada em Produto 3 -----------\n\n");
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto1.getId() + "\n Nome: \n" + ObjetoProduto1.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto2.getId() + "\n Nome: \n" + ObjetoProduto2.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto3.getId() + "\n Nome: \n" + ObjetoProduto3.getNome());
// Uso dos métodos SET
        ObjetoProduto3.setId(3);
        ObjetoProduto3.setNome("Refrigerante Pureza 2 litros");
        ObjetoProduto3.setDescricao("1 unidade");
        ObjetoProduto3.setPreco(4.0);
        ObjetoProduto3.setEstoque(100);

// Teste dos métodos SET e GET
        JOptionPane.showMessageDialog(null, "\n\n------ TESTE 2 ---- Produto 3 foi criado -----------\n\n");
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto1.getId() + "\n Nome: \n" + ObjetoProduto1.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto2.getId() + "\n Nome: \n" + ObjetoProduto2.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + ObjetoProduto3.getId() + "\n Nome: \n" + ObjetoProduto3.getNome());
// Exemplo todos os dados
        JOptionPane.showMessageDialog(null, "\n\n------ TESTE 3 ---- Produto 3 todos os dados! -----------\n\n");
        JOptionPane.showMessageDialog(null,
                " Id: " + ObjetoProduto3.getId()
                + "\n Nome: " + ObjetoProduto3.getNome()
                + "\n Descrição: \n" + ObjetoProduto3.getDescricao()
                + "\n Preço: R$ " + ObjetoProduto3.getPreco()
                + "\n Estoque: " + ObjetoProduto3.getEstoque()
        );
// modificando o preço de Produto 3 de R$ 4 reais para R$ 5 reais
        ObjetoProduto3.setPreco(5.0);
        JOptionPane.showMessageDialog(null, "\n\n------ TESTE 4 ---- Produto 3 alteração de preço! -----------\n\n");
        JOptionPane.showMessageDialog(null,
                " Id: " + ObjetoProduto3.getId()
                + "\n Nome: " + ObjetoProduto3.getNome()
                + "\n Descrição: \n" + ObjetoProduto3.getDescricao()
                + "\n Preço: R$ " + ObjetoProduto3.getPreco()
                + "\n Estoque: " + ObjetoProduto3.getEstoque()
        );
    }

}
