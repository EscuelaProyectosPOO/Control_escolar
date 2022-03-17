
package Interfaces;

import java.awt.Color;

public class ventana_docentes extends javax.swing.JFrame {

     public ventana_docentes() {
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
        materias_caja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel_registrar = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(538, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DOCENTES");

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Nombre");

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

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Apellido paterno");

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

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Apellido materno");

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

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Materias");

        materias_caja.setBackground(new java.awt.Color(255, 255, 255));
        materias_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        materias_caja.setForeground(new java.awt.Color(153, 153, 153));
        materias_caja.setText("Ingrese las materias aquí");
        materias_caja.setBorder(null);
        materias_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                materias_cajaMousePressed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jLabel4))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Titulo))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(nombre_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Autor))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(paterno_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Editorial))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(materno_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ID))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(materias_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(nombre_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(paterno_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(materno_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(materias_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if(materias_caja.getText().equals("")){
            materias_caja.setText("Ingrese las materias aquí");
            materias_caja.setForeground(new Color (153, 153, 153));
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
        if(materias_caja.getText().equals("")){
            materias_caja.setText("Ingrese las materias aquí");
            materias_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_materno_cajaMousePressed

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
        if(materias_caja.getText().equals("Ingrese las materias aquí")){
            materias_caja.setText("");
            materias_caja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_materias_cajaMousePressed

    private void boton_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseClicked

    }//GEN-LAST:event_boton_registrarMouseClicked

    private void boton_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseEntered
        panel_registrar.setBackground(new Color(44, 68, 67));
        boton_registrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_registrarMouseEntered

    private void boton_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseExited
        panel_registrar.setBackground(new Color(85, 108, 107));
        boton_registrar.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_registrarMouseExited

    
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
            java.util.logging.Logger.getLogger(ventana_docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_docentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_docentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField materias_caja;
    private javax.swing.JTextField materno_caja;
    private javax.swing.JTextField nombre_caja;
    private javax.swing.JPanel panel_registrar;
    private javax.swing.JTextField paterno_caja;
    // End of variables declaration//GEN-END:variables
}
