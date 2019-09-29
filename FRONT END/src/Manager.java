
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hopek
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 36)); // NOI18N
        jLabel1.setText("ZOO MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MANAGER WORK");

        jButton1.setText("MANAGE EMPLOYEES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MANAGE ANIMALS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MANAGE CUSTOMERS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(376, 376, 376))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71)
                .addComponent(jButton2)
                .addGap(92, 92, 92)
                .addComponent(jButton3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(414, 414, 414))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            LOGIN m=new LOGIN();
            m.setVisible(true);
            this.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String[] choices={"Add Employee","Update Employee","Delete Employee","Show all Employees"};
    int response = JOptionPane.showOptionDialog(null, "Which Action Do you Want to Perform?","Manage Employee", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices,null);
    if(response==2)
    {
        String delete;
        delete = JOptionPane.showInputDialog("Enter the Employee Id to delete. ");
       
    String Id="";
    if(delete.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Enter the Employee ID");
        delete = JOptionPane.showInputDialog("Enter the Employee Id to delete. ");
    }
    else
    {try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)
      DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","1234");
            Statement stmt=(Statement) con.createStatement();
      String query="select Emp_id from employee where Emp_id='"+delete+"';";
            ResultSet rs=stmt.executeQuery(query);            
            while(rs.next())
            {Id=rs.getString("Emp_id");
            
            }
            if(delete.equals(Id))
            {
                try
        {
           Class.forName("java.sql.DriverManager");
           Connection con1 = (Connection)
     DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","1234");
    Statement stmt1=(Statement)con.createStatement();   
    String query1="delete from employee where Emp_id='"+delete+"';";
    stmt1.executeUpdate(query1);
    JOptionPane.showMessageDialog(this,"Employee Deleted");
                  LOGIN m=new LOGIN();
                                m.setVisible(true);
                                this.setVisible(false); 
                            
        }
     catch(ClassNotFoundException | SQLException e)
       {
     JOptionPane.showMessageDialog(this,e.getMessage());
          }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Employee ID does not exist");
                delete = JOptionPane.showInputDialog("Enter the Employee Id to delete. ");
            }
            
            }
    catch(ClassNotFoundException | SQLException | HeadlessException e)
    {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }
    }
    else if(response==0)
    {
            add_employee m=new add_employee();
            m.setVisible(true);
            this.setVisible(false);
    }
    else if(response==1)
    {
            update_employee m=new update_employee();
            m.setVisible(true);
            this.setVisible(false);
    }
    else
    {
            employee_table m=new employee_table();
            m.setVisible(true);
            this.setVisible(false);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String[] choices={"Add Animal","Show all Animals Details"};
    int response = JOptionPane.showOptionDialog(null, "Which Action Do you Want to Perform?","Manage Animal", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices,null);
    if(response==0)
    {
            add_animal m=new add_animal();
            m.setVisible(true);
            this.setVisible(false);
    }
    else if(response==1)
    {
        String[] choice={"Animal Details","Diet Details","Health Details"};
        int responses = JOptionPane.showOptionDialog(null, "Which Action Do you Want to Perform?","Manage Animal", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choice,null);
        if(responses==0)
        {
            animal_table m=new animal_table();
            m.setVisible(true);
            this.setVisible(false);
        }
        else if(responses==1)
        {
            diet_table m=new diet_table();
            m.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            health_table m=new health_table();
            m.setVisible(true);
            this.setVisible(false);
        }
    }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String cost = null;
    String[] choices={"Show Customer Details","Show Account"};
    int response = JOptionPane.showOptionDialog(null, "Which Action Do you Want to Perform?","Manage Customers", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, choices,null);
    if(response==1)
    {
    try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)                       
            DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo","root","1234");
            Statement stmt=(Statement) con.createStatement();
            String query="Select sum(Cost) from customer;";         
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())          
            {
                cost=rs.getString("sum(cost)");
            }
            JOptionPane.showMessageDialog(this,"Total Collection is : Rs."+cost);
        }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(this,e.getMessage());
    }
    }
    else
    {
        customer_table m=new customer_table();
        m.setVisible(true);
        this.setVisible(false);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
