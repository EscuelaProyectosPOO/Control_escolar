
package Interfaces;

import java.awt.Color;

public class ventana_menu extends javax.swing.JFrame {

    public ventana_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel_consultas = new javax.swing.JPanel();
        boton_consultas = new javax.swing.JLabel();
        panel_alumnos = new javax.swing.JPanel();
        boton_alumnos = new javax.swing.JLabel();
        panel_materias = new javax.swing.JPanel();
        boton_meterias = new javax.swing.JLabel();
        panel_docentes = new javax.swing.JPanel();
        boton_docentes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(85, 108, 107));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTROL ESCOLAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MENÚ");

        panel_consultas.setBackground(new java.awt.Color(85, 108, 107));
        panel_consultas.setPreferredSize(new java.awt.Dimension(141, 50));

        boton_consultas.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 14)); // NOI18N
        boton_consultas.setForeground(new java.awt.Color(204, 204, 204));
        boton_consultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_consultas.setText("CONSULTAS");
        boton_consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_consultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_consultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_consultasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_consultasLayout = new javax.swing.GroupLayout(panel_consultas);
        panel_consultas.setLayout(panel_consultasLayout);
        panel_consultasLayout.setHorizontalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_consultas, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_consultas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_alumnos.setBackground(new java.awt.Color(85, 108, 107));
        panel_alumnos.setPreferredSize(new java.awt.Dimension(129, 50));

        boton_alumnos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        boton_alumnos.setForeground(new java.awt.Color(204, 204, 204));
        boton_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_alumnos.setText("ALUMNOS");
        boton_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_alumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_alumnosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_alumnosLayout = new javax.swing.GroupLayout(panel_alumnos);
        panel_alumnos.setLayout(panel_alumnosLayout);
        panel_alumnosLayout.setHorizontalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        panel_alumnosLayout.setVerticalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_materias.setBackground(new java.awt.Color(85, 108, 107));
        panel_materias.setPreferredSize(new java.awt.Dimension(129, 50));

        boton_meterias.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        boton_meterias.setForeground(new java.awt.Color(204, 204, 204));
        boton_meterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_meterias.setText("MATERIAS");
        boton_meterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_meteriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_meteriasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_materiasLayout = new javax.swing.GroupLayout(panel_materias);
        panel_materias.setLayout(panel_materiasLayout);
        panel_materiasLayout.setHorizontalGroup(
            panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_meterias, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        panel_materiasLayout.setVerticalGroup(
            panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_meterias, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panel_docentes.setBackground(new java.awt.Color(85, 108, 107));
        panel_docentes.setPreferredSize(new java.awt.Dimension(129, 50));

        boton_docentes.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        boton_docentes.setForeground(new java.awt.Color(204, 204, 204));
        boton_docentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_docentes.setText("DOCENTES");
        boton_docentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_docentesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_docentesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_docentesLayout = new javax.swing.GroupLayout(panel_docentes);
        panel_docentes.setLayout(panel_docentesLayout);
        panel_docentesLayout.setHorizontalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_docentes, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        panel_docentesLayout.setVerticalGroup(
            panel_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_docentes, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel_docentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(90, 90, 90)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_docentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

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

    private void boton_consultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultasMouseEntered
       panel_consultas.setBackground(new Color(44, 68, 67));
       boton_consultas.setForeground(Color.white);
    }//GEN-LAST:event_boton_consultasMouseEntered

    private void boton_consultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultasMouseExited
        panel_consultas.setBackground(new Color(85, 108, 107));
        boton_consultas.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_consultasMouseExited

    private void boton_alumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_alumnosMouseEntered
        panel_alumnos.setBackground(new Color(44, 68, 67));
        boton_alumnos.setForeground(Color.white);
    }//GEN-LAST:event_boton_alumnosMouseEntered

    private void boton_alumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_alumnosMouseExited
        panel_alumnos.setBackground(new Color(85, 108, 107));
        boton_alumnos.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_alumnosMouseExited

    private void boton_meteriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_meteriasMouseEntered
        panel_materias.setBackground(new Color(44, 68, 67));
        boton_meterias.setForeground(Color.white);
    }//GEN-LAST:event_boton_meteriasMouseEntered

    private void boton_meteriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_meteriasMouseExited
        panel_materias.setBackground(new Color(85, 108, 107));
        boton_meterias.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_meteriasMouseExited

    private void boton_docentesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_docentesMouseEntered
        panel_docentes.setBackground(new Color(44, 68, 67));
        boton_docentes.setForeground(Color.white);
    }//GEN-LAST:event_boton_docentesMouseEntered

    private void boton_docentesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_docentesMouseExited
        panel_docentes.setBackground(new Color(85, 108, 107));
        boton_docentes.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_docentesMouseExited

    private void boton_consultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultasMouseClicked
        new ventana_consultas().setVisible(true);
    }//GEN-LAST:event_boton_consultasMouseClicked

   
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
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_alumnos;
    private javax.swing.JLabel boton_consultas;
    private javax.swing.JLabel boton_docentes;
    private javax.swing.JLabel boton_meterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_alumnos;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_docentes;
    private javax.swing.JPanel panel_materias;
    // End of variables declaration//GEN-END:variables
}
