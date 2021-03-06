/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo.calculadora;

/**
 *
 * @author Kevin Jimmy
 */
public class TelaCalculadoraMath extends javax.swing.JFrame {

    /**
     * Creates new form TelaCalculadoraMath
     */
    public TelaCalculadoraMath() {
        initComponents();
        panCalc.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtN1 = new javax.swing.JSpinner();
        btnCalc = new javax.swing.JButton();
        panCalc = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblQua = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblCubi = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblAbs = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCub = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Informe um valor:");

        txtN1.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel7.setText("Raiz Quadrada:");

        lblQua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQua.setForeground(new java.awt.Color(51, 0, 204));
        lblQua.setText("0");

        jLabel9.setText("Raiz C??bica:");

        lblCubi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCubi.setForeground(new java.awt.Color(0, 0, 255));
        lblCubi.setText("0");

        jLabel11.setText("Valor Absoluto:");

        lblAbs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAbs.setForeground(new java.awt.Color(0, 0, 204));
        lblAbs.setText("0");

        jLabel3.setText("Resto da Divis??o por 2:");

        lblRes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRes.setForeground(new java.awt.Color(0, 51, 255));
        lblRes.setText("0");

        jLabel5.setText("Elevado ao Cubo:");

        lblCub.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCub.setForeground(new java.awt.Color(0, 0, 204));
        lblCub.setText("0");

        javax.swing.GroupLayout panCalcLayout = new javax.swing.GroupLayout(panCalc);
        panCalc.setLayout(panCalcLayout);
        panCalcLayout.setHorizontalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCubi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRes, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblAbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panCalcLayout.setVerticalGroup(
            panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCalcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblCub))
                .addGap(18, 18, 18)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblQua))
                .addGap(18, 18, 18)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCubi))
                .addGap(18, 18, 18)
                .addGroup(panCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblAbs)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalc)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCalc)))
                .addGap(18, 18, 18)
                .addComponent(panCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int val = Integer.parseInt(txtN1.getValue().toString());
        
        // resto da divis??o
        int resto = val % 2;
        lblRes.setText(Integer.toString(resto));
        
        // elevado ao cubo
        double cubo = Math.pow(val, 3);
        lblCub.setText(Double.toString(cubo));
        
        // raiz quadrada
        double raizQuadrada = Math.sqrt(val);
        lblQua.setText(String.format("%.2f", raizQuadrada));
        
        // raiz cubica
        double raizCubica = Math.cbrt(val);
        lblCubi.setText(String.format("%.2f", raizCubica));
        
        // valor asbsoluto
        int absoluto = Math.abs(val);
        lblAbs.setText(Integer.toString(absoluto));
        
        panCalc.setVisible(true);
    }//GEN-LAST:event_btnCalcActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadoraMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadoraMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadoraMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadoraMath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadoraMath().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAbs;
    private javax.swing.JLabel lblCub;
    private javax.swing.JLabel lblCubi;
    private javax.swing.JLabel lblQua;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel panCalc;
    private javax.swing.JSpinner txtN1;
    // End of variables declaration//GEN-END:variables
}
