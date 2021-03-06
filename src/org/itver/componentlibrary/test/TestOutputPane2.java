/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itver.componentlibrary.test;

import org.itver.componentlibrary.bo.LogDebugMessage;
import org.itver.componentlibrary.bo.LogErrorMessage;
import org.itver.componentlibrary.bo.LogInfoMessage;
import org.itver.componentlibrary.bo.LogMessage;
import org.itver.componentlibrary.bo.LogWarningMessage;

/**
 *
 * @author vrebo
 */
public class TestOutputPane2 extends javax.swing.JFrame {

    /**
     * Creates new form TestOutputPane2
     */
    public TestOutputPane2() {
        initComponents();
        
        LogMessage [] logMessages = {
            new LogMessage("Mensaje REGULAR"),
            new LogInfoMessage("Mensaje de INFORMACIÓN"),
            new LogDebugMessage("Mensaje de DEBUGGEO"),
            new LogWarningMessage("Mensaje de ADVERTENCIA"),
            new LogErrorMessage("Mensaje de ERROR"),
        };
        
        for (LogMessage logMessage : logMessages) {
            outputPane21.appendMessage(logMessage);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputPane21 = new org.itver.componentlibrary.component.OutputPane2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(outputPane21, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TestOutputPane2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestOutputPane2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestOutputPane2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestOutputPane2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestOutputPane2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.itver.componentlibrary.component.OutputPane2 outputPane21;
    // End of variables declaration//GEN-END:variables
}
