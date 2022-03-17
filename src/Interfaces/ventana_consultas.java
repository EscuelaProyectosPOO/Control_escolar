
package Interfaces;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ventana_consultas extends javax.swing.JFrame {

    public ventana_consultas() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panel_titulo = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        OpcionCombo = new javax.swing.JComboBox<>();
        caja_busquedas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        panel_titulo.setBackground(new java.awt.Color(85, 108, 107));

        label_titulo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 30)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("VENTANA DE CONSULTAS\n");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(label_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_buscar.setBackground(new java.awt.Color(85, 108, 107));

        boton_buscar.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 14)); // NOI18N
        boton_buscar.setForeground(new java.awt.Color(219, 217, 217));
        boton_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_buscar.setText("BUSCAR");
        boton_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_buscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        OpcionCombo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 15)); // NOI18N
        OpcionCombo.setMaximumRowCount(3);
        OpcionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumnos", "Materias", "Docentes" }));
        OpcionCombo.setBorder(null);
        OpcionCombo.setMinimumSize(new java.awt.Dimension(72, 30));
        OpcionCombo.setPreferredSize(new java.awt.Dimension(72, 30));

        caja_busquedas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        caja_busquedas.setForeground(new java.awt.Color(153, 153, 153));
        caja_busquedas.setText("Ingrese su consulta aquí");
        caja_busquedas.setBorder(null);
        caja_busquedas.setPreferredSize(new java.awt.Dimension(188, 30));
        caja_busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel2.setText("Opciones:");

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel3.setText("Buscador: ");

        TablaConsultas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 13)); // NOI18N
        TablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaConsultas);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(panel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseExited
        
        panel_buscar.setBackground(new Color(85, 108, 107));
        boton_buscar.setForeground(new Color(219, 217, 217));
    }//GEN-LAST:event_boton_buscarMouseExited

    private void boton_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseEntered
        
        panel_buscar.setBackground(new Color(44, 68, 67));
        boton_buscar.setForeground(Color.white);
    }//GEN-LAST:event_boton_buscarMouseEntered
    
    //Trabajar sobre esta funcion
    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        
        
        if(OpcionCombo.getSelectedIndex() == 0){
            // si alumnos es seleccionado
            
            titulo = new String[]{"Nombre", "Ap. Paterno", "Ap. Materno", "Numero Control", "Materias"};
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                //registros_que_coinciden.add("Josefa Maria  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Maria Colar  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Jose colar  Joler  bbmns  Z20020020  Mate");
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = registros_que_coinciden.get(i).split("  ");
                    
                    tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3], columnas[4]});


                }
                
                
                
                
            }
            
            
        }else if(OpcionCombo.getSelectedIndex() == 1){
            //si Materias es seleccionado
            
            titulo = new String[]{"Nombre", "Clave"};
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                //registros_que_coinciden.add("Josefa Maria  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Maria Colar  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Jose colar  Joler  bbmns  Z20020020  Mate");
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = registros_que_coinciden.get(i).split("  ");
                    
                    tabla.addRow(new Object[]{ columnas[0], columnas[1]});


                }
                
                
                
                
            }
            
            
        }else if(OpcionCombo.getSelectedIndex() == 2){
            //si docentes es seleccionado upperCaseFirst para poner la primera letra en mayuscula
            
            titulo = new String[]{"Nombre", "Ap. Paterno", "Ap. Materno", "Materias" };
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                //registros_que_coinciden.add("Josefa Maria  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Maria Colar  Perez  nn  Z200  Mate");
                //registros_que_coinciden.add("Jose colar  Joler  bbmns  Z20020020  Mate");
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = registros_que_coinciden.get(i).split("  ");
                    
                    tabla.addRow(new Object[]{ columnas[0], columnas[1], columnas[2], columnas[3]});


                }
                
                
                
                
            }
            
            
            
        }
        
        
        
        
        
    }//GEN-LAST:event_boton_buscarMouseClicked

    private void caja_busquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseEntered
        if(caja_busquedas.getText().equals("Ingrese su consulta aquí")){
            caja_busquedas.setText("");
            caja_busquedas.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_caja_busquedasMouseEntered

    private void caja_busquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseExited
        if(caja_busquedas.getText().equals("")){
            caja_busquedas.setText("Ingrese su consulta aquí");
            caja_busquedas.setForeground(new Color(155, 155, 155));
        }
    }//GEN-LAST:event_caja_busquedasMouseExited

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
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_consultas().setVisible(true);
            }
        });
    }
    
    String[] columnas;
    List<String> registros_que_coinciden = new ArrayList<>();
    String[] titulo;
    DefaultTableModel tabla = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OpcionCombo;
    private javax.swing.JTable TablaConsultas;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JTextField caja_busquedas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_titulo;
    // End of variables declaration//GEN-END:variables
}
