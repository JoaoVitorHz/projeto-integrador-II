/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ViewsUser;

import DAO.UserDAO;
import Model.UserModel;
import Validation.UserValidation;
import javax.swing.JOptionPane;

/**
 *
 * @author ana.ksilva28
 */
public class ViewUpdateUser extends javax.swing.JFrame {

    /**
     * Creates new form ViewUpdateUser
     */
    public ViewUpdateUser() {
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

        jLabel5 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        btnUpdateClient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtLastNameClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmailClient = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpfClient = new javax.swing.JTextField();
        txtIdClient = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBackListClient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("CPF");

        btnUpdateClient.setBackground(new java.awt.Color(71, 71, 135));
        btnUpdateClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateClient.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateClient.setText("Alterar Cliente");
        btnUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClientActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sobrenome");

        txtEmailClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailClientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("E-Mail");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("ID Cliente");

        jPanel1.setBackground(new java.awt.Color(71, 71, 135));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alterar Cliente");

        btnBackListClient.setBackground(new java.awt.Color(71, 71, 135));
        btnBackListClient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackListClient.setForeground(new java.awt.Color(255, 255, 255));
        btnBackListClient.setText("Voltar");
        btnBackListClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackListClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
                .addComponent(btnBackListClient)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBackListClient))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateClient)
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtLastNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtCpfClient, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnUpdateClient)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackListClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackListClientActionPerformed
        // TODO add your handling code here:
        new ViewListUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackListClientActionPerformed

    private void txtEmailClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailClientActionPerformed

    private void btnUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClientActionPerformed
        // TODO add your handling code here:
        
        
        if(txtIdClient.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "O Id do produto não pode estar vazio!");
        }
        try {
            int id = Integer.parseInt(txtCpfClient.getText());
            
            UserModel userModel = new UserModel();
            userModel.setId(id);
            userModel.setFirst_name(txtClientName.getText());
            userModel.setLast_name( txtLastNameClient.getText());
            userModel.setEmail(txtEmailClient.getText());
            userModel.setCpf(txtCpfClient.getText());
            
            //Valida os valores
            UserValidation userValidation = new UserValidation();
            boolean firstNameIsValid = userValidation.ValidateFirstName(userModel);
            boolean lastNameIsValid = userValidation.ValidateLastName(userModel);
            boolean emailIsValid = userValidation.ValidateEmail(userModel);
            boolean cpfIsValid = userValidation.ValidateCPF(userModel);
            
            if(!firstNameIsValid && !lastNameIsValid && !emailIsValid && !cpfIsValid){
                //Chama o metodo para Alterar no banco 
                UserDAO objClientDAO = new UserDAO();
                objClientDAO.UpdateUser(userModel);
                    
                JOptionPane.showMessageDialog(this, "Usuario alterado com sucesso!");
                new ViewListUser().setVisible(true);
                dispose();
            }
            
        } catch (Exception e) {
            //Usuário não digitou inteiros. Trato o erro sem travar a aplicação
            JOptionPane.showMessageDialog(this, "Por favor insira apenas números no ID");
        }
    }//GEN-LAST:event_btnUpdateClientActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUpdateUser().setVisible(true);
            }
        });
    }
    
    public void CarregarDados(UserModel userModel){
        txtIdClient.setText(Integer.toString(userModel.getId()));
        txtClientName.setText(userModel.getFirst_name());
        txtLastNameClient.setText(userModel.getLast_name());
        txtEmailClient.setText(userModel.getEmail());
        txtCpfClient.setText(userModel.getCpf());
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackListClient;
    private javax.swing.JButton btnUpdateClient;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtCpfClient;
    private javax.swing.JTextField txtEmailClient;
    private javax.swing.JTextField txtIdClient;
    private javax.swing.JTextField txtLastNameClient;
    // End of variables declaration//GEN-END:variables
}
