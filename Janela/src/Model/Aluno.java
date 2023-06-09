package Model;

import java.util.*;
import DAO.AlunoDAO;

public class Aluno extends Pessoa {

    private String curso;
    private int fase;

    public Aluno() {
    }

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    public Aluno(String curso, int fase, int id, String nome,
            int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return "\n ID: " + this.getId()
                + "\n Nome: "
                + this.getNome()
                + "\n Idade: " + this.getIdade()
                + "\n Curso: " + this.getCurso()
                + "\n Fase:" + this.getFase()
                + "\n -----------";

    }

    public ArrayList getMinhaLista() {
        return AlunoDAO.MinhaLista;
    }

    public boolean InsertAlunoBD(String curso, int fase, String nome, int idade) {
        int id = this.maiorID() + 1;
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        AlunoDAO.MinhaLista.add(objeto);
        return true;
    }

    public boolean DeleteAlunoBD(int id) {
        int indice = this.procuraIndice(id);
        AlunoDAO.MinhaLista.remove(indice);
        return true;
    }

    public boolean UpdateAlunoBD(String curso, int fase, int id,
            String nome, int idade) {
        Aluno objeto = new Aluno(curso, fase, id, nome, idade);
        int indice = this.procuraIndice(id);
        AlunoDAO.MinhaLista.set(indice, objeto);
        return true;
    }

    private int procuraIndice(int id) {
        int indice = -1;
        for (int i = 0; i < AlunoDAO.MinhaLista.size();
                i++) {

            if (AlunoDAO.MinhaLista.get(i).getId()
                    == id) {

                indice = i;
            }
        }
        return indice;
    }

    public Aluno carregaAluno(int id) {
        int indice = this.procuraIndice(id);
        return AlunoDAO.MinhaLista.get(indice);
    }

    public int maiorID() {
        return AlunoDAO.maiorID();
    }
}
