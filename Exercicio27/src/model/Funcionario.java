/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author beace
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    
   public Funcionario () {
}
    
    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double getSalario () {
    return salario;
    }
    
    public void setSalario (double salario) {
    this.salario = salario;
    }
    
    public String getnome () {
    return nome;
    }
    
    public void setnome (String nome) {
    this.nome = nome;
    }
}


