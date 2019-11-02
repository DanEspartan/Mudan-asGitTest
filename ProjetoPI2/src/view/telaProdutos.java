/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheus.dcosta2
 */
public class telaProdutos extends javax.swing.JFrame {

    /**
     * Creates new form telaProdutos
     */
    public telaProdutos() {
        initComponents();
        this.LoadTable();
    }
    
    public void LoadTable() {
        ArrayList<String[]> linhasProdutos = ProdutoController.getProdutos();

        DefaultTableModel tblModProduto = new DefaultTableModel();
        tblModProduto.addColumn("ID produto");
        tblModProduto.addColumn("Nome");
        tblModProduto.addColumn("Marca");
        tblModProduto.addColumn("Preco");
        tblProduto.setModel(tblModProduto);

        for (String[] c : linhasProdutos) {
            tblModProduto.addRow(c);
        }
        
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50); //ID
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(100);//Nome
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(300);//Deescrição
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(50);//Valor
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        btnDeletar = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        btnNovo = new javax.swing.JButton();
        btnExibir = new javax.swing.JToggleButton();
        jCbFiltro = new javax.swing.JComboBox<>();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        mnuBarra = new javax.swing.JMenuBar();
        mnuExecutar = new javax.swing.JMenu();
        ImnuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos cadastrados"));

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        btnDeletar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        jCbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro", "Nome", "Marca", " ", " " }));
        jCbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbFiltroActionPerformed(evt);
            }
        });

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Procurar-18dp.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Camada 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCbFiltro)
                    .addComponent(txtPesquisa)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        mnuExecutar.setText("Executar");

        ImnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ImnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Exit-18dp.png"))); // NOI18N
        ImnuSair.setText("Sair");
        mnuExecutar.add(ImnuSair);

        mnuBarra.add(mnuExecutar);

        setJMenuBar(mnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        new CadProduto().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void jCbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbFiltroActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tblProduto.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            int numeroLinha = tblProduto.getSelectedRow();
                int salvarId = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha,0 ).toString());
            if (tblProduto.getSelectedRow() >= 0) {
                new ExibirProdutoView(salvarId).setVisible(true);
                this.dispose();
                
                
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto para modificar!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos cadastrados");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        if (tblProduto.getRowCount() > 0) {
            //Verifico se o usuário selecionou alguma linha (Primeira linha = 0)
            int numeroLinha = tblProduto.getSelectedRow();
                int salvarId = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha,0 ).toString());
            if (tblProduto.getSelectedRow() >= 0) {
                new ExibirProdutoView(salvarId).setVisible(true);
                this.dispose();
                
                
            } else {
                JOptionPane.showMessageDialog(this, "Selecione um produto!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há produtos cadastrados");
        }
    }//GEN-LAST:event_btnExibirActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        
        if(tblProduto.getRowCount()>0){
            
            
            
            int numeroLinha= tblProduto.getSelectedRow(); //Salva o numero da linha do TABLE
            int IDcliente = Integer.parseInt(tblProduto.getModel().getValueAt(numeroLinha, 0).toString()); // Resga o id
            
            if(ProdutoController.excluir(IDcliente)){
                this.LoadTable();
                JOptionPane.showMessageDialog(this,"Cliente Exluido com Sucesso");
                }else{
                JOptionPane.showMessageDialog(this,"Falha na Exclusão" );
            }
        }else{
            JOptionPane.showMessageDialog(this,"Não há clientes para exibir");
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(telaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ImnuSair;
    private javax.swing.JToggleButton btnDeletar;
    private javax.swing.JToggleButton btnExibir;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jCbFiltro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenuBar mnuBarra;
    private javax.swing.JMenu mnuExecutar;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
