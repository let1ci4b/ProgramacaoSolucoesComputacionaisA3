package View;

import DAO.FerramentaDAO;
import Model.Ferramenta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaFerramentas extends javax.swing.JFrame {
    
    private FerramentaDAO ferramentaDAO; // cria o vinculo com o Ferramenta.java
    
    public TelaFerramentas() {
        initComponents();
        this.ferramentaDAO = new FerramentaDAO(); // carrega DAO de Ferramenta.java
        carregaTabela();
        custoFerramentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoNome = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoCusto = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        campoCustoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFerramenta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ferramentas");
        setUndecorated(true);
        setResizable(false);

        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        campoMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        campoCusto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCadastra.png"))); // NOI18N
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnEdita.png"))); // NOI18N
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnExclui.png"))); // NOI18N
        btnExcluir.setBorderPainted(false);
        btnExcluir.setContentAreaFilled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        campoCustoTotal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        campoCustoTotal.setForeground(new java.awt.Color(255, 255, 255));
        campoCustoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        tableFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome:", "Marca:", "Custo:"
            }
        ));
        tableFerramenta.setRowHeight(25);
        tableFerramenta.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tableFerramenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableFerramenta);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaFerramentas_1.png"))); // NOI18N

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnexit.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1000, 1000, 1000)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(800, 800, 800)
                .addComponent(campoCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(campoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(campoCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnExcluir))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(campoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
          try {
            // recebendo e validando dados da interface grafica.
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }
            
            if (this.campoMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.campoMarca.getText();
            }

            if (this.campoCusto.getText().length() < 2) {
                throw new Mensagens("Custo deve ser número e conter ao menos 2 dígitos.");
            } else {
                custo = Double.parseDouble(this.campoCusto.getText());
            }
            
            Ferramenta objeto = new Ferramenta(nome, marca, custo);
            
            // envia os dados para o Controlador cadastrar
            if (this.ferramentaDAO.InsertFerramentaBD(objeto)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");

                // limpa campos da interface
                this.campoNome.setText("");
                this.campoMarca.setText("");
                this.campoCusto.setText("");
            }

            System.out.println(this.ferramentaDAO.getMinhaLista().toString());

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Custo inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException erro) {
            Logger.getLogger(TelaFerramentas.class.getName()).log(Level.SEVERE, null, erro);
        } finally {
            carregaTabela(); // atualiza a tabela.
            custoFerramentas(); // atualiza o valor das ferramentas.
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
          
        try {
            int id = 0;
            
            if(this.tableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione uma ferramenta para remover");
            } else {
                id = Integer.parseInt(this.tableFerramenta.getValueAt(this.tableFerramenta.getSelectedRow(), 0).toString());
            }
            
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover esta ferramenta?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION && this.ferramentaDAO.DeleteFerramentaBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta removida com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
            custoFerramentas();
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        try {
            // recebendo e validando dados da interface grafica.
        
            int id = 0;
            String nome = "";
            String marca = "";
            double custoAquisicao = 0;
            
            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = (this.campoMarca.getText());
            }
            
            if (this.campoCusto.getText().length() < 2) {
                throw new Mensagens("Custo deve ser número e conter ao menos 2 dígitos.");
            } else {
                custoAquisicao = Double.parseDouble(this.campoCusto.getText());
            }

            if (this.tableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione uma ferramenta para alterar");
            } else {
                id = Integer.parseInt(this.tableFerramenta.getValueAt(this.tableFerramenta.getSelectedRow(), 0).toString());
            }

            // envia os dados para a Ferramenta processar
            if (this.ferramentaDAO.UpdateFerramentaBD(new Ferramenta(id, nome, marca, custoAquisicao))) {

                // limpa os campos
                this.campoNome.setText("");
                this.campoMarca.setText("");
                this.campoCusto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com sucesso!");

            }
            System.out.println(this.ferramentaDAO.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Custo inválido, informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
            custoFerramentas();
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        TelaFerramentas.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    public void carregaTabela() { // listando os objetos ferramenta na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableFerramenta.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramenta> minhalista = ferramentaDAO.getMinhaLista();

        for (Ferramenta a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getCustoAquisicao()
            });
        }
    }
    
    public void custoFerramentas(){
        String contadorCusto = String.valueOf(ferramentaDAO.getContadorCusto());
        this.campoCustoTotal.setText(contadorCusto);
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFerramentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFerramentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField campoCusto;
    private javax.swing.JLabel campoCustoTotal;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFerramenta;
    // End of variables declaration//GEN-END:variables
}
