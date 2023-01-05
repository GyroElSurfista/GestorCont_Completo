/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jairo.gest.gui;

import com.jairo.gest.genCont.CreadorGenCont;
import com.jairo.gest.genCont.GenContrasenias;
import java.awt.Color;
import javax.swing.JPasswordField;



/**
 *
 * @author Jairo
 */
public class VentanaGenCont extends javax.swing.JFrame {

    private JPasswordField cont;
    private GenContrasenias genCont;
    private int mouseX, mouseY;
    
    public VentanaGenCont(JPasswordField cont) {
        initComponents();
        this.cont = cont;
        msjLbl.setVisible(false);
        setGenCont();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg2 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        tamTxtBox = new javax.swing.JTextField();
        contLbl = new javax.swing.JLabel();
        tamLbl = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        genBtn = new javax.swing.JPanel();
        genLbl = new javax.swing.JLabel();
        aceptBtn = new javax.swing.JPanel();
        aceptLbl = new javax.swing.JLabel();
        contTxtBox = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        msjLbl = new javax.swing.JLabel();
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(203, 182, 184));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

        bg2.setBackground(new java.awt.Color(31, 31, 31));
        bg2.setPreferredSize(new java.awt.Dimension(511, 353));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        tamTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tamTxtBox.setForeground(new java.awt.Color(204, 204, 204));
        tamTxtBox.setText("Tamaño");
        tamTxtBox.setBorder(null);
        tamTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tamTxtBoxFocusGained(evt);
            }
        });
        tamTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamTxtBoxActionPerformed(evt);
            }
        });
        tamTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamTxtBoxKeyTyped(evt);
            }
        });

        contLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        contLbl.setText("Contraseña");

        tamLbl.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        tamLbl.setText("Tamaño");

        separator1.setForeground(new java.awt.Color(0, 0, 0));

        separator2.setForeground(new java.awt.Color(0, 0, 0));

        genBtn.setBackground(new java.awt.Color(255, 255, 255));
        genBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        genBtn.setName(""); // NOI18N
        genBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                genBtnMouseEntered(evt);
            }
        });

        genLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        genLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genLbl.setText("Generar Contraseña");
        genLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        genLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout genBtnLayout = new javax.swing.GroupLayout(genBtn);
        genBtn.setLayout(genBtnLayout);
        genBtnLayout.setHorizontalGroup(
            genBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        genBtnLayout.setVerticalGroup(
            genBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        aceptBtn.setBackground(new java.awt.Color(255, 255, 255));
        aceptBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aceptLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        aceptLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aceptLbl.setText("Aceptar");
        aceptLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout aceptBtnLayout = new javax.swing.GroupLayout(aceptBtn);
        aceptBtn.setLayout(aceptBtnLayout);
        aceptBtnLayout.setHorizontalGroup(
            aceptBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
        );
        aceptBtnLayout.setVerticalGroup(
            aceptBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aceptLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        contTxtBox.setEditable(false);
        contTxtBox.setBackground(new java.awt.Color(255, 255, 255));
        contTxtBox.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        contTxtBox.setText("Contraseña");
        contTxtBox.setBorder(null);
        contTxtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contTxtBoxFocusGained(evt);
            }
        });
        contTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contTxtBoxActionPerformed(evt);
            }
        });
        contTxtBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contTxtBoxKeyTyped(evt);
            }
        });

        title.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Generador de contraseñas");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separator1)
                    .addComponent(contTxtBox)
                    .addComponent(tamLbl)
                    .addComponent(contLbl)
                    .addComponent(tamTxtBox)
                    .addComponent(separator2)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(genBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(aceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tamLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tamTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        msjLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        msjLbl.setForeground(new java.awt.Color(255, 255, 255));
        msjLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msjLbl.setText("Mensaje");

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addComponent(msjLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msjLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        bar.setBackground(new java.awt.Color(203, 182, 184));
        bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barMouseDragged(evt);
            }
        });
        bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barMousePressed(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(203, 182, 184));
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBMouseExited(evt);
            }
        });

        exitLbl.setBackground(new java.awt.Color(203, 182, 184));
        exitLbl.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        exitLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLbl.setText("X");
        exitLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLblMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genBtnMouseEntered

    }//GEN-LAST:event_genBtnMouseEntered

    private void tamTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamTxtBoxKeyTyped
        
    }//GEN-LAST:event_tamTxtBoxKeyTyped

    private void tamTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamTxtBoxActionPerformed

    private void tamTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tamTxtBoxFocusGained
        tamTxtBox.setForeground(Color.black);
        msjLbl.setVisible(false);
        if(tamTxtBox.getText().equals("Tamaño")){
            tamTxtBox.setText("");
        }  
    }//GEN-LAST:event_tamTxtBoxFocusGained

    private void contTxtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contTxtBoxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_contTxtBoxFocusGained

    private void contTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contTxtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contTxtBoxActionPerformed

    private void contTxtBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contTxtBoxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_contTxtBoxKeyTyped

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void genLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genLblMouseClicked
        msjLbl.setVisible(false);
        if(!tamTxtBox.getText().equals("Tamaño")){
            if((Integer.parseInt(tamTxtBox.getText())) >= 8 && (Integer.parseInt(tamTxtBox.getText()) <= 128) ){
                cont.setText(genCont.genCont(Integer.parseInt(tamTxtBox.getText())));
                contTxtBox.setText(String.valueOf(cont.getPassword()));
            }else{
                msjLbl.setText("El tamaño debe ser mayor o igual a 8 o menor o igual a 128");
                msjLbl.setVisible(true);
            }
        }else{
                msjLbl.setText("Introducir un tamaño");
                msjLbl.setVisible(true);
        }
    }//GEN-LAST:event_genLblMouseClicked

    private void aceptLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_aceptLblMouseClicked

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitLblMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void setGenCont(){
        CreadorGenCont creadorGC;
        
        creadorGC = new CreadorGenCont();
        
        creadorGC.addConj("(97,122)");
        creadorGC.addConj("(65,90)");
        creadorGC.addConj("(48,57)");
        creadorGC.addConj("(33,47)u(58,64)u(94,96)");
        
        genCont = creadorGC.crear();
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aceptBtn;
    private javax.swing.JLabel aceptLbl;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel contLbl;
    private javax.swing.JTextField contTxtBox;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JPanel genBtn;
    private javax.swing.JLabel genLbl;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel msjLbl;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JLabel tamLbl;
    private javax.swing.JTextField tamTxtBox;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}