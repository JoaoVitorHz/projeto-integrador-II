/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.p.i;

import DAO.ProductDAO;
import DAO.SaleDAO;
import Model.ProductModel;
import Model.UserModel;
import Validation.UserValidation;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ana Karolyne da Silva
 * @author Danilo dos Santos Barbosa Martins
 * @author Jailson Jorge da Silva
 * @author João Vitor Araujo de Matos
 * @author Leonardo Feitosa da Silva
 * @author Luana Figueiredo de Andrade Caboz
 * @author Thomaz Gabriel Azevedo Oliveira  
 */
public class ViewSale extends javax.swing.JFrame {

    /**
     * Creates new form ViewSale
     */
    public ViewSale() {
        initComponents();
        ListarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBackListUser = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        txtCpfClient = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        btnAddUser = new javax.swing.JButton();
        btnBuy2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 71, 135));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Vendas");

        btnBackListUser.setBackground(new java.awt.Color(71, 71, 135));
        btnBackListUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackListUser.setForeground(new java.awt.Color(255, 255, 255));
        btnBackListUser.setText("Sair");
        btnBackListUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackListUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackListUser)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBackListUser))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome Produto", "Descrição Produto", "Preço", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(productTable);

        txtCpfClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfClientActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("CPF Cliente ");

        btnAddUser.setBackground(new java.awt.Color(0, 204, 0));
        btnAddUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Adicionar Usuario");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnBuy2.setBackground(new java.awt.Color(71, 71, 135));
        btnBuy2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuy2.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy2.setText("Finalizar Compra");
        btnBuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuy2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuy2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(btnAddUser))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuy2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackListUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackListUserActionPerformed
        // TODO add your handling code here:
        new ViewMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackListUserActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        new ViewsUser.ViewAddUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void txtCpfClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfClientActionPerformed

    private void btnBuy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuy2ActionPerformed
        // TODO add your handling code here:
        int setar = productTable.getSelectedRow();
        
        ProductModel productModel = new ProductModel();
        productModel.setId(Integer.parseInt(productTable.getModel().getValueAt(setar, 0).toString()));
        productModel.setNome(productTable.getModel().getValueAt(setar, 1).toString());
        productModel.setPreco(Float.parseFloat(productTable.getModel().getValueAt(setar, 2).toString()));
        productModel.setQtd(Integer.parseInt(productTable.getModel().getValueAt(setar, 3).toString()));
        
        UserModel userModel = new UserModel();
        userModel.setCpf(txtCpfClient.getText());
        
        UserValidation userValidation = new UserValidation();
        boolean cpfIsValid = userValidation.ValidateCPF(userModel);
        
        if(!cpfIsValid){
            SaleDAO sale = new SaleDAO();
            sale.CreateSale(userModel, productModel);
            JOptionPane.showMessageDialog(null, "Venda feita com sucesso!");
        }
    }//GEN-LAST:event_btnBuy2ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewSale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSale().setVisible(true);
            }
        });
    }

    
     public void ListarDados(){
         try {
            ProductDAO productDAO = new ProductDAO();
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.setNumRows(0);
            
            ArrayList<ProductModel> array = productDAO.ReadProduct();
            
            for(int num = 0; num < array.size(); num ++){
                model.addRow(new Object[]{
                    array.get(num).getId(),
                    array.get(num).getNome(),
                    array.get(num).getPreco(),
                    array.get(num).getQtd(),
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnBackListUser;
    private javax.swing.JButton btnBuy2;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtCpfClient;
    // End of variables declaration//GEN-END:variables
}
