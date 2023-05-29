/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.*;
import Model.Emprestimo;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author leth4
 */
public class TelaEmprestimos extends javax.swing.JFrame {
    
    private EmprestimoDAO emprestimoDAO;
    private AmigoDAO amigoDAO;
    private FerramentaDAO ferramentaDAO;
    private MaskFormatter mascaraData;
    
    public TelaEmprestimos() {
        mascaraCampo();
        initComponents();
        modificarVisual();
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

        campoDataPed = new javax.swing.JFormattedTextField(mascaraData);
        campoFerramenta = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmprestimos = new javax.swing.JTable();
        campoDataDev = new javax.swing.JFormattedTextField(mascaraData);
        campoAmigo = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimos");
        setUndecorated(true);
        setResizable(false);

        campoDataPed.setForeground(new java.awt.Color(110, 13, 37));
        campoDataPed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoDataPed.setSelectionColor(new java.awt.Color(255, 204, 204));

        campoFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoFerramenta.setForeground(new java.awt.Color(110, 13, 37));
        campoFerramenta.setSelectionColor(new java.awt.Color(255, 204, 204));

        btnCadastrar.setBackground(new java.awt.Color(110, 13, 37));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText(" Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(110, 13, 37));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(110, 13, 37));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tableEmprestimos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmprestimos.setRowHeight(25);
        tableEmprestimos.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableEmprestimos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableEmprestimos);

        campoDataDev.setForeground(new java.awt.Color(110, 13, 37));
        campoDataDev.setToolTipText("");
        campoDataDev.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoDataDev.setSelectionColor(new java.awt.Color(255, 204, 204));

        campoAmigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoAmigo.setForeground(new java.awt.Color(110, 13, 37));
        campoAmigo.setSelectionColor(new java.awt.Color(255, 204, 204));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnexit.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 13, 37));
        jLabel1.setText("ID amigo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(110, 13, 37));
        jLabel2.setText("Data pedido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 13, 37));
        jLabel3.setText("ID ferramenta:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(110, 13, 37));
        jLabel4.setText("Data devolução:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(110, 13, 37));
        jLabel6.setText("EMPRÉSTIMOS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaEmprestimos_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(campoDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1010, 1010, 1010)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(campoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campoDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try {
        
            int idAmigo = 0;
            int idFerramenta = 0;
            java.sql.Date dataEmprestimo;
            java.sql.Date dataDevolucao = null;
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);
            
            if (Integer.parseInt(this.campoAmigo.getText()) < 0 || Integer.parseInt(this.campoFerramenta.getText()) < 0) {
                throw new Mensagens("ID deve ser um número positivo.");
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
                
                if(dataEmprestimo.getTime() > dataDevolucao.getTime()) {
                    throw new Mensagens("Data de empréstimo se encontra após data de devolução.");
                }
            }
            
            Emprestimo objeto = new Emprestimo(amigoDAO.carregaAmigo(idAmigo),
                                            ferramentaDAO.carregaFerramenta(idFerramenta),
                                                dataEmprestimo,
                                                dataDevolucao);
            if (this.emprestimoDAO.UpdateEmprestimoBD(objeto)) {

                // limpa os campos
                this.campoAmigo.setText("");
                this.campoFerramenta.setText("");
                this.campoDataPed.setText("");
                this.campoDataDev.setText("");
                JOptionPane.showMessageDialog(rootPane, "Empréstimo alterado com sucesso!");

            }
            System.out.println(this.emprestimoDAO.getMinhaLista().toString());
        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Favor, informe os IDs necessários para alteração.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao converter data inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }
        
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
            sdf.setLenient(false);

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
                
                if(dataEmprestimo.getTime() > dataDevolucao.getTime()) {
                    throw new Mensagens("Data de empréstimo se encontra após data de devolução");
                }
            }
            
            Emprestimo objeto = new Emprestimo(amigoDAO.carregaAmigo(idAmigo),
                                            ferramentaDAO.carregaFerramenta(idFerramenta),
                                                dataEmprestimo,
                                                dataDevolucao);
            
            if(this.emprestimoDAO.InsertEmprestimoBD(objeto)) {
                
                this.campoAmigo.setText("");
                this.campoFerramenta.setText("");
                this.campoDataPed.setValue(null);
                this.campoDataDev.setValue(null);
                amigoDAO.UpdateQtdEmprest(objeto.getAmigo().getId()); // atualiza a qtd de emprestimos de um amigo
                
                JOptionPane.showMessageDialog(rootPane, "Empréstimo cadastrado com sucesso!");
            }
            
        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Favor, informe os IDs necessários para o cadastro.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao converter data inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        try {
            int id = 0;
            int idAmigo = 0;
            
            if(this.tableEmprestimos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um empréstimo para remover");
            } else {
                id = Integer.parseInt(this.tableEmprestimos.getValueAt(this.tableEmprestimos.getSelectedRow(), 0).toString());
                idAmigo = this.emprestimoDAO.getAmigoDoEmprestimo(id);
            }
            
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover este empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION && this.emprestimoDAO.DeleteEmprestimoBD(id)) {
                this.amigoDAO.UpdateQtdEmprest(idAmigo);
                JOptionPane.showMessageDialog(rootPane, "Empréstimo removido com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        TelaEmprestimos.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void carregaTabela() { // listando os objetos emprestimo na tabela

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
    
    private void mascaraCampo() {
        try {
            mascaraData = new MaskFormatter("##-##-####");
            mascaraData.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            Logger.getLogger(TelaEmprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarVisual() {
        Color accentColor = Color.decode("#6e0d25");
        campoAmigo.setBorder(new LineBorder(accentColor, 1));
        campoFerramenta.setBorder(new LineBorder(accentColor, 1));
        campoDataPed.setBorder(new LineBorder(accentColor, 1));
        campoDataDev.setBorder(new LineBorder(accentColor, 1));
        tableEmprestimos.setGridColor(accentColor);
        tableEmprestimos.setBorder(new LineBorder(accentColor, 1));
        tableEmprestimos.setForeground(accentColor);
        tableEmprestimos.setSelectionForeground(accentColor);
        
        JTableHeader tableHeader = tableEmprestimos.getTableHeader();
        tableHeader.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setForeground(accentColor);
        tableHeader.setBorder(new LineBorder(accentColor, 1));
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tableEmprestimos.setDefaultRenderer(Object.class, centerRenderer);
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
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField campoAmigo;
    private javax.swing.JFormattedTextField campoDataDev;
    private javax.swing.JFormattedTextField campoDataPed;
    private javax.swing.JTextField campoFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmprestimos;
    // End of variables declaration//GEN-END:variables
}
