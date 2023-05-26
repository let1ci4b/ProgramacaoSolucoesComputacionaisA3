/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.*;
import Model.Amigo;
import Model.Emprestimo;
import Model.Ferramenta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author leth4
 */
public class TelaEmprestimos extends javax.swing.JFrame {
    
    private EmprestimoDAO emprestimoDAO;
    private AmigoDAO amigoDAO;
    private FerramentaDAO ferramentaDAO;
    private MaskFormatter mascaraData = null;
    
    public TelaEmprestimos() {
        mascaraCampo();
        initComponents();
        this.emprestimoDAO = new EmprestimoDAO();
        this.amigoDAO = new AmigoDAO();
        carregaTabela();
        //amigoDAO.UpdateQtdEmprest(objeto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoAmigo = new javax.swing.JTextField();
        campoDataPed = new javax.swing.JFormattedTextField(mascaraData);
        campoFerramenta = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmprestimos = new javax.swing.JTable();
        campoDataDev = new javax.swing.JFormattedTextField(mascaraData);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimos");

        jLabel1.setText("ID amigo:");

        jLabel2.setText("Data pedido:");

        jLabel3.setText("ID ferramenta:");

        jLabel4.setText("Data devolução:");

        campoAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAmigoActionPerformed(evt);
            }
        });

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");

        tableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID:", "Amigo:", "Ferramenta:", "Data pedido:", "Data devolução:", "Status:"
            }
        ));
        tableEmprestimos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableEmprestimos);

        campoDataDev.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(campoDataPed, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(campoDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAmigoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
            // recebendo e validando dados da interface grafica.
            this.amigoDAO = new AmigoDAO();
            this.ferramentaDAO = new FerramentaDAO();
            
            int idAmigo = 0;
            int idFerramenta = 0;
            java.sql.Date dataEmprestimo;
            java.sql.Date dataDevolucao = null;
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            if (Integer.parseInt(this.campoAmigo.getText()) < 0 || Integer.parseInt(this.campoFerramenta.getText()) < 0) {
                throw new Mensagens("O ID inserido é inválido.");
            } else {
                idAmigo = Integer.parseInt(this.campoAmigo.getText());
                idFerramenta = Integer.parseInt(this.campoFerramenta.getText());
            }
            
            if(this.campoDataPed.getText().contains("_")) {
                throw new Mensagens("Insira uma data de empréstimo válida.");
            } else {
                Date dataPadrao = sdf.parse(this.campoDataPed.getText());
                long tempo = dataPadrao.getTime();
                dataEmprestimo = new java.sql.Date(tempo);
            }
            
            if(!this.campoDataDev.getText().contains("_")) {
                Date dataPadrao = sdf.parse(this.campoDataDev.getText());
                long tempo = dataPadrao.getTime();
                dataDevolucao = new java.sql.Date(tempo);
            }
            
            Emprestimo objeto = new Emprestimo(amigoDAO.carregaAmigo(idAmigo),
                                            ferramentaDAO.carregaFerramenta(idFerramenta),
                                                dataEmprestimo,
                                                dataDevolucao);
            
            if(this.emprestimoDAO.InsertEmprestimoBD(objeto)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo Cadastrado com sucesso!");
                
                this.campoAmigo.setText("");
                this.campoFerramenta.setText("");
                this.campoDataPed.setText("");
                this.campoDataDev.setText("");
                amigoDAO.UpdateQtdEmprest(objeto.getAmigo()); // atualiza a qtd de emprestimos de um amigo
            }
            
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Informe um número.");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (ParseException erro) {
            Logger.getLogger(TelaEmprestimos.class.getName()).log(Level.SEVERE, null, erro);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void carregaTabela() { // listando os objetos emprestimo na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableEmprestimos.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = emprestimoDAO.getMinhaLista();

        for (Emprestimo e : minhalista) {
            modelo.addRow(new Object[]{
                e.getId(),
                e.getAmigo().getNome(),
                e.getFerramenta().getNome(),
                e.getDataEmprestimo(),
                e.getDataDevolucao(),
                e.isStatus()
            });
        }
    }
    
    public void mascaraCampo() {
        try {
            mascaraData = new MaskFormatter("##-##-####");
            mascaraData.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            Logger.getLogger(TelaEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoAmigo;
    private javax.swing.JFormattedTextField campoDataDev;
    private javax.swing.JFormattedTextField campoDataPed;
    private javax.swing.JTextField campoFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmprestimos;
    // End of variables declaration//GEN-END:variables
}
