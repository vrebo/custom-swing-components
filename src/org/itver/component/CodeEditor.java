/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itver.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;

/**
 *
 * @author vrebo
 */
public class CodeEditor extends javax.swing.JPanel {

    private long lines;
//    private long tabulations;

    /**
     * Creates new form CodeArea
     */
    public CodeEditor() {
        initComponents();
        _initComponents();
        initListeners();
        panel.setBorder(BorderFactory.createLineBorder(getBackground(), 5));
        lines = 1;
//        tabulations = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        numberLineArea = new javax.swing.JTextArea();
        codeArea = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        panel.setLayout(new java.awt.BorderLayout());

        numberLineArea.setEditable(false);
        numberLineArea.setColumns(3);
        numberLineArea.setRows(5);
        numberLineArea.setAutoscrolls(false);
        numberLineArea.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        panel.add(numberLineArea, java.awt.BorderLayout.LINE_START);

        codeArea.setColumns(20);
        codeArea.setRows(5);
        codeArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panel.add(codeArea, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(panel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea codeArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea numberLineArea;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void _initComponents() {
        numberLineArea.append(" 1\n");
        numberLineArea.setRows(10);
        numberLineArea.setColumns(3);
        codeArea.setRows(10);
        codeArea.setColumns(40);
        codeArea.setTabSize(4);
    }

    private void initListeners() {
        codeArea.addKeyListener(new KeyListenerImpl());
    }

    private class KeyListenerImpl extends KeyAdapter {

//        private int oldKeyCode;
        @Override
        public void keyReleased(KeyEvent evt) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_ENTER:
//                    if (oldKeyCode == KeyEvent.VK_BRACELEFT) {
//                        addBlockOfBraces();    
//                    }
                    break;
                case KeyEvent.VK_BRACELEFT:
//                    tabulations++;
                    break;
                case KeyEvent.VK_BRACERIGHT:
//                    tabulations--;
                    break;
                default:
                    updateNumberLineArea();
            }
//            oldKeyCode = evt.getKeyCode();
        }

        @Override
        public void keyPressed(KeyEvent evt) {
            switch (evt.getKeyCode()) {
                case KeyEvent.VK_ENTER:
                    addLine();
                    break;
                case KeyEvent.VK_BRACELEFT:
//                    tabulations++;
                    break;
                case KeyEvent.VK_BRACERIGHT:
//                    tabulations--;
                    break;
                default:
                    updateNumberLineArea();
            }
        }

        /*
         private void addBlockOfBraces() {
         for (int i = 0; i < tabulations; i++) {
         codeArea.insert("\t", codeArea.getCaretPosition());
         }
         codeArea.insert("\n", codeArea.getCaretPosition());
         for (int i = 0; i < tabulations - 1; i++) {
         codeArea.insert("\t", codeArea.getCaretPosition());
         }
         codeArea.insert("}", codeArea.getCaretPosition());
         codeArea.setCaretPosition(codeArea.getCaretPosition() - (int) tabulations - 1);
         }*/
        private void addLine() {
            lines++;
            numberLineArea.append(" " + lines + "\n");
        }
    }

    @Override
    public void addKeyListener(KeyListener l) {
        codeArea.addKeyListener(l);
    }

    @Override
    public void setFont(Font f) {
        if (numberLineArea != null) {
            numberLineArea.setFont(f);
        }
        if (codeArea != null) {
            codeArea.setFont(f);
        }
    }

    @Override
    public void setForeground(Color fg) {
        if (numberLineArea != null) {
            numberLineArea.setForeground(fg);
        }
        if (codeArea != null) {
            codeArea.setForeground(fg);
        }
    }

    public void setBackGround(Color bg) {
        if (numberLineArea != null) {
            numberLineArea.setBackground(Color.DARK_GRAY);
        }
        if (codeArea != null) {
            codeArea.setBackground(bg);
        }
    }

    public void setCaretColor(Color c) {
        if (numberLineArea != null) {
            numberLineArea.setCaretColor(c);
        }
        if (codeArea != null) {
            codeArea.setCaretColor(c);
        }
    }

    public String getCode() {
        return codeArea.getText();
    }

    public void setCode(String code) {
        codeArea.setText(code);
        updateNumberLineArea();
    }

    public void clearCode() {
        codeArea.setText("");
        updateNumberLineArea();
    }

    private void updateNumberLineArea() {
        long oldLines = lines;
        lines = codeArea.getLineCount();
        if (oldLines != lines) {
            new Thread(() -> {
                StringBuilder sb = new StringBuilder(" 1\n");
                for (int i = 2; i <= lines; i++) {
                    sb.append(" ").append(i).append("\n");
                }
                numberLineArea.setText(sb.toString());
            }).start();
        }
    }
}
