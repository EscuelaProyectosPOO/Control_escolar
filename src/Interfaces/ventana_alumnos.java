package Interfaces;

import java.awt.Color;

public class ventana_alumnos extends javax.swing.JFrame {

    public ventana_alumnos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        nombre_caja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Autor = new javax.swing.JLabel();
        paterno_caja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Editorial = new javax.swing.JLabel();
        materno_caja = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        control_caja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel_registrar = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        materias_caja = new javax.swing.JTextField();
        ID1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(85, 108, 107));
        jPanel2.setForeground(new java.awt.Color(85, 108, 107));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 0, -1, 658));

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ALUMNOS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Nombre");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, 35));

        nombre_caja.setBackground(new java.awt.Color(255, 255, 255));
        nombre_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        nombre_caja.setForeground(new java.awt.Color(153, 153, 153));
        nombre_caja.setText("Ingrese el nombre aquí");
        nombre_caja.setBorder(null);
        nombre_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_cajaMousePressed(evt);
            }
        });
        bg.add(nombre_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, 490, 33));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 164, 490, 11));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Apellido paterno");
        bg.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 185, -1, 35));

        paterno_caja.setBackground(new java.awt.Color(255, 255, 255));
        paterno_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        paterno_caja.setForeground(new java.awt.Color(153, 153, 153));
        paterno_caja.setText("Ingrese el apellido paterno aquí");
        paterno_caja.setBorder(null);
        paterno_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paterno_cajaMousePressed(evt);
            }
        });
        bg.add(paterno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, 490, 33));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 269, 490, 11));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Apellido materno");
        bg.add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, -1, 35));

        materno_caja.setBackground(new java.awt.Color(255, 255, 255));
        materno_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        materno_caja.setForeground(new java.awt.Color(153, 153, 153));
        materno_caja.setText("Ingrese el apellido materno aquí");
        materno_caja.setBorder(null);
        materno_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                materno_cajaMousePressed(evt);
            }
        });
        bg.add(materno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 490, 33));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 374, 490, 11));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Numero de control");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 395, -1, 35));

        control_caja.setBackground(new java.awt.Color(255, 255, 255));
        control_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        control_caja.setForeground(new java.awt.Color(153, 153, 153));
        control_caja.setText("Ingrese el numero de control aquí");
        control_caja.setBorder(null);
        control_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                control_cajaMousePressed(evt);
            }
        });
        bg.add(control_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 440, 490, 33));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 479, 490, 11));

        panel_registrar.setBackground(new java.awt.Color(85, 108, 107));

        boton_registrar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_registrar.setForeground(new java.awt.Color(219, 217, 217));
        boton_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_registrar.setText("REGISTRAR");
        boton_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_registrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_registrarLayout = new javax.swing.GroupLayout(panel_registrar);
        panel_registrar.setLayout(panel_registrarLayout);
        panel_registrarLayout.setHorizontalGroup(
            panel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_registrarLayout.setVerticalGroup(
            panel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        bg.add(panel_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 594, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 490, 11));

        materias_caja.setBackground(new java.awt.Color(255, 255, 255));
        materias_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        materias_caja.setForeground(new java.awt.Color(153, 153, 153));
        materias_caja.setText("Ingrese las materias aquí");
        materias_caja.setToolTipText("");
        materias_caja.setBorder(null);
        materias_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                materias_cajaMousePressed(evt);
            }
        });
        bg.add(materias_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 490, 33));

        ID1.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID1.setForeground(new java.awt.Color(0, 0, 0));
        ID1.setText("Materias");
        bg.add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_cajaMousePressed

        if(nombre_caja.getText().equals("Ingrese el nombre aquí")){
            nombre_caja.setText("");
            nombre_caja.setForeground(Color.BLACK);
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(control_caja.getText().equals("")){
            control_caja.setText("Ingrese el numero de control aquí");
            control_caja.setForeground(new Color (153, 153, 153));
        }
        
    }//GEN-LAST:event_nombre_cajaMousePressed

    private void paterno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paterno_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("Ingrese el apellido paterno aquí")){
            paterno_caja.setText("");
            paterno_caja.setForeground(Color.BLACK);
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(control_caja.getText().equals("")){
            control_caja.setText("Ingrese el numero de control aquí");
            control_caja.setForeground(new Color (153, 153, 153));
        }
        if(materias_caja.getText().equals("")){
            materias_caja.setText("Ingrese las materias aquí");
            materias_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_paterno_cajaMousePressed

    private void materno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materno_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("Ingrese el apellido materno aquí")){
            materno_caja.setText("");
            materno_caja.setForeground(Color.BLACK);
        }
        if(control_caja.getText().equals("")){
            control_caja.setText("Ingrese el numero de control aquí");
            control_caja.setForeground(new Color (153, 153, 153));
        }
        if(materias_caja.getText().equals("")){
            materias_caja.setText("Ingrese las materias aquí");
            materias_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_materno_cajaMousePressed

    private void control_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_control_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(control_caja.getText().equals("Ingrese el numero de control aquí")){
            control_caja.setText("");
            control_caja.setForeground(Color.BLACK);
        }
        if(materias_caja.getText().equals("")){
            materias_caja.setText("Ingrese las materias aquí");
            materias_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_control_cajaMousePressed

    
    //Boton registrar
    private void boton_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseClicked

    }//GEN-LAST:event_boton_registrarMouseClicked
    //fin del boton
    
    private void boton_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseEntered
        panel_registrar.setBackground(new Color(44, 68, 67));
        boton_registrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_registrarMouseEntered

    private void boton_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseExited
        panel_registrar.setBackground(new Color(85, 108, 107));
        boton_registrar.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_registrarMouseExited

    private void materias_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materias_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(control_caja.getText().equals("")){
            control_caja.setText("Ingrese el numero de control aquí");
            control_caja.setForeground(new Color (153, 153, 153));
        }
        if(materias_caja.getText().equals("Ingrese las materias aquí")){
            materias_caja.setText("");
            materias_caja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_materias_cajaMousePressed


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
            java.util.logging.Logger.getLogger(ventana_alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_registrar;
    private javax.swing.JTextField control_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField materias_caja;
    private javax.swing.JTextField materno_caja;
    private javax.swing.JTextField nombre_caja;
    private javax.swing.JPanel panel_registrar;
    private javax.swing.JTextField paterno_caja;
    // End of variables declaration//GEN-END:variables
}
