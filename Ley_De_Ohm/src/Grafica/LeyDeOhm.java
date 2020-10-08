/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import javax.swing.ImageIcon;

public class LeyDeOhm extends javax.swing.JFrame {

       @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(400, 200, width, height); //To change body of generated methods, choose Tools | Templates.

    }
   
    public LeyDeOhm() {
        initComponents();
        transparente();
    }

    public void transparente() {
        Limp.setOpaque(false);
        Limp.setContentAreaFilled(false);
        Limp.setBorderPainted(false);
        
        Potencia.setOpaque(false);
        Potencia.setContentAreaFilled(false);
        Potencia.setBorderPainted(false);
        
        LIMP.setOpaque(false);
        LIMP.setContentAreaFilled(false);
        LIMP.setBorderPainted(false);
        
       Calcu.setOpaque(false);
       Calcu.setContentAreaFilled(false);
       Calcu.setBorderPainted(false);
       
       Salir.setOpaque(false);
       Salir.setContentAreaFilled(false);
       Salir.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Resis = new javax.swing.JTextField();
        Cor = new javax.swing.JTextField();
        Vol = new javax.swing.JTextField();
        Limp = new javax.swing.JButton();
        Potencia = new javax.swing.JCheckBox();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Total = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        Calcu = new javax.swing.JButton();
        LIMP = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 51, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Calcular Ley de Ohm");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 450, 30));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1.setText("Voltaje");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel2.setText("Corriente");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel3.setText("Resistencia");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel2.add(Resis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 70, -1));
        jPanel2.add(Cor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, -1));
        jPanel2.add(Vol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 70, -1));

        Limp.setBackground(new java.awt.Color(255, 51, 0));
        Limp.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        Limp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/goma-de-borrar.png"))); // NOI18N
        Limp.setText("Borrar");
        Limp.setBorder(null);
        Limp.setBorderPainted(false);
        Limp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Limp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/goma-de-borrar (1).png"))); // NOI18N
        Limp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Limp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Limp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpActionPerformed(evt);
            }
        });
        jPanel2.add(Limp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 168, 50, 60));

        Potencia.setBackground(new java.awt.Color(255, 51, 0));
        Potencia.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        Potencia.setText("Potencia");
        Potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/superindice-x-elevado-a-la-potencia-de-dos.png"))); // NOI18N
        Potencia.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/photo_2020-10-03_11-36-51 (2).png"))); // NOI18N
        Potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PotenciaActionPerformed(evt);
            }
        });
        jPanel2.add(Potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 30));

        jComboBox2.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Voltaje", "Corriente", "Resistencia" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 210, 240));

        Total.setEditable(false);
        Total.setColumns(20);
        Total.setRows(5);
        jScrollPane1.setViewportView(Total);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 420, 90));

        jPanel4.setBackground(new java.awt.Color(51, 255, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Calcu.setBackground(new java.awt.Color(51, 255, 102));
        Calcu.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        Calcu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/calcular.png"))); // NOI18N
        Calcu.setText("Calcular");
        Calcu.setBorder(null);
        Calcu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Calcu.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/calcular (1).png"))); // NOI18N
        Calcu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Calcu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(Calcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 70));

        LIMP.setBackground(new java.awt.Color(51, 255, 102));
        LIMP.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        LIMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/escoba.png"))); // NOI18N
        LIMP.setText("Limpiar");
        LIMP.setBorder(null);
        LIMP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LIMP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/escoba (1).png"))); // NOI18N
        LIMP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        LIMP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LIMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPActionPerformed(evt);
            }
        });
        jPanel4.add(LIMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 60, 70));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 80, 170));

        Salir.setBackground(new java.awt.Color(153, 51, 255));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(null);
        Salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salir.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cancelar (1).png"))); // NOI18N
        Salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel5.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 50, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpActionPerformed
        
        Vol.setText(null);
        Cor.setText(null);
        Resis.setText(null);
        
    }//GEN-LAST:event_LimpActionPerformed

    private void PotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PotenciaActionPerformed
      
        
        
        
        if(Potencia.isEnabled()){
        Total.setText("Aqui");
        } else{ if(Potencia.isDisplayable()){
        Vol.setText(null);
        }
             
        }
    }//GEN-LAST:event_PotenciaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void LIMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPActionPerformed
    Vol.setText(null);
    Cor.setText(null);
    Resis.setText(null);
    Total.setText(null);
    }//GEN-LAST:event_LIMPActionPerformed

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
            java.util.logging.Logger.getLogger(LeyDeOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeyDeOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeyDeOhm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeyDeOhm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcu;
    private javax.swing.JTextField Cor;
    private javax.swing.JButton LIMP;
    private javax.swing.JButton Limp;
    private javax.swing.JCheckBox Potencia;
    private javax.swing.JTextField Resis;
    private javax.swing.JButton Salir;
    private javax.swing.JTextArea Total;
    private javax.swing.JTextField Vol;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
