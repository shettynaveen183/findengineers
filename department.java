
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen
 */
public class department extends javax.swing.JFrame {

    /**
     * Creates new form department
     */
    public department() {
        initComponents();
        Fillcombo2();
    }
     public void Fillcombo2() {
           try {  
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // establish connection  
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","SYS");   
String sql="SELECT * FROM engineers";
Statement stmt=con.createStatement();
stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
while(rs.next()) {
    jComboBox1.addItem(rs.getString("ENG_ID"));
}
}
           catch( ClassNotFoundException | SQLException e){ System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("DEPARTMENT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 10, 200, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("DEPARTMENT ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 110, 120, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("COLLEGE NAME");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 150, 150, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("DEPARTMENT NAME");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 190, 150, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("YEAR OF PASSOUT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 230, 140, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(320, 110, 310, 20);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(320, 150, 310, 20);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(320, 190, 310, 20);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(320, 230, 310, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ENG_ID", "DEPARTMENT  ID", "COLLEGE NAME", "DEPARTMENT NAME", "YEAR OF PASSOUT"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 280, 590, 120);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("INSERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 420, 110, 25);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("DISPLAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(160, 420, 110, 25);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 0, 51));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(300, 420, 120, 25);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 0, 51));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(470, 420, 87, 25);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 0, 51));
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(600, 420, 73, 25);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(320, 60, 56, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("ENGINEER ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 70, 120, 17);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 1200, 686);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {  
       Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // establish connection  
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","SYS");  
        Statement statement = con.createStatement();  
        statement.executeUpdate("INSERT INTO department VALUES("+jComboBox1.getSelectedItem()+","+jTextField2.getText()+",'"+jTextField3.getText()+"','" + jTextField4.getText() + "',"+jTextField5.getText()+")");  
        JOptionPane.showMessageDialog(null, "Record inserted...");  
        statement.close();  
        con.close();  
      //  Referesh(); //Calling Referesh() method  
    } catch (SQLException | ClassNotFoundException e) {  
        JOptionPane.showMessageDialog(null, e);  
    }
          
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {  
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // establish connection  
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","SYS");   
String sql="SELECT * FROM department";
Statement stmt=con.createStatement();
stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
//STEP 5: Extract data from result set
jTable1.setModel(DbUtils.resultSetToTableModel(rs));
rs.close();
}
//step5 close the connection object
catch( ClassNotFoundException | SQLException e){ System.out.println(e);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {  
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // establish connection  
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","SYS");  
        Statement stmt = con.createStatement();  
        stmt.execute("UPDATE department SET ENG_ID="+jComboBox1.getSelectedItem()+",COLLEGE_NAME='"+jTextField3.getText()+"',DEPT_NAME='"+jTextField4.getText()+"',YEAR_OF_PASSOUT="+jTextField5.getText()+" WHERE DEPT_NO=" + jTextField2.getText() + " ");  
        JOptionPane.showMessageDialog(null, "Record is updated...");  
        stmt.close();  
        con.close();  
        //Referesh(); //Calling Referesh() method  
    } catch (SQLException | ClassNotFoundException se) {  
        JOptionPane.showMessageDialog(null, se);  
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
  try {  
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        // establish connection  
        Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","SYS");  
        Statement stmt = con.createStatement();  
        stmt.executeUpdate("DELETE FROM department WHERE DEPT_NO=" + jTextField2.getText() +"");  
        JOptionPane.showMessageDialog(null, "Record deleted...");
        stmt.close();  	
        con.close();  
        //Referesh(); //Calling Referesh() method  
    } 
     catch (SQLException | ClassNotFoundException se) {  
        JOptionPane.showMessageDialog(null, se);  
    }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 new MENU().setVisible(true);dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int selectedRow=jTable1.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
       jComboBox1.setSelectedItem(model.getValueAt(selectedRow,0).toString());
        jTextField2.setText(model.getValueAt(selectedRow,1).toString());
         jTextField3.setText(model.getValueAt(selectedRow,2).toString());
          jTextField4.setText(model.getValueAt(selectedRow,3).toString());
           jTextField5.setText(model.getValueAt(selectedRow,4).toString());
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(department.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new department().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
