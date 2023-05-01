package Model;

public class Professor extends Funcionario {
    
// Atributos

    private String materia;
    private double salario;
    
// Método Construtor de Objeto Vazio

    public Professor() {
    }
    
// Método Construtor de Objeto, inserindo dados

    public Professor(String materia, double salario) {
        this.materia = materia;
        this.salario = salario;
    }
// Método Construtor usando também o construtor da SUPERCLASSE

    public Professor(String profissao, int CH) {
        super( profissao, CH);
        this.materia = materia;
        this.salario = salario;
    }
// Métodos GET e SET

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
// Exemplo de Override

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Materia: " + this.materia);
        System.out.println("Salario: " + this.salario);
}
}
