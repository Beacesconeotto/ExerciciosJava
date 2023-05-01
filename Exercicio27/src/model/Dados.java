/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * get mostra o nome e set altera o nome
 * @author beace
 */
public class Dados {
    private String nome;
    private int idade;
    private double peso;
    
    public Dados () {
    }
    
    
    public Dados (String nome, int idade, double peso) {
        this.idade = idade;
        this.nome = nome;
        this.peso = peso;
    }
    
    public int getidade() {
        return idade;
    }
    
    public void setidade (int idade) {
        this.idade = idade;
    }
    
    public double getpeso () {
        return peso;
    }
    
    public void setpeso (double peso) {
        this.peso = peso;
    }
    
    public String getnome () {
    return nome;
    }
    
    public void setnome (String nome) {
    this.nome = nome;
    }
}
