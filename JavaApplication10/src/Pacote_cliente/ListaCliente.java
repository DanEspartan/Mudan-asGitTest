/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote_cliente;

import Pacote_cliente.ModifcaClienteView;

/**
 *
 * @author juan
 */
public class ListaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ListaCliente
     */
    public ListaCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        PnlListaCliente = new javax.swing.JPanel();
        lblIDCliente = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        pnlClientes = new javax.swing.JScrollPane();
        tblClienteC = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnExibir = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mnuBarra = new javax.swing.JMenuBar();
        mnuExcutar = new javax.swing.JMenu();
        ImnuProd = new javax.swing.JMenuItem();
        ImnuVenda = new javax.swing.JMenuItem();
        ImnuRelatorio = new javax.swing.JMenuItem();
        ImnuSair = new javax.swing.JMenuItem();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        lblIDCliente.setText("ID Cliente:");

        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Procurar-18dp.png"))); // NOI18N

        pnlClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Cadastrados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        tblClienteC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Cliente", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pnlClientes.setViewportView(tblClienteC);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnExibir.setText("Exibir");

        btnDeletar.setText("Deletar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Camada 2.png"))); // NOI18N

        javax.swing.GroupLayout PnlListaClienteLayout = new javax.swing.GroupLayout(PnlListaCliente);
        PnlListaCliente.setLayout(PnlListaClienteLayout);
        PnlListaClienteLayout.setHorizontalGroup(
            PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlListaClienteLayout.createSequentialGroup()
                        .addGroup(PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PnlListaClienteLayout.createSequentialGroup()
                                .addComponent(lblIDCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlListaClienteLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlListaClienteLayout.setVerticalGroup(
            PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlListaClienteLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIDCliente)
                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcurar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(pnlClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PnlListaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        mnuBarra.setBackground(new java.awt.Color(204, 204, 204));

        mnuExcutar.setText("Executar");

        ImnuProd.setText("Produto");
        mnuExcutar.add(ImnuProd);

        ImnuVenda.setText("Venda");
        ImnuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnuVendaActionPerformed(evt);
            }
        });
        mnuExcutar.add(ImnuVenda);

        ImnuRelatorio.setText("Relatorio");
        mnuExcutar.add(ImnuRelatorio);

        ImnuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote_imagens/Exit-18dp.png"))); // NOI18N
        ImnuSair.setText("Sair");
        mnuExcutar.add(ImnuSair);

        mnuBarra.add(mnuExcutar);

        setJMenuBar(mnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlListaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlListaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImnuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnuVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImnuVendaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       ModifcaClienteView modifica = new ModifcaClienteView();
       modifica.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        CadClientView cria = new CadClientView();
        cria.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

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
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
          /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaCliente().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ImnuProd;
    private javax.swing.JMenuItem ImnuRelatorio;
    private javax.swing.JMenuItem ImnuSair;
    private javax.swing.JMenuItem ImnuVenda;
    private javax.swing.JPanel PnlListaCliente;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JMenuBar mnuBarra;
    private javax.swing.JMenu mnuExcutar;
    private javax.swing.JScrollPane pnlClientes;
    private javax.swing.JTable tblClienteC;
    private javax.swing.JTextField txtIDCliente;
    // End of variables declaration//GEN-END:variables
}
