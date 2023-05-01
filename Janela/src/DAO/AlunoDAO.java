package DAO;

import Model.Aluno;
import java.util.ArrayList;

public class AlunoDAO {

    public static ArrayList<Aluno> MinhaLista = new ArrayList<>();

    public static int maiorID() {
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();

                return maiorID;
            }
        }

        return maiorID;
    }
}
