
package Formularios;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson
 */
public class FrmModificarListaActividades extends javax.swing.JFrame {

  
    public FrmModificarListaActividades() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\Proyecto Organizador Al Fin\\Organizador\\src\\Imagenes\\24.jpg");
        
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtNombreLiAc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_norm.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_press.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_roll.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 106, 40));
        FondoPanel.add(txtNombreLiAc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 244, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_norm.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_press.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_roll.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 110, 40));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NUEVO NOMBRE");
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 120, -1));

        FondoTitulo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MODIFICAR LISTA ACTIVIDADES");

        javax.swing.GroupLayout FondoTituloLayout = new javax.swing.GroupLayout(FondoTitulo);
        FondoTitulo.setLayout(FondoTituloLayout);
        FondoTituloLayout.setHorizontalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
        );
        FondoTituloLayout.setVerticalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        FondoPanel.add(FondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24.jpg"))); // NOI18N
        FondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmListadoActividades frm = new FrmListadoActividades();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try{           
            String nombre = txtNombreLiAc.getText().trim();
            if (!nombre.isBlank() && !nombre.isEmpty() && nombre.length() > 0) {
                String id = EstadoGlobal.TransferenciaListadoActividades.getIdLista();
                EstadoGlobal.TransferenciaTarea.modificarListas(id, nombre);
                JOptionPane.showMessageDialog(null, "Lista Actividades Modificada Con Exito");
                txtNombreLiAc.setText("");
           }else{
                 JOptionPane.showMessageDialog(null, "No Puedes Dejar El Nombre Vacio");
                txtNombreLiAc.setText("");
           }
            
       }catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
       }        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModificarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModificarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModificarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModificarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModificarListaActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel FondoTitulo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtNombreLiAc;
    // End of variables declaration//GEN-END:variables
}