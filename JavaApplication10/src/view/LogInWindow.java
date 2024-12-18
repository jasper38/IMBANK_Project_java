/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Admin
 */
public class LogInWindow extends javax.swing.JFrame {

    /**
     * Creates new form LogInWindow
     */
    public LogInWindow() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
//        :root {
//    --main-color: rgb(35, 35, 77);
//    --secondary-color: rgb(100, 100, 172);
//    --lighter-color: rgb(224, 224, 231);
//    --light-color: rgb(176, 176, 192);
//    --dark-color: rgb(82, 80, 94);
//    --font-color: rgb(20, 19, 24);
//    --font-small: 14px;
//    --font-large: 20px;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        Submitbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Signupbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(102, 102, 102));
        jTextField3.setText("Type your Username");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 156, 362, 51));

        Submitbtn.setBackground(new java.awt.Color(35, 35, 77));
        Submitbtn.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        Submitbtn.setForeground(new java.awt.Color(224, 224, 231));
        Submitbtn.setText("Submit");
        Submitbtn.setBorder(null);
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 322, 362, 43));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Don't have an Account?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 394, -1, -1));

        Signupbtn.setBackground(new java.awt.Color(35, 35, 77));
        Signupbtn.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        Signupbtn.setForeground(new java.awt.Color(224, 224, 231));
        Signupbtn.setText("Sign Up");
        Signupbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 35, 77), 1, true));
        Signupbtn.setBorderPainted(false);
        Signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 393, 79, -1));

        jPanel2.setBackground(new java.awt.Color(35, 35, 77));

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IMBANK LOG IN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, -1));

        jPasswordField1.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        jPasswordField1.setText("Password");
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 360, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        

        
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void SignupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupbtnActionPerformed
        SignUp signUpFrame = new SignUp();
        signUpFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignupbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Signupbtn;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
