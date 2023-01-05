/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jairo.gest.gui;


import com.jairo.gest.eliminadores.EliminadorCuenta;
import com.jairo.gest.usuarios.Cuenta;
import com.jairo.gest.usuarios.Folder;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jairo
 */
public class VentanaVerFolder extends javax.swing.JFrame {

    private Folder folder;
    private String usuario;
    private String contM;
    private int mouseX, mouseY;
    
    public VentanaVerFolder(String usuario, String contM, Folder folder) {
        setLookAndFeel();
        initComponents();
        this.usuario    = usuario;
        this.contM      = contM;
        this.folder     = folder;
        setTable();
        setUsrInfo();
        setFoldInfo();
        setCuentas();
        
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
        bar = new javax.swing.JPanel();
        exitB = new javax.swing.JPanel();
        exitLbl = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        cuentPanel = new javax.swing.JPanel();
        foldInfLbl = new javax.swing.JLabel();
        cuentasSP = new javax.swing.JScrollPane();
        cuentasTab = new javax.swing.JTable();
        usrInfo = new javax.swing.JPanel();
        usrInfoLbl = new javax.swing.JLabel();
        verCuenBtn = new javax.swing.JPanel();
        verCuenLbl = new javax.swing.JLabel();
        elimCuenBtn = new javax.swing.JPanel();
        elimCuenLbl = new javax.swing.JLabel();
        crearCuenBtn = new javax.swing.JPanel();
        crearCuenLbl = new javax.swing.JLabel();
        editCuenBtn = new javax.swing.JPanel();
        editCuenLbl = new javax.swing.JLabel();
        reloadPanel = new javax.swing.JPanel();
        reloadLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(203, 182, 184));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bg.setPreferredSize(new java.awt.Dimension(737, 467));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        bg2.setBackground(new java.awt.Color(31, 31, 31));

        cuentPanel.setBackground(new java.awt.Color(255, 255, 255));
        cuentPanel.setFocusable(false);
        cuentPanel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N

        foldInfLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        foldInfLbl.setText("Folder: Folder");

        cuentasTab.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cuentasTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cuentasTab.setFocusable(false);
        cuentasTab.setGridColor(new java.awt.Color(167, 167, 167));
        cuentasTab.setRowHeight(30);
        cuentasTab.setSelectionBackground(new java.awt.Color(147, 147, 147));
        cuentasTab.setSelectionForeground(new java.awt.Color(255, 255, 255));
        cuentasTab.setShowHorizontalLines(true);
        cuentasTab.getTableHeader().setReorderingAllowed(false);
        cuentasSP.setViewportView(cuentasTab);
        if (cuentasTab.getColumnModel().getColumnCount() > 0) {
            cuentasTab.getColumnModel().getColumn(0).setResizable(false);
            cuentasTab.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout cuentPanelLayout = new javax.swing.GroupLayout(cuentPanel);
        cuentPanel.setLayout(cuentPanelLayout);
        cuentPanelLayout.setHorizontalGroup(
            cuentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(cuentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cuentasSP, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foldInfLbl))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        cuentPanelLayout.setVerticalGroup(
            cuentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foldInfLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuentasSP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        usrInfo.setBackground(new java.awt.Color(255, 255, 255));

        usrInfoLbl.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        usrInfoLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usrInfoLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Documents\\NetBeansProjects\\GestorContrasenias\\src\\main\\java\\com\\jairo\\gest\\gui\\assets\\User.png")); // NOI18N
        usrInfoLbl.setText("Usuario");

        javax.swing.GroupLayout usrInfoLayout = new javax.swing.GroupLayout(usrInfo);
        usrInfo.setLayout(usrInfoLayout);
        usrInfoLayout.setHorizontalGroup(
            usrInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usrInfoLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(usrInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        usrInfoLayout.setVerticalGroup(
            usrInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usrInfoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        verCuenBtn.setBackground(new java.awt.Color(255, 255, 255));

        verCuenLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        verCuenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        verCuenLbl.setText("Ver Cuenta");
        verCuenLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCuenLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCuenLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout verCuenBtnLayout = new javax.swing.GroupLayout(verCuenBtn);
        verCuenBtn.setLayout(verCuenBtnLayout);
        verCuenBtnLayout.setHorizontalGroup(
            verCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verCuenLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        verCuenBtnLayout.setVerticalGroup(
            verCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verCuenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        elimCuenBtn.setBackground(new java.awt.Color(255, 255, 255));

        elimCuenLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        elimCuenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elimCuenLbl.setText("Eliminar Cuenta");
        elimCuenLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elimCuenLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                elimCuenLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout elimCuenBtnLayout = new javax.swing.GroupLayout(elimCuenBtn);
        elimCuenBtn.setLayout(elimCuenBtnLayout);
        elimCuenBtnLayout.setHorizontalGroup(
            elimCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elimCuenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        elimCuenBtnLayout.setVerticalGroup(
            elimCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(elimCuenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        crearCuenBtn.setBackground(new java.awt.Color(255, 255, 255));

        crearCuenLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        crearCuenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearCuenLbl.setText("Crear Cuenta");
        crearCuenLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuenLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCuenLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearCuenBtnLayout = new javax.swing.GroupLayout(crearCuenBtn);
        crearCuenBtn.setLayout(crearCuenBtnLayout);
        crearCuenBtnLayout.setHorizontalGroup(
            crearCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearCuenLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        crearCuenBtnLayout.setVerticalGroup(
            crearCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearCuenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        editCuenBtn.setBackground(new java.awt.Color(255, 255, 255));

        editCuenLbl.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        editCuenLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editCuenLbl.setText("Editar Cuenta");
        editCuenLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCuenLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCuenLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout editCuenBtnLayout = new javax.swing.GroupLayout(editCuenBtn);
        editCuenBtn.setLayout(editCuenBtnLayout);
        editCuenBtnLayout.setHorizontalGroup(
            editCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editCuenLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        editCuenBtnLayout.setVerticalGroup(
            editCuenBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editCuenLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cuentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usrInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(verCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crearCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(elimCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(usrInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editCuenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        reloadPanel.setBackground(new java.awt.Color(203, 182, 184));

        reloadLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jairo\\Documents\\NetBeansProjects\\GestorContrasenias\\src\\main\\java\\com\\jairo\\gest\\gui\\assets\\Reload.png")); // NOI18N
        reloadLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reloadLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout reloadPanelLayout = new javax.swing.GroupLayout(reloadPanel);
        reloadPanel.setLayout(reloadPanelLayout);
        reloadPanelLayout.setHorizontalGroup(
            reloadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reloadPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(reloadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        reloadPanelLayout.setVerticalGroup(
            reloadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reloadLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barLayout = new javax.swing.GroupLayout(bar);
        bar.setLayout(barLayout);
        barLayout.setHorizontalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reloadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(barLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        barLayout.setVerticalGroup(
            barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barLayout.createSequentialGroup()
                        .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(barLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reloadPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barMousePressed

    private void barMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX , y - mouseY );
    }//GEN-LAST:event_barMouseDragged

    private void exitLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitLblMouseClicked

    private void exitLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitLblMouseEntered

    private void exitBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitBMouseExited

    private void exitBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseEntered
        exitB.setBackground(new Color(210, 51, 105));
    }//GEN-LAST:event_exitBMouseEntered

    private void exitLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLblMouseExited
        exitB.setBackground(new Color(203, 182, 184));
    }//GEN-LAST:event_exitLblMouseExited

    private void verCuenLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCuenLblMouseClicked
        VentanaVerCuenta ventana;
        Cuenta c;
        int filaSelec;
        
        filaSelec = cuentasTab.getSelectedRow();
        
        if(filaSelec >= 0){
            c = folder.getCuentas().get(filaSelec);
            ventana = new VentanaVerCuenta(usuario, c);
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_verCuenLblMouseClicked

    private void elimCuenLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elimCuenLblMouseClicked
        EliminadorCuenta ec;
        Cuenta cuenta;
        int filaSelec;
        
        ec          = new EliminadorCuenta();
        filaSelec   = cuentasTab.getSelectedRow();
        
        if(filaSelec >= 0){
            cuenta = folder.getCuentas().get(filaSelec);
            ec.eliminarCuenta(cuenta);
            folder.getCuentas().remove(filaSelec);
            setCuentas();
        }
        
        
    }//GEN-LAST:event_elimCuenLblMouseClicked

    private void reloadLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadLblMouseClicked
        setCuentas();
    }//GEN-LAST:event_reloadLblMouseClicked

    private void crearCuenLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCuenLblMouseClicked
        VentanaCreaCuenta ventana;
        
        ventana = new VentanaCreaCuenta(usuario, contM, folder, this);
        ventana.setVisible(true);
    }//GEN-LAST:event_crearCuenLblMouseClicked

    private void editCuenLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCuenLblMouseClicked
        VentanaEdicionCuenta ventana;
        Cuenta cuenta;
        int filaSelec;
        
        filaSelec   = cuentasTab.getSelectedRow();
        
        if(filaSelec >= 0){
            cuenta = folder.getCuentas().get(filaSelec);
            ventana = new VentanaEdicionCuenta(usuario, contM, cuenta, this);
            ventana.setVisible(true);
        }
        
    }//GEN-LAST:event_editCuenLblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerFolder("Juanito","contM" ,new Folder(1, "Folder","Folder")).setVisible(true);
            }
        });
    }
    
    private void setTable(){
        cuentasTab.getTableHeader().setBackground(new Color(255,255,255));
        cuentasTab.getTableHeader().setForeground(Color.BLACK);
        cuentasTab.setRowHeight(30);
    }
    
    private void setUsrInfo(){
        usrInfoLbl.setText(usuario);
    }
    
    private void setFoldInfo(){
        foldInfLbl.setText("Folder: " + folder.getNomFolder());
    }
    
    
    public void setCuentas(){
        ArrayList<Cuenta> cuentas;
        DefaultTableModel modelo;
        Object[]          fila;
        
        cuentas = folder.getCuentas();
        modelo  = (DefaultTableModel) cuentasTab.getModel();
        
        modelo.setRowCount(0);
        
        for(Cuenta c : cuentas){
            fila    = new Object[2];
            fila[0] = c.getNomCuenta();
            fila[1] = c.getDescCuenta();
            modelo.addRow(fila);
            
        }
    }
    
    private void setLookAndFeel(){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaVerFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerFolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel crearCuenBtn;
    private javax.swing.JLabel crearCuenLbl;
    private javax.swing.JPanel cuentPanel;
    private javax.swing.JScrollPane cuentasSP;
    private javax.swing.JTable cuentasTab;
    private javax.swing.JPanel editCuenBtn;
    private javax.swing.JLabel editCuenLbl;
    private javax.swing.JPanel elimCuenBtn;
    private javax.swing.JLabel elimCuenLbl;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitLbl;
    private javax.swing.JLabel foldInfLbl;
    private javax.swing.JLabel reloadLbl;
    private javax.swing.JPanel reloadPanel;
    private javax.swing.JPanel usrInfo;
    private javax.swing.JLabel usrInfoLbl;
    private javax.swing.JPanel verCuenBtn;
    private javax.swing.JLabel verCuenLbl;
    // End of variables declaration//GEN-END:variables
}