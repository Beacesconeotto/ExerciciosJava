package View;

import javax.swing.*;
import Model.Aluno;
import Model.Pessoa;
import DAO.AlunoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class GerenciarAluno extends javax.swing.JFrame {

    private Aluno objaluno; // cria o vínculo com Aluno.java

    public GerenciarAluno() {
        initComponents();
        this.objaluno = new Aluno(); // carrega o objeto de aluno
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlunos = new javax.swing.JTable();
        c_fase = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        Idade = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        c_idade = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        Fase = new javax.swing.JLabel();
        c_curso = new javax.swing.JTextField();
        Apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Curso", "Fase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlunos);
        if (jTableAlunos.getColumnModel().getColumnCount() > 0) {
            jTableAlunos.getColumnModel().getColumn(0).setResizable(false);
            jTableAlunos.getColumnModel().getColumn(1).setResizable(false);
            jTableAlunos.getColumnModel().getColumn(2).setResizable(false);
            jTableAlunos.getColumnModel().getColumn(3).setResizable(false);
            jTableAlunos.getColumnModel().getColumn(4).setResizable(false);
        }

        c_fase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_faseActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Nome.setText("Nome:");

        Idade.setText("Idade:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        Curso.setText("Curso:");

        Fase.setText("Fase:");

        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Fase, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(Cancelar)
                .addGap(28, 28, 28)
                .addComponent(Alterar)
                .addGap(18, 18, 18)
                .addComponent(Apagar)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idade)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fase)
                    .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar)
                    .addComponent(Alterar)
                    .addComponent(Apagar))
                .addGap(48, 48, 48))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c_faseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_faseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_faseActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
        // TODO add your handling code here:
        try {

int id = 0;
if (this.jTableAlunos.getSelectedRow() == -1) {
throw new Mensagens("Primeiro Selecione um Aluno para APAGAR");
} else {
id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
}

int resposta_usuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja APAGAR este Aluno ?");

if (resposta_usuario == 0) {// clicou em SIM

if (this.objaluno.DeleteAlunoBD(id)) {
// limpa os campos
this.c_nome.setText("");
this.c_idade.setText("");
this.c_curso.setText("");
this.c_fase.setText("");
JOptionPane.showMessageDialog(rootPane, "Aluno Apagado com Sucesso!");

}
}
System.out.println(this.objaluno.getMinhaLista().toString());

} catch (Mensagens erro) {
JOptionPane.showMessageDialog(null,
erro.getMessage());
} finally {
// atualiza a tabela.
carregaTabela();
}
    }//GEN-LAST:event_ApagarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        // TODO add your handling code here:
        
                try {
// recebendo e validando dados da interface gráfica.
            int id = 0;
            String nome = "";
            int idade = 0;
            String curso = "";
            int fase = 0;
            if (this.c_nome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.c_nome.getText();
            }
            if (this.c_idade.getText().length() <= 0) {
                throw new Mensagens("Idade deve ser número e maior que zero.");
            } else {
                idade = Integer.parseInt(this.c_idade.getText());
            }
            if (this.c_curso.getText().length() < 2) {
                throw new Mensagens("Curso deve conter ao menos 2 caracteres.");
            } else {
                curso = this.c_curso.getText();
            }
            if (this.c_fase.getText().length() <= 0) {
                throw new Mensagens("Fase deve ser número e maior que zero.");
            } else {
                fase = Integer.parseInt(this.c_fase.getText());
            }
            if (this.jTableAlunos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro Selecione um Aluno para Alterar");
            } else {
                id = Integer.parseInt(this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 0).toString());
            }
// envia os dados para o Controlador processar
            if (this.objaluno.UpdateAlunoBD(curso, fase, id, nome, idade)) {
// limpa os campos
                this.Nome.setText("");
                this.Idade.setText("");
                this.Curso.setText("");
                this.Fase.setText("");
                JOptionPane.showMessageDialog(rootPane, "Aluno Alterado com Sucesso!");
            }
            System.out.println(this.objaluno.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
        }

        
    }

    public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableAlunos.getModel();
        modelo.setNumRows(0);
        ArrayList<Aluno> minhalista = new ArrayList<>();
        minhalista = objaluno.getMinhaLista();
        for (Aluno a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getIdade(),
                a.getCurso(),
                a.getFase()
            });
  
    }//GEN-LAST:event_AlterarActionPerformed
    }
    private void jTableAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlunosMouseClicked
        // TODO add your handling code here:
        if (this.jTableAlunos.getSelectedRow() != -1) {

String nome = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 1).toString();
String idade = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 2).toString();
String curso = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 3).toString();
String fase = this.jTableAlunos.getValueAt(this.jTableAlunos.getSelectedRow(), 4).toString();

this.c_nome.setText(nome);
this.c_idade.setText(idade);
this.c_curso.setText(curso);
this.c_fase.setText(fase);

}
    }//GEN-LAST:event_jTableAlunosMouseClicked
    
/**
 * @param args the command line arguments
 */
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

}
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluno.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluno.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluno.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarAluno.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarAluno().setVisible(true);
                        }
        });
    

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Fase;
    private javax.swing.JLabel Idade;
    private javax.swing.JLabel Nome;
    private javax.swing.JTextField c_curso;
    private javax.swing.JTextField c_fase;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlunos;
    // End of variables declaration//GEN-END:variables
}
