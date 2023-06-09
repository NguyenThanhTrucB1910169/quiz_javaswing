
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MyPC
 */
public class adminHome extends javax.swing.JFrame {
    public static int open = 0;

    /**
     * Creates new form adminHome
     */
    public adminHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_add = new javax.swing.JLabel();
        jLabel_update = new javax.swing.JLabel();
        jLabel_all_question = new javax.swing.JLabel();
        jLabel_delete = new javax.swing.JLabel();
        jLabel_all_results = new javax.swing.JLabel();
        jLabel_logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_add.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_add.setText("Add New Question");
        jLabel_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_addMouseClicked(evt);
            }
        });

        jLabel_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_update.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_update.setText("Update Question");
        jLabel_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_updateMouseClicked(evt);
            }
        });

        jLabel_all_question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_all_question.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_all_question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_all_question.setText("All Question");
        jLabel_all_question.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_all_questionMouseClicked(evt);
            }
        });

        jLabel_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_delete.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_delete.setText("Delete Question");
        jLabel_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_deleteMouseClicked(evt);
            }
        });

        jLabel_all_results.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_all_results.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_all_results.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_all_results.setText("All Student Results");
        jLabel_all_results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_all_resultsMouseClicked(evt);
            }
        });

        jLabel_logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_logout.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logout.setText("Logout");
        jLabel_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_logoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Quiz <br>Management <br>System</html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_logout)
                    .addComponent(jLabel_update)
                    .addComponent(jLabel_all_question)
                    .addComponent(jLabel_delete)
                    .addComponent(jLabel_all_results))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jLabel_add)
                .addGap(47, 47, 47)
                .addComponent(jLabel_update)
                .addGap(48, 48, 48)
                .addComponent(jLabel_all_question)
                .addGap(46, 46, 46)
                .addComponent(jLabel_delete)
                .addGap(60, 60, 60)
                .addComponent(jLabel_all_results)
                .addGap(63, 63, 63)
                .addComponent(jLabel_logout)
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 725, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_addMouseClicked
        // TODO add your handling code here:
        if (open == 0) {
//            new addNewQuestion().setVisible(true);
            open= 1;
        } else {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "One form was already opened!");
        }
    }//GEN-LAST:event_jLabel_addMouseClicked

    private void jLabel_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_updateMouseClicked
        // TODO add your handling code here:
        if (open == 0) {
//            new updateQuestion().setVisible(true);
            open= 1;
        } else {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "One form was already opened!");
        }
    }//GEN-LAST:event_jLabel_updateMouseClicked

    private void jLabel_all_questionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_all_questionMouseClicked
        // TODO add your handling code here:
        if (open == 0) {
//            new allQuestion().setVisible(true);
            open= 1;
        } else {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "One form was already opened!");
        }
    }//GEN-LAST:event_jLabel_all_questionMouseClicked

    private void jLabel_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_deleteMouseClicked
        // TODO add your handling code here:
        if (open == 0) {
//            new deleteQuestion().setVisible(true);
            open= 1;
        } else {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "One form was already opened!");
        }
    }//GEN-LAST:event_jLabel_deleteMouseClicked

    private void jLabel_all_resultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_all_resultsMouseClicked
        // TODO add your handling code here:
        if (open == 0) {
//            new allStudentResult().setVisible(true);
            open= 1;
        } else {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "One form was already opened!");
        }
    }//GEN-LAST:event_jLabel_all_resultsMouseClicked

    private void jLabel_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_logoutMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(frame, "Do you really want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_jLabel_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_add;
    private javax.swing.JLabel jLabel_all_question;
    private javax.swing.JLabel jLabel_all_results;
    private javax.swing.JLabel jLabel_delete;
    private javax.swing.JLabel jLabel_logout;
    private javax.swing.JLabel jLabel_update;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
