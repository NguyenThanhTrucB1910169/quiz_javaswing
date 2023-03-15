/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class addQuestion extends javax.swing.JFrame {

    /**
     * Creates new form addQuestion
     */
    public addQuestion() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
//            Connection con = ConnectionProvider.getCon();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "12345abcabc@");
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);//Notice, this line may be throw sql exception 
            //Thêm dữ liệu vào cuối bảng
            ResultSet rs = st.executeQuery("select count(id) from question");
            if (rs.first()) {
                int id = rs.getInt(1);
                id += 1;
                String str = String.valueOf(id);
                jLabel_id_question.setText(str);
            } else {
                jLabel_id_question.setText("1");//bảng chưa có câu hỏi nào
            }
        } catch (SQLException e) {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_op3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_op2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_op1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ques = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_ans = new javax.swing.JTextField();
        jButton_clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_op4 = new javax.swing.JTextField();
        jLabel_id_question = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 600));

        jPanel2.setForeground(new java.awt.Color(242, 242, 242));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 600));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("ID Câu Hỏi");

        jTextField_op3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_op3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jTextField_op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_op3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText("Question:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Đáp án A:");

        jTextField_op2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_op2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Đáp án C:");

        jTextField_op1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_op1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Đáp án D:");

        jTextField_ques.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_ques.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));
        jTextField_ques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_quesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Trả lời:");

        jTextField_ans.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_ans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        jButton_clear.setBackground(new java.awt.Color(255, 153, 0));
        jButton_clear.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton_clear.setForeground(new java.awt.Color(255, 255, 255));
        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Đáp án B:");

        jTextField_op4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextField_op4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 2));

        jLabel_id_question.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel_id_question.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_id_question.setText("00");

        jButton_save.setBackground(new java.awt.Color(255, 153, 0));
        jButton_save.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_op3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_op4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_op2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_ques, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_op1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel_id_question, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286)
                .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel_id_question))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_clear)
                    .addComponent(jButton_save))
                .addGap(15, 15, 15))
        );

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Add New Question");

        Admin.setBackground(new java.awt.Color(248, 148, 6));
        Admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Documents\\NetbeanProjects\\QUIZ\\QUIZ\\src\\home.jpg")); // NOI18N
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Admin)
                .addGap(135, 135, 135)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_op3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_op3ActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
        jTextField_op1.setText("");
        jTextField_op2.setText("");
        jTextField_op3.setText("");
        jTextField_op4.setText("");
        jTextField_ques.setText("");
        jTextField_ans.setText("");
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        String id = jLabel_id_question.getText();
        String name = jTextField_ques.getText();
        String opt1 = jTextField_op1.getText();
        String opt2 = jTextField_op2.getText();
        String opt3 = jTextField_op3.getText();
        String opt4 = jTextField_op4.getText();
        String answer = jTextField_ans.getText();
        try {
//            Connection con = ConnectionProvider.getCon();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "032962672203296");
            PreparedStatement ps = con.prepareStatement("insert into question values (?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, opt1);
            ps.setString(4, opt2);
            ps.setString(5, opt3);
            ps.setString(6, opt4);
            ps.setString(7, answer);
            ps.executeUpdate();
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, "Successfully Added!");
            setVisible(false);
            new addQuestion().setVisible(true);
        } catch (SQLException e) {
            JFrame frame = new JFrame();
            frame.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(frame, e);
        }
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jTextField_quesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_quesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_quesActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
            new adminHome().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_AdminActionPerformed

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
            java.util.logging.Logger.getLogger(addQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_id_question;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_ans;
    private javax.swing.JTextField jTextField_op1;
    private javax.swing.JTextField jTextField_op2;
    private javax.swing.JTextField jTextField_op3;
    private javax.swing.JTextField jTextField_op4;
    private javax.swing.JTextField jTextField_ques;
    // End of variables declaration//GEN-END:variables
}
