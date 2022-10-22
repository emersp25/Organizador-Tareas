
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Emerson
 */
public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\Proyecto Organizador Al Fin\\Organizador\\src\\Imagenes\\23.jpg");        
     
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        FondoMenu1 = new javax.swing.JPanel();
        nameMenu1 = new javax.swing.JLabel();
        fondoOpciones = new javax.swing.JPanel();
        txtnuevoTablero = new javax.swing.JLabel();
        listaTablero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bntLista = new javax.swing.JButton();
        bntLista1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoMenu1.setBackground(new java.awt.Color(0, 0, 0));

        nameMenu1.setFont(new java.awt.Font("Roboto Thin", 0, 48)); // NOI18N
        nameMenu1.setForeground(new java.awt.Color(255, 255, 255));
        nameMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameMenu1.setText("MENU");

        javax.swing.GroupLayout FondoMenu1Layout = new javax.swing.GroupLayout(FondoMenu1);
        FondoMenu1.setLayout(FondoMenu1Layout);
        FondoMenu1Layout.setHorizontalGroup(
            FondoMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoMenu1Layout.createSequentialGroup()
                .addComponent(nameMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        FondoMenu1Layout.setVerticalGroup(
            FondoMenu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoMenu1Layout.createSequentialGroup()
                .addComponent(nameMenu1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        FondoPanel.add(FondoMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 60));

        fondoOpciones.setBackground(new java.awt.Color(255, 255, 102));
        fondoOpciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtnuevoTablero.setBackground(new java.awt.Color(0, 0, 0));
        txtnuevoTablero.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtnuevoTablero.setForeground(new java.awt.Color(0, 0, 0));
        txtnuevoTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnuevoTablero.setText("NUEVO TABLERO");

        listaTablero.setBackground(new java.awt.Color(0, 0, 0));
        listaTablero.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        listaTablero.setForeground(new java.awt.Color(0, 0, 0));
        listaTablero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listaTablero.setText("LISTA DE TABLEROS");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        bntLista.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bntLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_norm.png"))); // NOI18N
        bntLista.setBorder(null);
        bntLista.setBorderPainted(false);
        bntLista.setContentAreaFilled(false);
        bntLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntLista.setFocusPainted(false);
        bntLista.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_press.png"))); // NOI18N
        bntLista.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_roll.png"))); // NOI18N
        bntLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntListaActionPerformed(evt);
            }
        });

        bntLista1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        bntLista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_norm.png"))); // NOI18N
        bntLista1.setBorder(null);
        bntLista1.setBorderPainted(false);
        bntLista1.setContentAreaFilled(false);
        bntLista1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntLista1.setFocusPainted(false);
        bntLista1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_press.png"))); // NOI18N
        bntLista1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_roll.png"))); // NOI18N
        bntLista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLista1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoOpcionesLayout = new javax.swing.GroupLayout(fondoOpciones);
        fondoOpciones.setLayout(fondoOpcionesLayout);
        fondoOpcionesLayout.setHorizontalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOpcionesLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(39, 39, 39))
            .addComponent(txtnuevoTablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaTablero, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(fondoOpcionesLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntLista, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoOpcionesLayout.setVerticalGroup(
            fondoOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoOpcionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnuevoTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLista1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(listaTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntLista, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        FondoPanel.add(fondoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 290, 210));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_norm.png"))); // NOI18N
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_press.png"))); // NOI18N
        Salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/salir_roll.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        FondoPanel.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 100, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/23.jpg"))); // NOI18N
        FondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

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

    private void bntListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListaActionPerformed
        // listado
        FrmListarTableros frm = new FrmListarTableros();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntListaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        //bnt SALIR
        int confirmado = JOptionPane.showConfirmDialog(null, "¿Desea SALIR?");
        if (JOptionPane.OK_OPTION==confirmado){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void bntLista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLista1ActionPerformed
        //NUEVO TABLERO
        FrmAgregarTablero frm = new FrmAgregarTablero();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntLista1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoMenu1;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JButton Salir;
    private javax.swing.JButton bntLista;
    private javax.swing.JButton bntLista1;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoOpciones;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel listaTablero;
    private javax.swing.JLabel nameMenu1;
    private javax.swing.JLabel txtnuevoTablero;
    // End of variables declaration//GEN-END:variables
}
