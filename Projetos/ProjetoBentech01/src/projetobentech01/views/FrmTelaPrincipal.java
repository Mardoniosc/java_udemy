/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobentech01.views;

import java.awt.Color;

/**
 *
 * @author p772920
 */
public class FrmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmTelaPrincipal
     */
    public FrmTelaPrincipal() {
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

        jpnPrincipal = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        btnBucarCliente = new javax.swing.JButton();
        lblFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setUndecorated(true);

        jpnPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jpnPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        btnCadastro.setBackground(new java.awt.Color(102, 153, 255));
        btnCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastrar Cliente");
        btnCadastro.setBorder(null);
        btnCadastro.setFocusable(false);
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroMouseExited(evt);
            }
        });
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnBucarCliente.setBackground(new java.awt.Color(102, 153, 255));
        btnBucarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBucarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBucarCliente.setText("Buscar Cliente");
        btnBucarCliente.setBorder(null);
        btnBucarCliente.setFocusable(false);
        btnBucarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBucarClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBucarClienteMouseExited(evt);
            }
        });
        btnBucarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBucarClienteActionPerformed(evt);
            }
        });

        lblFechar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(255, 255, 255));
        lblFechar.setText("X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnPrincipalLayout = new javax.swing.GroupLayout(jpnPrincipal);
        jpnPrincipal.setLayout(jpnPrincipalLayout);
        jpnPrincipalLayout.setHorizontalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBucarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(653, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFechar)
                .addContainerGap())
        );
        jpnPrincipalLayout.setVerticalGroup(
            jpnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFechar)
                .addGap(23, 23, 23)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnBucarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        getContentPane().add(jpnPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // Abrir o FrmCadastroCliente
        FrmCadastroCliente fcc = new FrmCadastroCliente();
        fcc.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        btnCadastro.setBackground(Color.red);
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        btnCadastro.setBackground(new Color(102, 153, 255));
    }//GEN-LAST:event_btnCadastroMouseExited

    private void btnBucarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBucarClienteMouseEntered
        btnBucarCliente.setBackground(Color.red);
    }//GEN-LAST:event_btnBucarClienteMouseEntered

    private void btnBucarClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBucarClienteMouseExited
        btnBucarCliente.setBackground(new Color(102, 153, 255));
    }//GEN-LAST:event_btnBucarClienteMouseExited

    private void btnBucarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBucarClienteActionPerformed
        // Abrir o FrmMostrarCadastroCliente
        FrmMostrarCadastroCliente frmc = new FrmMostrarCadastroCliente();
        frmc.setVisible(true);
    }//GEN-LAST:event_btnBucarClienteActionPerformed

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        // Fechar a aplicação quando clicar o mouse
        System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked

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
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBucarCliente;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JPanel jpnPrincipal;
    private javax.swing.JLabel lblFechar;
    // End of variables declaration//GEN-END:variables
}
