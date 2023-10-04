 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHUBHAM
 */
public class cart extends javax.swing.JFrame {

   
  
   public cart(String a)
    {
        initComponents();
        nameee.setText(a);
    
        
      
        
     
       
    }
   
    
             
    
    
    
    public cart() {
        initComponents();
        
        
        DefaultTableModel table = (DefaultTableModel)cart.getModel();
    
      
         try{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root");
String query="Select * from cart where id = '"+nameee.getText()+"';";
Statement s =con.createStatement();

     
ResultSet rs  =s.executeQuery(query);
while(rs.next())
{
    int k = rs.getInt(2);
    String c = rs.getString(3);
int d = rs.getInt(6);
int e = rs.getInt(7);
int sum = d*e;
Object []  o = {k,c,e,d,sum};
table.addRow(o);
}
}

catch(Exception error)
{
JOptionPane.showMessageDialog(this,"Connection Error");
}
          int vv = cart.getRowCount();
        
         int kk= 0;
        for(int i =0;i<vv;i++)
        {
            int  gg = Integer.parseInt(cart.getValueAt(i,4).toString());
            kk=kk+gg;
            tot.setText(kk+"");
        }

    }
    
    
   
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        tot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb = new javax.swing.JComboBox<>();
        n1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nameee = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        na = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Item Name", "Quantity", "Price", "Total "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cartMouseMoved(evt);
            }
        });
        cart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cartKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(cart);
        if (cart.getColumnModel().getColumnCount() > 0) {
            cart.getColumnModel().getColumn(1).setResizable(false);
            cart.getColumnModel().getColumn(2).setResizable(false);
            cart.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 162, 580, 280));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/E kart logo.jpeg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 110));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setText("CHECK OUT");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 130, 50));

        tot.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        tot.setText("TOT");
        getContentPane().add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel4.setText("Rs.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, 40));

        cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 150, -1));

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n1.setText("Enter Quantity");
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 150, 20));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        nameee.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nameee.setText("sid");
        getContentPane().add(nameee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 250, 30));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 100));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 780, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 780, -1));
        getContentPane().add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
          dispose();
       new HOME1().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void cartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cartKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cartKeyPressed

    private void cartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseMoved
        // TODO add your handling code here:
    
    }//GEN-LAST:event_cartMouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();new mod(Integer.parseInt(tot.getText()),nameee.getText()).setVisible(true);

        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    DefaultTableModel table = (DefaultTableModel)cart.getModel();
      int index = cart.getSelectedRow();
      int  b=Integer.parseInt(table.getValueAt(index,0).toString());
     
        int a = cb.getSelectedIndex();
       int q = a+1;
         try{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root");
Statement s =con.createStatement();
String query="Update cart set quantity = "+ q + " where prod_id ="+b+";";
s.executeUpdate(query);
String querytt= "Select  * from cart where id ='"+nameee.getText()+"';";

table.setRowCount(0);
s = con.createStatement();
     
ResultSet rs  =s.executeQuery(querytt);
while(rs.next())
{
    int k = rs.getInt(2);
    String c = rs.getString(3);
int d = rs.getInt(6);
int e = rs.getInt(7);
int sum = d*e;
Object []  o = {k,c,e,d,sum};
table.addRow(o);
}
}

catch(Exception error)
{
JOptionPane.showMessageDialog(this,"Connection Error");
}
          int vv = cart.getRowCount();
        
         int kk= 0;
        for(int i =0;i<vv;i++)
        {
            int  gg = Integer.parseInt(cart.getValueAt(i,4).toString());
            kk=kk+gg;
            tot.setText(kk+"");
        }
         
         

         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)cart.getModel();
       int a =  cart.getSelectedRow();
int id = Integer.parseInt(table.getValueAt(a,0).toString());
     
        try{
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root");
            Statement s  = con.createStatement();
            
            String qurey= "delete from cart where prod_id = "+id +" and id ='"+nameee.getText()+"';";
            s.executeUpdate(qurey);
            table.setRowCount(0);
            String query="Select * from cart where id = '"+nameee.getText()+"';";
        ResultSet rs  =s.executeQuery(query);
while(rs.next())
{
    int k = rs.getInt(2);
    String c = rs.getString(3);
int d = rs.getInt(6);
int e = rs.getInt(7);
int sum = d*e;
Object []  o = {k,c,e,d,sum};
table.addRow(o);
}
        }catch(Exception error)
        {
            JOptionPane.showMessageDialog(this,"Connection error");
        }
            

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
          DefaultTableModel table = (DefaultTableModel)cart.getModel();
      int index = cart.getSelectedRow();
      int  b=Integer.parseInt(table.getValueAt(index,0).toString());
     
        int a = cb.getSelectedIndex();
       int q = a+1;
         try{
Class.forName("java.sql.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root");
Statement s =con.createStatement();
String query="Update cart set quantity = "+ q + " where prod_id ="+b+";";
s.executeUpdate(query);
String querytt= "Select  * from cart where id ='"+nameee.getText()+"';";

table.setRowCount(0);
s = con.createStatement();
     
ResultSet rs  =s.executeQuery(querytt);
while(rs.next())
{
    int k = rs.getInt(2);
    String c = rs.getString(3);
int d = rs.getInt(6);
int e = rs.getInt(7);
int sum = d*e;
Object []  o = {k,c,e,d,sum};
table.addRow(o);
}
}

catch(Exception error)
{
JOptionPane.showMessageDialog(this,"Connection Error");
}
          int vv = cart.getRowCount();
        
         int kk= 0;
        for(int i =0;i<vv;i++)
        {
            int  gg = Integer.parseInt(cart.getValueAt(i,4).toString());
            kk=kk+gg;
            tot.setText(kk+"");
        }
    }//GEN-LAST:event_jPanel4MouseDragged

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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cart;
    private javax.swing.JComboBox<String> cb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel na;
    private javax.swing.JLabel nameee;
    private javax.swing.JLabel tot;
    // End of variables declaration//GEN-END:variables
}
