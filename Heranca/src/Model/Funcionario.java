package Model;

public class Funcionario extends Pessoa {
    
    private int CH;
    private String profissao;
    
    public Funcionario () {
    }
    
    public Funcionario (String profissao, int CH) {
        this.CH = CH;
        this.profissao = profissao;
    }
    
    public Funcionario (int id, String nome, int idade) {
    super(id, nome, idade);
    this.CH = CH;
    this.profissao = profissao;
   }
    public String getProfissao () {
        return profissao;
    }
    
    public void setProfissao (String profissao) {
        this.profissao = profissao;
    }
    public int getCH () {
        return CH;
    }
    
    public void setCH ( int CH) {
    this.CH = CH;
    }
    
  @Override
    public void mostraDados() {
    super.mostraDados ();
    System.out.println ("Profissao: " + this.profissao);
    System.out.println ("Carga Horaria: " + this.CH);
    }
    
   }
