/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.c_v_passagens;

/**
 *
 * @author Kenny
 */
public class frmMenuSelecaoVendaCadastros extends javax.swing.JFrame {
    
    frmMenuVendasCadastradas enviarInf;
    /**
     * Creates new form frmMenuSelecaoVendaCadastros
     */
    public frmMenuSelecaoVendaCadastros() {
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

        jButton_Venda = new javax.swing.JButton();
        jButton_Cadastros = new javax.swing.JButton();
        jTextField_Cliente = new javax.swing.JTextField();
        jTextField_Empresa = new javax.swing.JTextField();
        jTextField_Tarifa = new javax.swing.JTextField();
        jTextField_Rota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Venda.setText("VENDA");
        jButton_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VendaActionPerformed(evt);
            }
        });

        jButton_Cadastros.setText("CADASTROS");
        jButton_Cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CadastrosActionPerformed(evt);
            }
        });

        jTextField_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ClienteActionPerformed(evt);
            }
        });
        jTextField_Cliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField_ClientePropertyChange(evt);
            }
        });

        jTextField_Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmpresaActionPerformed(evt);
            }
        });
        jTextField_Empresa.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField_EmpresaPropertyChange(evt);
            }
        });

        jTextField_Tarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TarifaActionPerformed(evt);
            }
        });
        jTextField_Tarifa.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField_TarifaPropertyChange(evt);
            }
        });

        jTextField_Rota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_RotaActionPerformed(evt);
            }
        });
        jTextField_Rota.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField_RotaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Venda)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Cadastros)
                        .addGap(155, 155, 155))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jButton_Venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Cadastros)
                .addGap(18, 18, 18)
                .addComponent(jTextField_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Rota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VendaActionPerformed
        // TODO add your handling code here:
        frmMenuInfViagem infViagem = new frmMenuInfViagem();
        infViagem.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_VendaActionPerformed

    private void jButton_CadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CadastrosActionPerformed
        // TODO add your handling code here:
        frmMenuVendasCadastradas vendasCadastradas = new frmMenuVendasCadastradas();
        enviarInf = new frmMenuVendasCadastradas();
        enviarInf.receberCliente(jTextField_Cliente.getText());
        enviarInf.receberEmpresa(jTextField_Empresa.getText());
        enviarInf.receberRota(jTextField_Rota.getText());
        enviarInf.receberTarifa(jTextField_Cliente.getText());
        enviarInf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_CadastrosActionPerformed

    private void jTextField_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ClienteActionPerformed
        // TODO add your handling code here:
        //jTextField_Cliente.setVisible(false);
    }//GEN-LAST:event_jTextField_ClienteActionPerformed

    private void jTextField_EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmpresaActionPerformed
        // TODO add your handling code here:
        //jTextField_Empresa.setVisible(false);
    }//GEN-LAST:event_jTextField_EmpresaActionPerformed

    private void jTextField_RotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_RotaActionPerformed
        // TODO add your handling code here:
        //jTextField_Rota.setVisible(false);
    }//GEN-LAST:event_jTextField_RotaActionPerformed

    private void jTextField_TarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TarifaActionPerformed
        // TODO add your handling code here:
        //jTextField_Tarifa.setVisible(false);
    }//GEN-LAST:event_jTextField_TarifaActionPerformed

    private void jTextField_ClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField_ClientePropertyChange
        // TODO add your handling code here:
        jTextField_Cliente.setVisible(false);
    }//GEN-LAST:event_jTextField_ClientePropertyChange

    private void jTextField_EmpresaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField_EmpresaPropertyChange
        // TODO add your handling code here:
        jTextField_Empresa.setVisible(false);
    }//GEN-LAST:event_jTextField_EmpresaPropertyChange

    private void jTextField_RotaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField_RotaPropertyChange
        // TODO add your handling code here:
        jTextField_Rota.setVisible(false);
    }//GEN-LAST:event_jTextField_RotaPropertyChange

    private void jTextField_TarifaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField_TarifaPropertyChange
        // TODO add your handling code here:
        jTextField_Tarifa.setVisible(false);
    }//GEN-LAST:event_jTextField_TarifaPropertyChange

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
            java.util.logging.Logger.getLogger(frmMenuSelecaoVendaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuSelecaoVendaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuSelecaoVendaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuSelecaoVendaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuSelecaoVendaCadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastros;
    private javax.swing.JButton jButton_Venda;
    private javax.swing.JTextField jTextField_Cliente;
    private javax.swing.JTextField jTextField_Empresa;
    private javax.swing.JTextField jTextField_Rota;
    private javax.swing.JTextField jTextField_Tarifa;
    // End of variables declaration//GEN-END:variables
    public void receberCliente(String cliente){
        jTextField_Cliente.setText(cliente);
    }
    
    public void receberEmpresa(String empresa){
        jTextField_Empresa.setText(empresa);
    }
    
    public void receberRota(String rota){
        jTextField_Rota.setText(rota);
        
    }
    
    public void receberTarifa(String tarifa){
        jTextField_Tarifa.setText(tarifa);
    }
}
