
package Formularios;

import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Emerson
 */
public class FrmTarea extends javax.swing.JFrame {

    
    Tarea tarea = new Tarea();
    ListadoTareas lista = new ListadoTareas();
    
    public FrmTarea() throws ParseException {
        initComponents();
        setLocationRelativeTo(this);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "C:\\Users\\Emerson\\Documents\\NetBeansProjects\\Proyecto Organizador Al Fin\\Organizador\\src\\Imagenes\\24.jpg");
        
        listarComentarios();
        tarea = EstadoGlobal.TransferenciaTarea;
        String fechafinal = tarea.getFechaFinal();       
        if (fechafinal.equals("sin datos")) {
            tarea.setVigenciaToString(fechafinal);
        }else{
            tarea.setVigencia(fechafinal);
        }  
        String vigencia = tarea.getVigencia();
        lista = EstadoGlobal.TransferencialistadoTareas;
        No_Ta.setText(tarea.getNombre());
        Des_Ta.setText(tarea.getDescripcion());
        Li_Ta.setText(lista.getNombreListado());
        Ven_Ta.setText(tarea.getFechaFinal());
        Est_Ta.setText(tarea.getVigencia());
        //Pinche panel qlero de vencimiento
        if (vigencia.equals("Vencida")) {
            PanelVencimiento.setBackground(Color.red);
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
        }else if (vigencia.equals("Por vencer")) {
            PanelVencimiento.setBackground(Color.yellow);
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
        }else if (vigencia.equals("En tiempo")) {
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
            PanelVencimiento.setBackground(Color.green);
        }
        
    }
    
    public void listarComentarios(){
        ArrayList<Comentarios> lista = new ArrayList();
        lista = EstadoGlobal.TransferenciaTarea.leerComentariosTarea();
        int cantidadComentarios = lista.size();
        DefaultTableModel modelo = (DefaultTableModel) tblCo.getModel();        
        String[] datos = new String[2];
        for(int i=0;i<cantidadComentarios;i++){
            datos[0]=String.valueOf(lista.get(i).getIdComentario());
            datos[1]=String.valueOf(lista.get(i).getComentario());
            modelo.addRow(datos);            
        }      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Li_Ta = new javax.swing.JLabel();
        No_Ta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Des_Ta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelVencimiento = new javax.swing.JPanel();
        Ven_Ta = new javax.swing.JLabel();
        Est_Ta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCo = new javax.swing.JTable();
        FondoTitulo = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_norm.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_press.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/eliminar_roll.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, 40));

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
        FondoPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 110, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/editar_norm.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/editar_press.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/editar_roll.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 110, 40));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("AGREGAR LISTA DE ACTIVIDADES");
        FondoPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 188, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_norm.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_press.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_roll.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("LISTA DE TAREAS");
        FondoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 109, -1, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NOMBRE TAREA");
        FondoPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 109, 120, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 255, 0));

        Li_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Li_Ta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Li_Ta.setForeground(new java.awt.Color(0, 0, 0));
        Li_Ta.setText("Listado Tarea");

        No_Ta.setBackground(new java.awt.Color(0, 0, 0));
        No_Ta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        No_Ta.setForeground(new java.awt.Color(0, 0, 0));
        No_Ta.setText("Nombre tarea");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Li_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(No_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Li_Ta, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(No_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FondoPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("LISTADO LISTA DE ACTIVIDADES");
        FondoPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_norm.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_press.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_roll.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, -1, 30));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("AGREGAR COMENTARIO");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FondoPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 140, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_norm.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_press.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Botones/add_roll.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DESCRIPCION");
        FondoPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Des_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Des_Ta.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Des_Ta.setForeground(new java.awt.Color(0, 0, 0));
        Des_Ta.setText("Descripcion ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Des_Ta, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Des_Ta, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        FondoPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 280, 80));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FECHA FIN");
        FondoPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 229, 190, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTADO");
        FondoPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 180, 30));

        PanelVencimiento.setBackground(new java.awt.Color(255, 255, 255));

        Ven_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Ven_Ta.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Ven_Ta.setForeground(new java.awt.Color(0, 0, 0));
        Ven_Ta.setText("Vencimiento");

        Est_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Est_Ta.setFont(new java.awt.Font("Roboto Black", 3, 18)); // NOI18N
        Est_Ta.setForeground(new java.awt.Color(0, 0, 0));
        Est_Ta.setText("Estado");

        javax.swing.GroupLayout PanelVencimientoLayout = new javax.swing.GroupLayout(PanelVencimiento);
        PanelVencimiento.setLayout(PanelVencimientoLayout);
        PanelVencimientoLayout.setHorizontalGroup(
            PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVencimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ven_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(Est_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        PanelVencimientoLayout.setVerticalGroup(
            PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVencimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ven_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Est_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FondoPanel.add(PanelVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("COMENTARIOS");
        FondoPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 110, 31));

        tblCo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCo);
        if (tblCo.getColumnModel().getColumnCount() > 0) {
            tblCo.getColumnModel().getColumn(0).setResizable(false);
            tblCo.getColumnModel().getColumn(1).setResizable(false);
        }

        FondoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 530, 110));

        FondoTitulo.setBackground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Roboto Thin", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DETALLES TAREA");

        javax.swing.GroupLayout FondoTituloLayout = new javax.swing.GroupLayout(FondoTitulo);
        FondoTitulo.setLayout(FondoTituloLayout);
        FondoTituloLayout.setHorizontalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
        );
        FondoTituloLayout.setVerticalGroup(
            FondoTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        FondoPanel.add(FondoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, 60));
        FondoPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 800, 10));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/24.jpg"))); // NOI18N
        FondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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
          FrmListarTareas frm = null;
        try {
            frm = new FrmListarTareas();
        } catch (ParseException ex) {
            Logger.getLogger(FrmTarea.class.getName()).log(Level.SEVERE, null, ex);
        }
          frm.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FrmModificarTarea frm = new FrmModificarTarea();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = EstadoGlobal.TransferenciaTarea.getId();
        EstadoGlobal.TransferencialistadoTareas.eliminarTarea(id);
        ListadoTarea frm = new ListadoTarea();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tblCoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCoMouseClicked
        int seleccionar = tblCo.rowAtPoint(evt.getPoint());  
        Comentarios Transferencia = EstadoGlobal.TransferenciaComentarios;
        Transferencia.setIdComentario((String) tblCo.getValueAt(seleccionar,0));
        Transferencia.setComentario(String.valueOf(tblCo.getValueAt(seleccionar,1)));
        FrmComentario frm = new FrmComentario();
        frm.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_tblCoMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          FrmAgregarListaActividades frm = new FrmAgregarListaActividades();
            frm.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       FrmListarListaActividades frm = new FrmListarListaActividades();
            frm.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FrmAgregarComentario frm = new FrmAgregarComentario();
        frm.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmTarea().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmTarea.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Des_Ta;
    private javax.swing.JLabel Est_Ta;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JPanel FondoTitulo;
    private javax.swing.JLabel Li_Ta;
    private javax.swing.JLabel No_Ta;
    private javax.swing.JPanel PanelVencimiento;
    private javax.swing.JLabel Ven_Ta;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblCo;
    // End of variables declaration//GEN-END:variables

}
