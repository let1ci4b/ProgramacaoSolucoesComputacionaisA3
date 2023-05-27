package View;

import DAO.AmigoDAO;
import Model.Amigo;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaAmigos extends javax.swing.JFrame {
    
    private AmigoDAO amigoDAO; // cria o vinculo com o Amigo.java

    public TelaAmigos() {
        initComponents();
        this.amigoDAO = new AmigoDAO(); // carrega DAO de Amigo.java
        this.carregaTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdita = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        btnExclui = new javax.swing.JButton();
        btnCadastra = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAmigo = new javax.swing.JTable();
        campoTelefone = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Amigos");
        setUndecorated(true);

        btnEdita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnEdita.png"))); // NOI18N
        btnEdita.setBorderPainted(false);
        btnEdita.setContentAreaFilled(false);
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setCaretColor(new java.awt.Color(110, 13, 37));
        campoNome.setSelectionColor(new java.awt.Color(110, 13, 37));

        btnExclui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnExclui.png"))); // NOI18N
        btnExclui.setBorderPainted(false);
        btnExclui.setContentAreaFilled(false);
        btnExclui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluiActionPerformed(evt);
            }
        });

        btnCadastra.setForeground(new java.awt.Color(110, 13, 37));
        btnCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCadastra.png"))); // NOI18N
        btnCadastra.setBorder(null);
        btnCadastra.setBorderPainted(false);
        btnCadastra.setContentAreaFilled(false);
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        tableAmigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Empréstimos"
            }
        ));
        tableAmigo.setGridColor(new java.awt.Color(204, 204, 204));
        tableAmigo.setRowHeight(25);
        tableAmigo.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableAmigo.setSurrendersFocusOnKeystroke(true);
        tableAmigo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableAmigo);

        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnexit.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaAmigo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnExclui, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnEdita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
            .addGroup(layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
        
        try {
            // recebendo e validando dados da interface grafica.
        
            int id = 0;
            String nome = "";
            long telefone =  0;
            
            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoTelefone.getText().length() != 11) {
                throw new Mensagens("Telefone deve ser número e conter 11 dígitos.");
            } else {
                telefone = Long.parseLong(this.campoTelefone.getText());
            }

            if (this.tableAmigo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um amigo para alterar");
            } else {
                id = Integer.parseInt(this.tableAmigo.getValueAt(this.tableAmigo.getSelectedRow(), 0).toString());
            }

            // envia os dados para o Amigo processar
            if (this.amigoDAO.UpdateAmigoBD(new Amigo(id, nome, telefone))) {

                // limpa os campos
                this.campoNome.setText("");
                this.campoTelefone.setText("");
                JOptionPane.showMessageDialog(rootPane, "Amigo alterado com sucesso!");

            }
            System.out.println(this.amigoDAO.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Telefone inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
        
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        
        try {
            // recebendo e validando dados da interface grafica.
            String nome = "";
            long telefone = 0;
            int quantEmprest = 0;

            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoTelefone.getText().length() != 11) {
                throw new Mensagens("Telefone deve ser número e conter 11 dígitos.");
            } else {
                telefone = Long.parseLong(this.campoTelefone.getText());
            }
            
            // envia os dados para o Controlador cadastrar
            if (this.amigoDAO.InsertAmigoBD(new Amigo(nome, telefone, quantEmprest))) {
                JOptionPane.showMessageDialog(rootPane, "Amigo cadastrado com sucesso!");

                // limpa campos da interface
                this.campoNome.setText("");
                this.campoTelefone.setText("");
            }

            System.out.println(this.amigoDAO.getMinhaLista().toString());

        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Telefone inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnExcluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluiActionPerformed
        
        try {
            int id = 0;
            
            if(this.tableAmigo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um amigo para remover");
            } else {
                id = Integer.parseInt(this.tableAmigo.getValueAt(this.tableAmigo.getSelectedRow(), 0).toString());
            }
            
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover este amigo?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION && this.amigoDAO.DeleteAmigoBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo removido com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_btnExcluiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        TelaAmigos.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public void carregaTabela() { // listando os objetos amigo na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableAmigo.getModel();
        modelo.setNumRows(0);

        ArrayList<Amigo> minhalista = amigoDAO.getMinhaLista();

        for (Amigo a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),
                a.getQuantEmprest()
            });
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAmigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnEdita;
    private javax.swing.JButton btnExclui;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableAmigo;
    // End of variables declaration//GEN-END:variables
}
