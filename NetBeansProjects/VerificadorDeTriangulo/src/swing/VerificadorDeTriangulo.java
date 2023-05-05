/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swing;

/**
 *
 * @author Kris
 */
public class VerificadorDeTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form VerificadorDeTriangulo
     */
    public VerificadorDeTriangulo() {
        initComponents();
        pan.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        sliA = new javax.swing.JSlider();
        sliB = new javax.swing.JSlider();
        sliC = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(228, 228, 228));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setText("C");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 30, 30));

        sliA.setMaximum(10);
        sliA.setToolTipText("");
        sliA.setValue(0);
        sliA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliAStateChanged(evt);
            }
        });
        getContentPane().add(sliA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 112, 26));

        sliB.setMaximum(10);
        sliB.setToolTipText("");
        sliB.setValue(0);
        sliB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliBStateChanged(evt);
            }
        });
        getContentPane().add(sliB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 112, -1));

        sliC.setMaximum(10);
        sliC.setToolTipText("");
        sliC.setValue(0);
        sliC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliCStateChanged(evt);
            }
        });
        getContentPane().add(sliC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 112, -1));

        jLabel1.setText("Seg A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 32, -1, -1));

        jLabel2.setText("Seg B");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, -1));

        jLabel3.setText("Seg C");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 90, 40, -1));

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(0, 0, 255));
        lblA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA.setText("0");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblB.setForeground(new java.awt.Color(0, 0, 255));
        lblB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblB.setText("0");
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(0, 0, 255));
        lblC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblC.setText("0");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/isosceles_triangle_main.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        btn.setBackground(new java.awt.Color(0, 0, 0));
        btn.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        btn.setForeground(new java.awt.Color(153, 255, 255));
        btn.setText("Verificar");
        btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 50));

        lblStatus.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tipo.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                .addContainerGap())
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 370, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        int a = sliA.getValue();
        int b = sliB.getValue();
        int c = sliC.getValue();

        
        if (a < b + c && b < a + c && c < a + b) {
            lblStatus.setText("TRIANGULO EXISTENTE!!");
            if (a == b && b == c) {
                tipo.setText("TRIANGULO EQUILATERO");
            } else if (a != b && b != c && a != c) {
                tipo.setText("TRIANGULO ESCALENO");
            } else {
                tipo.setText("TRIANGULO ISOCELES");
            }
        } else {
            lblStatus.setText("TRIANGULO INEXISTENTE");
            tipo.setText(" ---- ");
        }

        pan.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void sliAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliAStateChanged
        lblA.setText(Integer.toString(sliA.getValue()));
        // TODO add your handling code here:
    }//GEN-LAST:event_sliAStateChanged

    private void sliBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliBStateChanged
        lblB.setText(Integer.toString(sliB.getValue()));
        // TODO add your handling code here:
    }//GEN-LAST:event_sliBStateChanged

    private void sliCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliCStateChanged
        lblC.setText(Integer.toString(sliC.getValue()));
        // TODO add your handling code here:
    }//GEN-LAST:event_sliCStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(VerificadorDeTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificadorDeTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificadorDeTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificadorDeTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificadorDeTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pan;
    private javax.swing.JSlider sliA;
    private javax.swing.JSlider sliB;
    private javax.swing.JSlider sliC;
    private javax.swing.JLabel tipo;
    // End of variables declaration//GEN-END:variables
}