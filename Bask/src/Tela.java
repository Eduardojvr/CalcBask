
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        painel.setVisible(false);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblB = new javax.swing.JSpinner();
        db = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        A = new javax.swing.JSpinner();
        C = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        painel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        delt = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("<html>&Delta</html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 30, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("=");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 30, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 30, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText(".");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 30, 20));

        lblA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblA.setForeground(new java.awt.Color(153, 153, 153));
        lblA.setText("A");
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 30, 20));

        lblC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblC.setForeground(new java.awt.Color(153, 153, 153));
        lblC.setText("C");
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 30, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel11.setText("    Bhaskara ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 56));

        jButton1.setText("<html>&Delta </htmll>Calcular <html>&infin</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 183, 110, 40));

        lblB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lblBStateChanged(evt);
            }
        });
        getContentPane().add(lblB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 106, 49, 40));

        db.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        db.setForeground(new java.awt.Color(153, 153, 153));
        db.setText("B");
        getContentPane().add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 30, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("<html><sup>2</sup>-</html>");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 40, 30));

        A.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AStateChanged(evt);
            }
        });
        getContentPane().add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 106, 54, 40));

        C.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CStateChanged(evt);
            }
        });
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 106, 54, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ezgif.com-resize(4).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel14.setFont(new java.awt.Font("Utsaah", 0, 12)); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("A");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 86, -1, 30));

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("B");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 86, -1, 30));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("C");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 86, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText(".");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 30, 20));

        painel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Raiz R1:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Raiz R2:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Delta:");

        delt.setForeground(new java.awt.Color(0, 0, 255));
        delt.setText("0");

        r1.setForeground(new java.awt.Color(0, 0, 255));
        r1.setText("NULL");

        r2.setForeground(new java.awt.Color(0, 0, 255));
        r2.setText("NULL");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(0, 51, Short.MAX_VALUE)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(114, 114, 114)
                            .addComponent(delt))
                        .addGroup(painelLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(100, 100, 100)
                            .addComponent(r1))
                        .addGroup(painelLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(100, 100, 100)
                            .addComponent(r2)))
                    .addGap(0, 51, Short.MAX_VALUE)))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 76, Short.MAX_VALUE)
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(delt))
                    .addGap(3, 3, 3)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(r1))
                    .addGap(3, 3, 3)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(r2)))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 290, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        painel.setVisible(true);
        double cdelta;
        int a =(int) A.getValue();
        int b =(int) lblB.getValue();
        int c =(int) C.getValue();
        cdelta = (b*b) - (4*a*c);
        double raiz1,raiz2;
        raiz1 = (-b + sqrt(cdelta))/(2*a);
        raiz2 = (-b - sqrt(cdelta))/(2*a);
        r1.setText(Double.toString(raiz1));
        r2.setText(Double.toString(raiz2));
        delt.setText(Double.toString(cdelta));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lblBStateChanged
        int b =(int) lblB.getValue();
        db.setText(Integer.toString(b));
        
    }//GEN-LAST:event_lblBStateChanged

    private void AStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AStateChanged
int a =(int) A.getValue();
        lblA.setText(Integer.toString(a));
    }//GEN-LAST:event_AStateChanged

    private void CStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CStateChanged
        int c =(int) C.getValue();
        lblC.setText(Integer.toString(c));
    }//GEN-LAST:event_CStateChanged

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner A;
    private javax.swing.JSpinner C;
    private javax.swing.JLabel db;
    private javax.swing.JLabel delt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblA;
    private javax.swing.JSpinner lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JPanel painel;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    // End of variables declaration//GEN-END:variables
}
