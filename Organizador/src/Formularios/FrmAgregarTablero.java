package Formularios;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson
 */
public class FrmAgregarTablero extends javax.swing.JFrame {

    public FrmAgregarTablero() {
        initComponents();
        setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\Proyecto Organizador Al Fin\\Organizador\\src\\Imagenes\\24.jpg");
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        btnAgregarListado = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtNombreTa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FondoTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarListado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_norm.png"))); // NOI18N
        btnAgregarListado.setBorderPainted(false);
        btnAgregarListado.setContentAreaFilled(false);
        btnAgregarListado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarListado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_press.png"))); // NOI18N
        btnAgregarListado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_roll.png"))); // NOI18N
        btnAgregarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarListadoActionPerformed(evt);
            }
        });
        FondoPanel.add(btnAgregarListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 270, 110, 40));

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_norm.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_press.png"))); // NOI18N
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/vista_prev_roll.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        FondoPanel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 110, 40));
        FondoPanel.add(txtNombreTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 241, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 80, 20));

        FondoTitulo.setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("NUEVO TABLERO");

        javax.swing.GroupLayout FondoTituloLayout = new javax.swing.GroupLayout(FondoTitulo);
        FondoTitulo.setLayout(FondoTituloLayout);
        FondoTituloLayout.setHorizontalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoTituloLayout.setVerticalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoTituloLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addContainerGap())
        );

        FondoPanel.add(FondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24.jpg"))); // NOI18N
        FondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarListadoActionPerformed
       try{
           UUID uuid = UUID.randomUUID();
            String id = uuid.toString();
            String nombre = txtNombreTa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
            if (!nombre.isBlank() && !nombre.isEmpty() && nombre.length() > 0) {
               TableroTareas oTablero = new TableroTareas();
                oTablero.setIdentificacion(id);
                oTablero.setNombre(nombre);
                GestionOrganizadorTareas.agregarTableros(oTablero);  
                JOptionPane.showMessageDialog(null, "Agregado");
                txtNombreTa.setText("");
           }else{
                 JOptionPane.showMessageDialog(null, "El nombre del tablero no puede estar vacio");
                txtNombreTa.setText("");
           }
            
       }catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
       }
    }//GEN-LAST:event_btnAgregarListadoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Menu frm = new Menu();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel FondoTitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregarListado;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreTa;
    // End of variables declaration//GEN-END:variables
}
