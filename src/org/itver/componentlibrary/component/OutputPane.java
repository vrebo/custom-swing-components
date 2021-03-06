/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itver.componentlibrary.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author vrebo
 */
public class OutputPane extends javax.swing.JPanel {

    private String title;

    /**
     * Creates new form OutputPane
     *
     * @param title The title of the output pane to be shown.
     */
    public OutputPane(String title) {
        this.title = title;
        initComponents();
        _initComponents();
        initListeners();
    }

    public OutputPane() {
        this("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contextMenu = new javax.swing.JPopupMenu();
        clearMenuItem = new javax.swing.JMenuItem();
        wrapMenuItem = new javax.swing.JMenuItem();
        scrollPane = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        clearMenuItem.setText("jMenuItem1");

        wrapMenuItem.setText("jMenuItem2");

        setBorder(javax.swing.BorderFactory.createTitledBorder(title));
        setMinimumSize(new java.awt.Dimension(15, 20));
        setLayout(new java.awt.BorderLayout());

        outputArea.setBackground(Color.BLACK);
        outputArea.setColumns(20);
        outputArea.setForeground(Color.GREEN);
        outputArea.setRows(5);
        outputArea.setComponentPopupMenu(contextMenu);
        outputArea.setMinimumSize(new java.awt.Dimension(10, 15));
        scrollPane.setViewportView(outputArea);

        add(scrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clearMenuItem;
    private javax.swing.JPopupMenu contextMenu;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JMenuItem wrapMenuItem;
    // End of variables declaration//GEN-END:variables

    private void _initComponents() {
        wrapMenuItem = new JMenuItem("Comprimir texto");
        clearMenuItem = new JMenuItem("Limpiar");
        contextMenu.add(wrapMenuItem);
        contextMenu.add(clearMenuItem);
        outputArea.setEditable(false);
        outputArea.setRows(10);
        outputArea.setColumns(35);
    }

    private void initListeners() {
        ActionListener l = new ActionListenerImpl();
        wrapMenuItem.addActionListener(l);
        clearMenuItem.addActionListener(l);
    }

    public void clearOutput() {
        outputArea.setText("");
    }

    public void appendInfoMessage(String message) {
        outputArea.append(message);
    }

    private class ActionListenerImpl implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case "Comprimir texto":
                    break;
                case "Limpiar":
                    clearOutput();
                    break;
            }
        }

    }

    @Override
    public void setFont(Font f) {
        if (outputArea != null) {
            outputArea.setFont(f);
        }
    }

    @Override
    public void setForeground(Color fg) {
        if (outputArea != null) {
            outputArea.setForeground(fg);
        }
    }

    public void setBackGround(Color bg) {
        if (outputArea != null) {
            outputArea.setBackground(Color.DARK_GRAY);
        }
    }
}
