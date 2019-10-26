//imports
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//kg
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hopek
 */
public class Cashier extends javax.swing.JFrame {

    /**
     * Creates new form Cashier_
     */
    public Cashier() {
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

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tf5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Tag ID");

        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tf1.setEnabled(false);

        jLabel6.setText("Date");

        tf4.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setText("ZOO MANAGEMENT SYSTEM");

        jLabel7.setText("Adult Count");

        tf5.setText("0");
        tf5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf5FocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CASHIER");

        jLabel8.setText("Child Count");

        jLabel3.setText("Name ");

        tf6.setText("0");
        tf6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf6FocusLost(evt);
            }
        });

        tf2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf2FocusGained(evt);
            }
        });

        jLabel9.setText("COST");

        jLabel4.setText("Contact");

        tf7.setText("0");
        tf7.setEnabled(false);

        tf3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf3FocusLost(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(376, 376, 376))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(tf2)
                            .addComponent(tf1)))
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf6)
                            .addComponent(tf5)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      LOGIN m=new LOGIN();
    m.setVisible(true);
    this.setVisible(false); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusLost
    String no=tf5.getText();
    int total=Integer.parseInt(tf7.getText());
    int adult=0;
    if(no.isEmpty())
    {
        JOptionPane.showMessageDialog(this,"The adult count is by default set to 0 or else enter it.");
        tf5.setText("0");
    }
    else
    {
    boolean numeric = true;
        try {
            Double num = Double.parseDouble(no);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
        { adult=Integer.parseInt(no);
            total=total+(50*adult);
            tf7.setText(""+total);
        }
            else
        {
            JOptionPane.showMessageDialog(this,"Enter a number.");
            tf5.setText("0");
            adult=Integer.parseInt(no);
            total=total+(50*adult);
            tf7.setText(""+total);
        }   
    }
    }//GEN-LAST:event_tf5FocusLost

    private void tf6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusLost
    String no=tf6.getText();
    int total=Integer.parseInt(tf7.getText());
    int child=0;
    if(no.isEmpty())
    {
        JOptionPane.showMessageDialog(this,"The Child count is by default set to 0 or else enter it.");
        tf6.setText("0");
    }
    else
    {
    boolean numeric = true;
        try {
            Double num = Double.parseDouble(no);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric)
        { child=Integer.parseInt(no);
            total=total+(30*child);
            tf7.setText(""+total);
        }
            else
        {
            JOptionPane.showMessageDialog(this,"Enter a number.");
            tf5.setText("0");
            child=Integer.parseInt(no);
            total=total+(30*child);
            tf7.setText(""+total);
        }   
    }
    }//GEN-LAST:event_tf6FocusLost

    private void tf2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf2FocusGained
    int id=0;
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)                       
            DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","1234");
            Statement stmt=(Statement) con.createStatement();
            String query="Select max(Tag_id) from customer;";         
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())          
         {
        
             id=rs.getInt("max(Tag_id)");
         }
            id = id+1;
            tf1.setText(Integer.toString(id));}
            catch(ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(this,e.getMessage());
        }

        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
         java.util.Date sysdate=new java.util.Date();
        tf4.setText(dateFormat.format(sysdate));

    }//GEN-LAST:event_tf2FocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name=tf2.getText();
    String contact=tf3.getText();
    String tag=tf1.getText();
    String date=tf4.getText();
    String adult=tf5.getText();
    String child=tf6.getText();
    String cost=tf7.getText();
    if(name.isEmpty()||contact.isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Please enter all the details properly.");
        tf2.setText("");
        tf3.setText("");
        tf5.setText("0");
        tf6.setText("0");
        tf5.setEnabled(true);
        tf6.setEnabled(true);
        tf7.setText("");
    }
    else
    {
    
      try
        {
           Class.forName("java.sql.DriverManager");
           Connection con = (Connection)
     DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","1234");
    Statement stmt=(Statement)con.createStatement();   
    String query="Insert Into customer values ('"+tag+"','"+name+"','"+contact+"','"+date+"','"+adult+"','"+child+"','"+cost+"');";
    stmt.executeUpdate(query);
    JOptionPane.showMessageDialog(this,"Welcome to ZOO"+"\n"+"Your Tag ID is : "+tag);
    int choice=JOptionPane.showConfirmDialog(this,"Do You want to add more details","Confirm",JOptionPane.YES_NO_OPTION);
                            if(choice==0)
                            {
                                tf2.setText("");
                                tf3.setText("");
                                tf5.setText("0");
                                tf6.setText("0");
                                tf5.setEnabled(true);
                                tf6.setEnabled(true);
                                tf7.setText("0");
                            }
                            else
                            {
                                LOGIN m=new LOGIN();
                                m.setVisible(true);
                                this.setVisible(false); 
                            }
        }
     catch(ClassNotFoundException | SQLException e)
       {
     JOptionPane.showMessageDialog(this,e.getMessage());
          }
    }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf3FocusLost
    int L=tf3.getText().length();
    String no=tf3.getText();
    if(L==10)
    {
         boolean numeric = true;
        try {
            Double num = Double.parseDouble(no);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        if(numeric){}
                 else
            JOptionPane.showMessageDialog(this,"Please enter a valid mobile number");
    }
    else
    {JOptionPane.showMessageDialog(this,"Please enter a valid mobile number");
    tf3.setText("");}
   
    }//GEN-LAST:event_tf3FocusLost

    private void tf5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf5FocusGained
    int total=Integer.parseInt(tf7.getText());
    int adult=Integer.parseInt(tf5.getText());
     total=total-(50*adult);
     tf7.setText(""+total);   
    
    }//GEN-LAST:event_tf5FocusGained

    private void tf6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf6FocusGained
    int total=Integer.parseInt(tf7.getText());
    int adult=Integer.parseInt(tf6.getText());
     total=total-(30*adult);
     tf7.setText(""+total);
    }//GEN-LAST:event_tf6FocusGained

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
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
