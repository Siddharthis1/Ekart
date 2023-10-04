
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHUBHAM
 */
public class desc extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
  public desc() {
        initComponents();
    } 
  
   public desc(String jj ,String a,String b,int c ,int d,int e)
   {
        initComponents();
        nameee.setText(jj);
        imgg.setText(b);
   pic.setIcon(new ImageIcon(b));
   item.setText(a);
   price.setText(""+d);
   id.setText(""+e);
   lt.setText(""+c);
     
    
   
    } 
 

   
       
            
            @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pic = new javax.swing.JLabel();
        fdsfdfsdfsfsd = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        quan = new javax.swing.JTextField();
        item = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CO = new javax.swing.JButton();
        tt = new javax.swing.JLabel();
        lt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameee = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imgg = new javax.swing.JLabel();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Samsung Galaxy A9(6 GB RAM +\n128 GB+500GB expandable\n(bluelime,gold)\n\nby Samsung\n");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 780, 10));

        pic.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 250, 280));

        fdsfdfsdfsfsd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        fdsfdfsdfsfsd.setText("Rs.");
        fdsfdfsdfsfsd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(fdsfdfsdfsfsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 40, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addToCart.png"))); // NOI18N
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 180, -1));

        quan.setText("Enter Quantity");
        quan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quanFocusLost(evt);
            }
        });
        quan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanActionPerformed(evt);
            }
        });
        getContentPane().add(quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 180, 30));

        item.setEditable(false);
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });
        getContentPane().add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 180, 30));

        price.setEditable(false);
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, 30));

        jLabel2.setText("item name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 60, 30));

        jLabel3.setText("quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 20));

        jLabel5.setText("price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, 20));

        CO.setBackground(new java.awt.Color(255, 102, 51));
        CO.setText("BUY NOW");
        CO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COActionPerformed(evt);
            }
        });
        getContentPane().add(CO, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 180, 50));

        tt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        tt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 180, 40));

        lt.setEditable(false);
        getContentPane().add(lt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 180, 30));

        jLabel7.setText("Left Items");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, 20));

        id.setEditable(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 180, 30));

        jLabel8.setText("Product ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, 20));

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 120));

        nameee.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        nameee.setText("sid");
        getContentPane().add(nameee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 310, 30));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 780, 40));
        getContentPane().add(imgg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 0, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int qua =Integer.parseInt(quan.getText());
       if(qua==0)
       {
           JOptionPane.showMessageDialog(this,"Enter quantity");
       }
       else
       {
        
         try{
             String jj = nameee.getText();
           int pid =Integer.parseInt(id.getText());
        String nm= item.getText();
     String img = imgg.getText();
        int left = Integer.parseInt(lt.getText());
      
        int pri =Integer.parseInt(price.getText());
             Class.forName("java.sql.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root")
                     ;
             Statement s = con.createStatement();
                    
                     
             String quwey= "insert into cart(id,prod_id,name,image,left_item,price,quantity) values('"+jj+"',"+pid+",'"+nm+"','"+img+"',"+left+","+pri+","+qua+");";
             s.executeUpdate(quwey);
            JOptionPane.showMessageDialog(this,"Item added to Cart");dispose();
             
         }catch(Exception error)
         {
             JOptionPane.showMessageDialog(this,"Connection error");
         }
       
        
        
       }
   
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanActionPerformed
        // TODO add your handling code here:
        int pric= Integer.parseInt(price.getText());
        int qua = Integer.parseInt(quan.getText());
        int tot = pric *  qua;
       tt.setText(""+tot);
        
    }//GEN-LAST:event_quanActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void quanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quanFocusLost
        // TODO add your handling code here:
        int pric= Integer.parseInt(price.getText());
        int qua = Integer.parseInt(quan.getText());
        int tot = pric *  qua;
       tt.setText(""+tot);
        
    }//GEN-LAST:event_quanFocusLost

    private void quanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quanFocusGained
        // TODO add your handling code here:
        quan.setText("");
        
        
    }//GEN-LAST:event_quanFocusGained

    private void COActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COActionPerformed
        // TODO add your handling code here:
      int a=Integer.parseInt(tt.getText());
      new buy(a).setVisible(true);
    }//GEN-LAST:event_COActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
      dispose();
       new HOME1().setVisible(true);
        
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(desc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CO;
    private javax.swing.JLabel fdsfdfsdfsfsd;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imgg;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lt;
    private javax.swing.JLabel nameee;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quan;
    private javax.swing.JLabel tt;
    // End of variables declaration//GEN-END:variables
}
