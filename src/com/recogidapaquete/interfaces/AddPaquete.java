
package com.recogidapaquete.interfaces;

import com.recogidapaquete.BD.ConexionMySQL;
import com.recogidapaquete.base.*;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author El cibernetico
 */

public class AddPaquete extends javax.swing.JFrame {

    private int xMove;
    private int yMove;
    private String validadFecha = "";
    ConexionMySQL conexionMySQL;
    
    public AddPaquete() {
        initComponents();
        this.setLocationRelativeTo(null);
        conexionMySQL = ConexionMySQL.getInstance();
        
        //Icoco Ventana
        this.setIconImage(new ImageIcon(getClass().getResource("/com/recogidapaquete/images/LOGO.png")).getImage());

    }

    public int parametros(){

        int validate = 0;
        
        if(tfDescripcion.getText().isEmpty()){
            validate = 1;
        }else if(tfUbicacion.getText().isEmpty()){
            validate = 1;
        }else if(tfFecha.getText().isEmpty()){
            validate = 1;
        }else if(tfTipoPaquete.getText().isEmpty()){
            validate = 1;
        }else if(!rbtnDisponile.isSelected()){
            validate = 1;
        }else if(tfUsuarioCliente.getText().isEmpty()){
            validate = 1;
        }
        return validate;
    }
    
    public String validarFecha(){
       String signoValidar = "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[/\\\\/](19|20)\\d{2}$";
       Pattern pattern = Pattern.compile(signoValidar);
       Matcher encaja = pattern.matcher(tfFecha.getText());
       
       if(tfFecha.getText()!= signoValidar){
           if(!encaja.find()){
               JOptionPane.showMessageDialog(null,"La fecha no es válida. Debe ser en formato: DD/MM/YYYY", "ERROR", JOptionPane.ERROR_MESSAGE);
           }else{
               validadFecha = tfFecha.getText();
           }
       }
       return validadFecha; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblBarra = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jpRegresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblRepaq1 = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        tfUbicacion = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        tfFecha = new javax.swing.JTextField();
        lblTipoPaquete = new javax.swing.JLabel();
        tfTipoPaquete = new javax.swing.JTextField();
        jpEstado = new javax.swing.JPanel();
        rbtnDisponile = new javax.swing.JRadioButton();
        lblEstado = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        lblUbicaciolbl = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        tfUsuarioCliente = new javax.swing.JTextField();
        jpAddCliente = new javax.swing.JPanel();
        lbAddPaquete = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/repaq.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 520));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 118, 255));
        jPanel1.setForeground(new java.awt.Color(0, 118, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/iconClose_normal.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblCloseMouseMoved(evt);
            }
        });
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/minimize_normal.png"))); // NOI18N
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseMoved(evt);
            }
        });
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        jPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        lblBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBarraMouseDragged(evt);
            }
        });
        lblBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBarraMousePressed(evt);
            }
        });
        jPanel1.add(lblBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 740, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 560, 30));

        jPanel2.setBackground(new java.awt.Color(0, 110, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 104, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/package.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 30, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/repaq1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jLabel4.setFont(new java.awt.Font("Open Sans Extrabold", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RePAQ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 70, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));

        jPanel3.setBackground(new java.awt.Color(109, 157, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpRegresar.setBackground(new java.awt.Color(0, 80, 255));
        jpRegresar.setForeground(new java.awt.Color(0, 80, 255));
        jpRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpRegresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpRegresarMouseMoved(evt);
            }
        });
        jpRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpRegresarMouseExited(evt);
            }
        });
        jpRegresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/back.png"))); // NOI18N
        lblRegresar.setText("Regresar");
        lblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegresar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRegresarMouseMoved(evt);
            }
        });
        lblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegresarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegresarMouseExited(evt);
            }
        });
        jpRegresar.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        jPanel3.add(jpRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 200, -1));

        jPanel4.setBackground(new java.awt.Color(109, 151, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 136, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRepaq1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 24)); // NOI18N
        lblRepaq1.setForeground(new java.awt.Color(255, 255, 255));
        lblRepaq1.setText("Formulario para crear Paquetes");
        jPanel4.add(lblRepaq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 30));

        lblDescripcion.setFont(new java.awt.Font("Open Sans Extrabold", 1, 16)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        jPanel4.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));
        jPanel4.add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, -1));
        jPanel4.add(tfUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 230, -1));

        lblID.setFont(new java.awt.Font("Open Sans Extrabold", 1, 16)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("Usuario Cliente:");
        jPanel4.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 170, 30));
        jPanel4.add(tfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 230, -1));

        lblTipoPaquete.setFont(new java.awt.Font("Open Sans Extrabold", 1, 16)); // NOI18N
        lblTipoPaquete.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoPaquete.setText("Tipo de Paquete:");
        jPanel4.add(lblTipoPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 150, 30));
        jPanel4.add(tfTipoPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 230, -1));

        jpEstado.setBackground(new java.awt.Color(109, 151, 255));
        jpEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 130, 255)));
        jpEstado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtnDisponile.setText("Disponible");
        jpEstado.add(rbtnDisponile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblEstado.setFont(new java.awt.Font("Open Sans Extrabold", 1, 17)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado:");
        jpEstado.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 150, 20));

        jPanel4.add(jpEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 200, 130));

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/paquetes.png"))); // NOI18N
        jPanel4.add(lblIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 70, 70));

        lblUbicaciolbl.setFont(new java.awt.Font("Open Sans Extrabold", 1, 16)); // NOI18N
        lblUbicaciolbl.setForeground(new java.awt.Color(255, 255, 255));
        lblUbicaciolbl.setText("Ubicación:");
        jPanel4.add(lblUbicaciolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 150, 30));

        lblFecha1.setFont(new java.awt.Font("Open Sans Extrabold", 1, 16)); // NOI18N
        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setText("Fecha:");
        jPanel4.add(lblFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 170, 30));
        jPanel4.add(tfUsuarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 780, 390));

        jpAddCliente.setBackground(new java.awt.Color(0, 80, 255));
        jpAddCliente.setForeground(new java.awt.Color(0, 80, 255));
        jpAddCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAddCliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jpAddClienteMouseMoved(evt);
            }
        });
        jpAddCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpAddClienteMouseExited(evt);
            }
        });
        jpAddCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAddPaquete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbAddPaquete.setForeground(new java.awt.Color(255, 255, 255));
        lbAddPaquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/recogidapaquete/images/save.png"))); // NOI18N
        lbAddPaquete.setText("Agregar");
        lbAddPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAddPaquete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lbAddPaqueteMouseMoved(evt);
            }
        });
        lbAddPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAddPaqueteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAddPaqueteMouseExited(evt);
            }
        });
        jpAddCliente.add(lbAddPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 170, 40));

        jPanel3.add(jpAddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 200, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblCloseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseMoved
        lblClose.setIcon(new ImageIcon(getClass().getResource("/com/recogidapaquete/images/iconClose_Animacion.png")));
    }//GEN-LAST:event_lblCloseMouseMoved
    
    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        lblClose.setIcon(new ImageIcon(getClass().getResource("/com/recogidapaquete/images/iconClose_normal.png")));
    }//GEN-LAST:event_lblCloseMouseExited
    
    private void lblMinimizeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseMoved
        lblMinimize.setIcon(new ImageIcon(getClass().getResource("/com/recogidapaquete/images/minimizea_animacion.png")));
    }//GEN-LAST:event_lblMinimizeMouseMoved
    
    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        lblMinimize.setIcon(new ImageIcon(getClass().getResource("/com/recogidapaquete/images/minimize_normal.png")));
    }//GEN-LAST:event_lblMinimizeMouseExited
                                    
    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked
                                    
    private void lblRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseMoved
        jpRegresar.setBackground(new Color(0,0,255));
        jpRegresar.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_lblRegresarMouseMoved
    
    private void lblRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseExited
        jpRegresar.setBackground(new Color(0,80,255));
        jpRegresar.setForeground(new Color(0,80,255));
    }//GEN-LAST:event_lblRegresarMouseExited
    
    private void jpRegresarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegresarMouseMoved
        jpRegresar.setBackground(new Color(0,0,255));
        jpRegresar.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_jpRegresarMouseMoved
    
    private void jpRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpRegresarMouseExited
        jpRegresar.setBackground(new Color(0,80,255));
        jpRegresar.setForeground(new Color(0,80,255));
    }//GEN-LAST:event_jpRegresarMouseExited

    private void lbAddPaqueteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddPaqueteMouseMoved
        jpAddCliente.setBackground(new Color(0,0,255));
        jpAddCliente.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_lbAddPaqueteMouseMoved

    private void lbAddPaqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddPaqueteMouseExited
        jpAddCliente.setBackground(new Color(0,80,255));
        jpAddCliente.setForeground(new Color(0,80,255));
    }//GEN-LAST:event_lbAddPaqueteMouseExited

    private void jpAddClienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAddClienteMouseMoved
        jpAddCliente.setBackground(new Color(0,0,255));
        jpAddCliente.setForeground(new Color(0,0,255));
    }//GEN-LAST:event_jpAddClienteMouseMoved

    private void jpAddClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAddClienteMouseExited
        jpAddCliente.setBackground(new Color(0,80,255));
        jpAddCliente.setForeground(new Color(0,80,255));
    }//GEN-LAST:event_jpAddClienteMouseExited

    private void lblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegresarMouseClicked
        this.setVisible(false);
        AdministradorGrafica administrador = new AdministradorGrafica();
        administrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegresarMouseClicked

    private void lblBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMove, y - yMove);
    }//GEN-LAST:event_lblBarraMouseDragged

    private void lblBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBarraMousePressed
        xMove = evt.getX();
        yMove = evt.getY();
    }//GEN-LAST:event_lblBarraMousePressed

    private void lbAddPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAddPaqueteMouseClicked
        Paquete paquete = new Paquete();
        Disponible disponible = new Disponible();
        
        if (parametros() == 1) {
             JOptionPane.showMessageDialog(null, "No puede dejar ningún campo vacio.", "ERROR", JOptionPane.ERROR_MESSAGE);
        
        } else{
            if (validadFecha != null) {
                paquete.setFecha(validarFecha());
            }
            if (rbtnDisponile.isSelected() == true){
                paquete.setEstado(disponible);
                paquete.ejecutarAccion();
            }
            
            paquete.setDescripcion(tfDescripcion.getText());
            paquete.setTipoPaquete(tfTipoPaquete.getText());
            paquete.setUbicacion(tfUbicacion.getText());

            conexionMySQL.agregarPaquete(paquete, tfUsuarioCliente.getText());
        }
    }//GEN-LAST:event_lbAddPaqueteMouseClicked
                    
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
            java.util.logging.Logger.getLogger(AddPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPaquete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpAddCliente;
    private javax.swing.JPanel jpEstado;
    private javax.swing.JPanel jpRegresar;
    private javax.swing.JLabel lbAddPaquete;
    private javax.swing.JLabel lblBarra;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel lblRepaq1;
    private javax.swing.JLabel lblTipoPaquete;
    private javax.swing.JLabel lblUbicaciolbl;
    private javax.swing.JRadioButton rbtnDisponile;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfTipoPaquete;
    private javax.swing.JTextField tfUbicacion;
    private javax.swing.JTextField tfUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}
