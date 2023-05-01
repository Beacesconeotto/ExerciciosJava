/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author beace
 */
public class produto {
        // TODO// Atributos
private int id;
private String nome;
private String descricao;
private double preco;
private int estoque;
// Método Construtor de Objeto Vazio
public produto() { 
}
// Método Construtor de Objeto, inserindo dados
public produto(int id, String nome, String descricao, double preco, int estoque) {
this.id = id;
this.nome = nome;
this.descricao = descricao;
this.preco = preco;
this.estoque = estoque;
}
// continua na coluna ao lado.
// Métodos GET e SET
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public String getDescricao() {
return descricao;
}
public void setDescricao(String descricao) {
this.descricao = descricao;
}
public double getPreco() {
return preco;
}
public void setPreco(double preco) {
this.preco = preco;
}
public int getEstoque() {
return estoque;
}
public void setEstoque(int estoque) {
this.estoque = estoque;
}
    }
    
