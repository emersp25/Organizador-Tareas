package Formularios;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emerson
 */
public class FrmAgregarTarea extends javax.swing.JFrame {
  
    public FrmAgregarTarea() {
        initComponents();
        setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\Proyecto Organizador Al Fin\\Organizador\\src\\Imagenes\\24.jpg");
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Inicio = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        Fin = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionTa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreTa = new javax.swing.JTextField();
        FondoTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_norm.png"))); // NOI18N
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_press.png"))); // NOI18N
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/save_roll.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        FondoPanel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 110, 40));

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
        FondoPanel.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 110, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Inicio");
        FondoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, -1));
        FondoPanel.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 280, 130, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha Fin");
        FondoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 60, 22));
        FondoPanel.add(Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("OPCIONAL");
        FondoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 100, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DESCRIPCION");
        FondoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 112, 26));

        txtDescripcionTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionTaActionPerformed(evt);
            }
        });
        FondoPanel.add(txtDescripcionTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 247, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE");
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 120, 90, 29));

        txtNombreTa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FondoPanel.add(txtNombreTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 247, -1));

        FondoTitulo.setBackground(new java.awt.Color(0, 0, 0));

        Titulo.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("NUEVA TAREA");

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
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        FondoPanel.add(FondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 600, 60));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24.jpg"))); // NOI18N
        FondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       ListadoTarea frm = new ListadoTarea();
       frm.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    /**
     * Método que agrega un curso a la lista de cursos
     * @param evt 
     */
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try{
         SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
         UUID uuid = UUID.randomUUID();
         ListadoTareas listadoTareas = EstadoGlobal.TransferencialistadoTareas;
         String id = uuid.toString();
         String idLista = EstadoGlobal.TransferencialistadoTareas.getIdListadoTareas();
         Date inicio = Inicio.getDate();
         Date fin = Fin.getDate();
         String nombre = txtNombreTa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
         String descripcion = txtDescripcionTa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
         String fechaInicio = "";
         String fechaFinal = "";
        if (inicio != null && fin != null) {
            fechaInicio = fecha.format(Inicio.getCalendar().getTime());
            fechaFinal = fecha.format(Fin.getCalendar().getTime());
        }           
         if (!nombre.equals("") && !descripcion.equals("") && !nombre.isBlank() && !descripcion.isBlank() && !nombre.isEmpty() && !descripcion.isEmpty()) {
            ArrayList<Tarea> lista = new ArrayList();
            Tarea tarea = new Tarea();            
             if (!fechaInicio.equals("") && !fechaFinal.equals("") && !fechaInicio.isBlank() && !fechaFinal.isBlank() && !fechaInicio.isEmpty() && !fechaFinal.isEmpty()) {                
                 Date dt_1 = fecha.parse(fechaInicio);
                 Date dt_2 = fecha.parse(fechaFinal);
                if (dt_1.compareTo(dt_2) > 0) {  
                    JOptionPane.showMessageDialog(null, "La Fecha Inicio debe ser antes que la Fecha Fin");
                } // el método compareTo devuelve el valor mayor que 0 si esta Fecha está después del argumento Fecha.  
                else if (dt_1.compareTo(dt_2) < 0) {  
                    tarea.setFechaInicio(fechaInicio);
                    tarea.setFechaFinal(fechaFinal); 
                    tarea.setIdLista(idLista);
                    tarea.setId(id);
                    tarea.setNombre(nombre);
                    tarea.setDescripcion(descripcion);
                    tarea.setVigencia(fechaFinal);
                    lista.add(tarea);
                    listadoTareas.aniadirTareasLista(lista);
                    JOptionPane.showMessageDialog(null, "Tarea creada");
                } // el método compareTo devuelve el valor menor que 0 si esta Fecha es anterior al argumento Fecha; 
                else if (dt_1.compareTo(dt_2) == 0) {  
                     tarea.setFechaInicio(fechaInicio);
                     tarea.setFechaFinal(fechaFinal);
                     tarea.setIdLista(idLista);
                     tarea.setId(id);
                     tarea.setNombre(nombre);
                     tarea.setDescripcion(descripcion);
                      tarea.setVigencia(fechaFinal);
                     lista.add(tarea);
                     listadoTareas.aniadirTareasLista(lista);
                     JOptionPane.showMessageDialog(null, "Tarea creada");
                } // el método compareTo devuelve el valor 0 si el argumento Fecha es igual a la segunda Fecha;
                else {  
                    System.out.println("Hey");
                }
               
             }else{
                tarea.setIdLista(idLista);
                tarea.setId(id);
                tarea.setNombre(nombre);
                tarea.setDescripcion(descripcion);
                tarea.setFechaInicio("sin datos");
                tarea.setFechaFinal("sin datos");
                tarea.setVigenciaToString("sin datos");
                lista.add(tarea);
                listadoTareas.aniadirTareasLista(lista);
                JOptionPane.showMessageDialog(null, "Tarea creada");
             }                      
            txtNombreTa.setText("");
            txtDescripcionTa.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
         }
        }catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error! " + ex);
            txtNombreTa.setText("");
            txtDescripcionTa.setText("");
        } catch (ParseException ex) {
            Logger.getLogger(FrmAgregarTarea.class.getName()).log(Level.SEVERE, null, ex);
        }        
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDescripcionTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionTaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fin;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel FondoTitulo;
    private com.toedter.calendar.JDateChooser Inicio;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDescripcionTa;
    private javax.swing.JTextField txtNombreTa;
    // End of variables declaration//GEN-END:variables
}
