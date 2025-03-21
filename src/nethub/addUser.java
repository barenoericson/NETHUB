/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nethub;

import config.Session;
import config.connectDB;
import config.passwordHasher;
import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Administrator
 */
public class addUser extends javax.swing.JFrame {

    /**
     * Creates new form UserDashboard
     */
    public addUser() {
        initComponents();
      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        usertype = new javax.swing.JComboBox<>();
        un = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 255));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 30, 83, 92);

        username.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        username.setText("User");
        jPanel1.add(username);
        username.setBounds(70, 110, 75, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Current ID:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 90, 17);

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setText("ID");
        jPanel1.add(id);
        id.setBounds(140, 10, 19, 22);

        jButton4.setBackground(new java.awt.Color(153, 0, 153));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(40, 230, 120, 30);

        add.setBackground(new java.awt.Color(153, 0, 153));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add User");
        add.setBorderPainted(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(40, 150, 120, 30);

        update.setBackground(new java.awt.Color(153, 0, 153));
        update.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setBorderPainted(false);
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(40, 190, 120, 30);

        jButton7.setBackground(new java.awt.Color(153, 0, 153));
        jButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(40, 350, 120, 30);

        jButton8.setBackground(new java.awt.Color(153, 0, 153));
        jButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Cancel");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(40, 270, 120, 30);

        jButton9.setBackground(new java.awt.Color(153, 0, 153));
        jButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Refresh");
        jButton9.setBorderPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(40, 310, 120, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 410));

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add User");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(200, 10, 120, 29);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 530, 60));

        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, 20));

        userid.setEnabled(false);
        getContentPane().add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 200, 30));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 200, 30));

        jLabel5.setText("User ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 200, 30));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, 30));

        password.setText("jPasswordField1");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 200, 30));

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(usertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 30));
        getContentPane().add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 200, 30));

        jLabel6.setText("First Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel7.setText("Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel8.setText("User Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel9.setText("User Type:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jLabel10.setText("Password:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel11.setText("Status:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String First_name = firstname.getText().trim();
String Last_name = lastname.getText().trim();
String Email = email.getText().trim().toLowerCase();
String User_type = usertype.getSelectedItem().toString().trim();
String user_name = un.getText().trim();
String Password = password.getText().trim();

connectDB connect = new connectDB();

if (First_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your First Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Last_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter your Last Name!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Email.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter an Email!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (!Email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
    JOptionPane.showMessageDialog(null, "Please enter a valid Email Address!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (User_type.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please select a User Type!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (user_name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Username!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please enter a Password!", "Error", JOptionPane.WARNING_MESSAGE);
} else if (Password.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!", "Error", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        if (connect.fieldExists("users", "username", user_name)) {
            JOptionPane.showMessageDialog(null, "Username already taken!", "Error", JOptionPane.WARNING_MESSAGE);
        } else if (connect.fieldExists("users", "email", Email)) {
            JOptionPane.showMessageDialog(null, "Email already used!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String hashedPassword = passwordHasher.hashPassword(password.getText());

            String sql = "INSERT INTO users (firstname, lastname, username, email, usertype, password, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            int rowsInserted = connect.insertData(sql, First_name, Last_name, user_name, Email, User_type, hashedPassword, "Pending");

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Registered Successfully!");

                new login().setVisible(true);

                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(un);
                if (frame != null) {
                    frame.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_addActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     Session sess = Session.getInstance();

if (sess == null || sess.getId() <= 0) { // Fix: Proper session validation
    JOptionPane.showMessageDialog(null, "Please Log in First!");

    login l = new login();
    l.setVisible(true);

    Window currentWindow = SwingUtilities.getWindowAncestor(username);
    if (currentWindow != null) {
        currentWindow.dispose(); // Fix: Properly close the current window
    }
} else {
    id.setText(""+sess.getId());
    username.setText(sess.getFirstname()); // Fix: No need for string concatenation
}
    }//GEN-LAST:event_formWindowActivated

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          if (firstname.getText().isEmpty() || lastname.getText().isEmpty() || un.getText().isEmpty() || 
    email.getText().isEmpty() || usertype.getSelectedItem() == null || password.getText().isEmpty() || 
    status.getSelectedItem() == null || userid.getText().isEmpty()) {
    
    JOptionPane.showMessageDialog(null, "All Fields Are Required!");

} else if (password.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long!");
    password.setText("");
    
} else {
    connectDB cdb = new connectDB();
    try {
        try {
            Integer.parseInt(userid.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid User ID!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        boolean usernameExists = cdb.duplicateCheckExcludingCurrent("users", "username", un.getText(), "id", userid.getText());
        boolean emailExists = cdb.duplicateCheckExcludingCurrent("users", "email", email.getText(), "id", userid.getText());

        if (usernameExists || emailExists) {
            JOptionPane.showMessageDialog(null, "Username or Email already exists for another user!", "Validation Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int rowsUpdated = cdb.updateData(
                "UPDATE users SET firstname = ?, lastname = ?, username = ?, email = ?, usertype = ?, password = ?, status = ? WHERE id = ?",
                firstname.getText(),
                lastname.getText(),
                un.getText(),
                email.getText(),
                usertype.getSelectedItem().toString(),
                password.getText(),
                status.getSelectedItem().toString(),
                userid.getText()
            );

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully!");
                
                this.dispose();  
                login loginForm = new login(); 
                loginForm.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Update failed! User ID not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        cdb.closeConnection();
    }
}

    }//GEN-LAST:event_updateActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      UserDashboard ud = new UserDashboard();
      ud.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JTextField email;
    public javax.swing.JTextField firstname;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField lastname;
    public javax.swing.JPasswordField password;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    public javax.swing.JTextField userid;
    private javax.swing.JLabel username;
    public javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
