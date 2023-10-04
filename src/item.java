/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */import java.sql.*;
import static javax.management.remote.JMXConnectorFactory.connect;
 import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class item extends javax.swing.JFrame {

    /**
     * Creates new form item
     */
    public item() {
        initComponents();
    }
    public item(String text)
    {
        initComponents();
        int a ;
      s1.setText(text);
        try{
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root")
                    ;
            Statement s =con.createStatement();
            String query ="Select * from products where type ='"+text+"';";
            ResultSet rs= s.executeQuery(query);
            DefaultTableModel table= (DefaultTableModel)tab1.getModel();
         while(rs.next())
          {
           String pid = rs.getString(1);
           String nm = rs.getString(3);
         int cst =Integer.parseInt(rs.getString(4));
         String img = rs.getString(5);
           int lt = Integer.parseInt(rs.getString(6));
           Object [] o  = {pid,nm,cst,img,lt};
           table.addRow(o);
          }
         
        }catch(Exception error)
        {
          JOptionPane.showMessageDialog(this,"Connection error");  
        } DefaultTableModel table= (DefaultTableModel)tab1.getModel();
        int row  = tab1.getRowCount();System.out.println(""+row);
        
        l1.setText("");l2.setText("");l3.setText("");l4.setText("");l5.setText("");l6.setText("");l7.setText("");l8.setText("");l9.setText("");
        id1.setText("");id2.setText("");id3.setText("");id4.setText("");id5.setText("");id6.setText("");id7.setText("");id8.setText("");id9.setText("");
        i1.setText("");i2.setText("");i3.setText("");i4.setText("");i5.setText("");i6.setText("");i7.setText("");i8.setText("");i9.setText("");
        n1.setText(""); n2.setText(""); n3.setText(""); n4.setText(""); n5.setText(""); n6.setText(""); n7.setText(""); n8.setText(""); n9.setText("");
        p1.setText("");p2.setText("");p3.setText("");p4.setText("");p5.setText("");p6.setText("");p7.setText("");p8.setText("");p9.setText("");
        if(row == 0)
        {
            JOptionPane.showMessageDialog(this,"No search result");
            dispose();
        }
        if(row == 1)
        {
                
   id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
    
        i2.setEnabled(false);i3.setEnabled(false);i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
        l2.setEnabled(false);l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
        id2.setEnabled(false);id3.setEnabled(false);id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
        n2.setEnabled(false); n3.setEnabled(false); n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p2.setEnabled(false); p3.setEnabled(false); p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
        if(row == 2)
        {
             id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
      i3.setEnabled(false);i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
       l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
       id3.setEnabled(false);id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
       n3.setEnabled(false); n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p3.setEnabled(false); p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
        
        if(row ==3)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
        
       i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
      l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
      id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
   n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==4)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
         id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+"");
     
       i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
   l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
    id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
    n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==5)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
         
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
       i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
 l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
 id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
   n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
      p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==6)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
    
          i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
 l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
    n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
    p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
                if(row ==7)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
     
        i8.setEnabled(false);i9.setEnabled(false);
 l8.setEnabled(false);l9.setEnabled(false);
id8.setEnabled(false);id9.setEnabled(false);
    n8.setEnabled(false); n9.setEnabled(false);
   p8.setEnabled(false); p9.setEnabled(false);
        }
          if(row ==8)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         
        id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
        
        id8.setText(table.getValueAt(8,0).toString());
   n8.setText(table.getValueAt(8,1).toString());
   p8.setText(Integer.parseInt(table.getValueAt(8,2).toString())+"");
        i8.setIcon(new ImageIcon(table.getValueAt(8,3).toString()));
        l8.setText(Integer.parseInt(table.getValueAt(8,4).toString())+"");
     
        i9.setEnabled(false);
 l9.setEnabled(false);
id9.setEnabled(false);
    n9.setEnabled(false);
    p9.setEnabled(false);
        }
           if(row ==9)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         
        id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
        
        id8.setText(table.getValueAt(8,0).toString());
   n8.setText(table.getValueAt(8,1).toString());
   p8.setText(Integer.parseInt(table.getValueAt(8,2).toString())+"");
        i8.setIcon(new ImageIcon(table.getValueAt(8,3).toString()));
        l8.setText(Integer.parseInt(table.getValueAt(8,4).toString())+"");
        
        id9.setText(table.getValueAt(9,0).toString());
   n9.setText(table.getValueAt(9,1).toString());
   p9.setText(Integer.parseInt(table.getValueAt(9,2).toString())+"");
        i9.setIcon(new ImageIcon(table.getValueAt(9,3).toString()));
        l9.setText(Integer.parseInt(table.getValueAt(9,4).toString())+"");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        cb6 = new javax.swing.JComboBox<>();
        i1 = new javax.swing.JLabel();
        i2 = new javax.swing.JLabel();
        n1 = new javax.swing.JLabel();
        i3 = new javax.swing.JLabel();
        i4 = new javax.swing.JLabel();
        i5 = new javax.swing.JLabel();
        i6 = new javax.swing.JLabel();
        i7 = new javax.swing.JLabel();
        i8 = new javax.swing.JLabel();
        i9 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        n3 = new javax.swing.JLabel();
        n4 = new javax.swing.JLabel();
        n5 = new javax.swing.JLabel();
        n6 = new javax.swing.JLabel();
        n7 = new javax.swing.JLabel();
        n8 = new javax.swing.JLabel();
        n9 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        id6 = new javax.swing.JLabel();
        id7 = new javax.swing.JLabel();
        id8 = new javax.swing.JLabel();
        id9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        nameee = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        s1 = new javax.swing.JTextField();
        sb = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1360, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Phones and Accesories", "Smart Phones", "Featured Phones", "Earphones", "Headphones", "I Phone" }));
        cb1.setToolTipText("");
        cb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cb1MouseEntered(evt);
            }
        });
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camera & Accesories", "DSLR cameras", "HDR cameras", "Digital Cameras", "Camera Lens" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Accesories", "Watch", "Smart Watch", "Shavers & trimmers" }));
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HouseHold Items", "T.V.", "Radio", "Table Lamp" }));
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computers & Laptop Accesories", "Laptop", "C.P.U.", "Mouse", "Keyboard", "Speaker", "RAM", "UPS", "Pen Drive", "Gaming Laptop", "Gaming Mouse", "Gaming Keyboard" }));
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        cb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kitchen Accesories", "Mixers & Grinders", "Food Processor", "Microwave", "Induction", "Hand Mixers" }));
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1341, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 252, Short.MAX_VALUE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)
                    .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 253, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        i1.setBackground(new java.awt.Color(255, 255, 255));
        i1.setText("Image");
        i1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i1MouseClicked(evt);
            }
        });
        jPanel1.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 130, 130));

        i2.setBackground(new java.awt.Color(255, 255, 255));
        i2.setText("image");
        i2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i2MouseClicked(evt);
            }
        });
        jPanel1.add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 381, 130, 130));

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n1.setText("name");
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n1MouseClicked(evt);
            }
        });
        jPanel1.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 626, 30));

        i3.setBackground(new java.awt.Color(255, 255, 255));
        i3.setText("image");
        i3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i3MouseClicked(evt);
            }
        });
        jPanel1.add(i3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 522, 130, 130));

        i4.setBackground(new java.awt.Color(255, 255, 255));
        i4.setText("image");
        i4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i4MouseClicked(evt);
            }
        });
        jPanel1.add(i4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 663, 130, 130));

        i5.setBackground(new java.awt.Color(255, 255, 255));
        i5.setText("image");
        i5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i5MouseClicked(evt);
            }
        });
        jPanel1.add(i5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 804, 130, 130));

        i6.setBackground(new java.awt.Color(255, 255, 255));
        i6.setText("image");
        i6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i6MouseClicked(evt);
            }
        });
        jPanel1.add(i6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 945, 130, 130));

        i7.setBackground(new java.awt.Color(255, 255, 255));
        i7.setText("image");
        i7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i7MouseClicked(evt);
            }
        });
        jPanel1.add(i7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1086, 130, 130));

        i8.setBackground(new java.awt.Color(255, 255, 255));
        i8.setText("image");
        i8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i8MouseClicked(evt);
            }
        });
        jPanel1.add(i8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1222, 130, 131));

        i9.setBackground(new java.awt.Color(255, 255, 255));
        i9.setText("image");
        i9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i9MouseClicked(evt);
            }
        });
        jPanel1.add(i9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1371, 130, 131));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n2.setText("name");
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n2MouseClicked(evt);
            }
        });
        jPanel1.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 381, 626, -1));

        n3.setBackground(new java.awt.Color(255, 255, 255));
        n3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n3.setText("name");
        n3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n3MouseClicked(evt);
            }
        });
        jPanel1.add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 522, 626, -1));

        n4.setBackground(new java.awt.Color(255, 255, 255));
        n4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n4.setText("name");
        n4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n4MouseClicked(evt);
            }
        });
        jPanel1.add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 663, 626, -1));

        n5.setBackground(new java.awt.Color(255, 255, 255));
        n5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n5.setText("name");
        n5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n5MouseClicked(evt);
            }
        });
        jPanel1.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 804, 626, -1));

        n6.setBackground(new java.awt.Color(255, 255, 255));
        n6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n6.setText("name");
        n6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n6MouseClicked(evt);
            }
        });
        jPanel1.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 945, 626, -1));

        n7.setBackground(new java.awt.Color(255, 255, 255));
        n7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n7.setText("name");
        n7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n7MouseClicked(evt);
            }
        });
        jPanel1.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 1086, 626, -1));

        n8.setBackground(new java.awt.Color(255, 255, 255));
        n8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n8.setText("name");
        n8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n8MouseClicked(evt);
            }
        });
        jPanel1.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1222, 626, -1));

        n9.setBackground(new java.awt.Color(255, 255, 255));
        n9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        n9.setText("name");
        n9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                n9MouseClicked(evt);
            }
        });
        jPanel1.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1371, 626, -1));

        p1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p1.setText("price");
        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 284, 91, 22));

        p2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p2.setText("price");
        jPanel1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 419, 91, 22));

        p3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p3.setText("price");
        jPanel1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 701, 91, 22));

        p4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p4.setText("price");
        jPanel1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 560, 91, 22));

        p5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p5.setText("price");
        jPanel1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 842, 91, 22));

        p6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p6.setText("price");
        jPanel1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 983, 91, 22));

        p7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p7.setText("price");
        jPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 1124, 91, 22));

        p8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p8.setText("price");
        jPanel1.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1260, 91, 22));

        p9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        p9.setText("price");
        jPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 1409, 91, 22));

        l1.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l1.setText("items");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 359, 71, -1));

        l2.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l2.setText("items");
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 495, 71, -1));

        l3.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l3.setText("items");
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 636, 71, -1));

        l4.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l4.setText("items");
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 777, 71, -1));

        l5.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l5.setText("items");
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 918, 71, -1));

        l6.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l6.setText("items");
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 1059, 71, -1));

        l7.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l7.setText("items");
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 1192, 71, -1));

        l8.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l8.setText("items");
        jPanel1.add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 1337, 71, -1));

        l9.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        l9.setText("items");
        jPanel1.add(l9, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 1486, 71, -1));

        id1.setText("id");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 339, 50, -1));

        id2.setText("id");
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 475, 50, -1));

        id3.setText("id");
        jPanel1.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 616, 50, -1));

        id4.setText("id");
        jPanel1.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 757, 50, -1));

        id5.setText("id");
        jPanel1.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 898, 50, -1));

        id6.setText("id");
        jPanel1.add(id6, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 1039, 50, -1));

        id7.setText("id");
        jPanel1.add(id7, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 1167, 50, -1));

        id8.setText("id");
        jPanel1.add(id8, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 1317, 50, -1));

        id9.setText("id");
        jPanel1.add(id9, new org.netbeans.lib.awtextra.AbsoluteConstraints(777, 1466, 50, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/E kart logo.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 80));

        jPanel8.setBackground(new java.awt.Color(0, 255, 255));

        nameee.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        nameee.setText("sid");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_16x16.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account 2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(nameee, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 950, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(nameee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1360, 120));

        s1.setText("What are you looking for.....");
        s1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                s1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                s1FocusLost(evt);
            }
        });
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        sb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });
        jPanel1.add(sb, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 20, 20));

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1350, 40));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 701));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "prod_id", "name", "cost", "image", "left_item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab1);
        if (tab1.getColumnModel().getColumnCount() > 0) {
            tab1.getColumnModel().getColumn(0).setResizable(false);
            tab1.getColumnModel().getColumn(2).setResizable(false);
            tab1.getColumnModel().getColumn(3).setResizable(false);
            tab1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 719, -1, 23));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1MouseEntered

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        String a=(String)cb1.getSelectedItem();
        s1.setText(a);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
        String a=(String)cb2.getSelectedItem();
        s1.setText(a);
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        String a=(String)cb5.getSelectedItem();
        s1.setText(a);        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        String a=(String)cb3.getSelectedItem();
        s1.setText(a);
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        String a=(String)cb4.getSelectedItem();
        s1.setText(a);        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        String a=(String)cb6.getSelectedItem();
        s1.setText(a);        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void s1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s1FocusGained
        // TODO add your handling code here:
    s1.setText("");
    }//GEN-LAST:event_s1FocusGained

    private void s1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_s1FocusLost

    private void i1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n1.getText();
         String img =  table.getValueAt(0,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l1.getText());
         int price = Integer.parseInt(p1.getText());
         int id = Integer.parseInt(id1.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
         
         
    }//GEN-LAST:event_i1MouseClicked

    private void n1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseClicked
        // TODO add your handling code here:
      
          DefaultTableModel table = (DefaultTableModel)tab1.getModel();
      String jj = nameee.getText();  
         String nm = n1.getText();
         String img =  table.getValueAt(0,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l1.getText());
         int price = Integer.parseInt(p1.getText());
         int id = Integer.parseInt(id1.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n1MouseClicked

    private void i2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i2MouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n2.getText();
         String img =  table.getValueAt(1,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l2.getText());
         int price = Integer.parseInt(p2.getText());
         int id = Integer.parseInt(id2.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i2MouseClicked

    private void n2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n2.getText();
         String img =  table.getValueAt(1,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l2.getText());
         int price = Integer.parseInt(p2.getText());
         int id = Integer.parseInt(id2.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n2MouseClicked

    private void i3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i3MouseClicked
        // TODO add your handling code here:
        
          DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n3.getText();
         String img =  table.getValueAt(2,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l3.getText());
         int price = Integer.parseInt(p3.getText());
         int id = Integer.parseInt(id3.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i3MouseClicked

    private void n3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n3MouseClicked
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n3.getText();
         String img =  table.getValueAt(2,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l3.getText());
         int price = Integer.parseInt(p3.getText());
         int id = Integer.parseInt(id3.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n3MouseClicked

    private void i4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i4MouseClicked
        // TODO add your handling code here:
        
        
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n4.getText();
         String img =  table.getValueAt(3,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l4.getText());
         int price = Integer.parseInt(p4.getText());
         int id = Integer.parseInt(id4.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i4MouseClicked

    private void n4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n4MouseClicked
        // TODO add your handling code here:
        
         String jj = nameee.getText();
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
        
         String nm = n4.getText();
         String img =  table.getValueAt(3,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l4.getText());
         int price = Integer.parseInt(p4.getText());
         int id = Integer.parseInt(id4.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n4MouseClicked

    private void i5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i5MouseClicked
        // TODO add your handling code here:
        
        
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n5.getText();
         String img =  table.getValueAt(4,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l5.getText());
         int price = Integer.parseInt(p5.getText());
         int id = Integer.parseInt(id5.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i5MouseClicked

    private void n5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n5MouseClicked
        // TODO add your handling code here:
        
        
        
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n5.getText();
         String img =  table.getValueAt(4,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l5.getText());
         int price = Integer.parseInt(p5.getText());
         int id = Integer.parseInt(id5.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n5MouseClicked

    private void i6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i6MouseClicked
        // TODO add your handling code here:
        
        
         DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n6.getText();
         String img =  table.getValueAt(5,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l6.getText());
         int price = Integer.parseInt(p6.getText());
         int id = Integer.parseInt(id6.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i6MouseClicked

    private void n6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n6MouseClicked
        // TODO add your handling code here:
         String jj = nameee.getText();
            DefaultTableModel table = (DefaultTableModel)tab1.getModel();
        
         String nm = n6.getText();
         String img =  table.getValueAt(5,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l6.getText());
         int price = Integer.parseInt(p6.getText());
         int id = Integer.parseInt(id6.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n6MouseClicked

    private void i7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i7MouseClicked
        // TODO add your handling code here:
            DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n7.getText();
         String img =  table.getValueAt(6,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l7.getText());
         int price = Integer.parseInt(p7.getText());
         int id = Integer.parseInt(id7.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i7MouseClicked

    private void n7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n7MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n7.getText();
         String img =  table.getValueAt(6,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l7.getText());
         int price = Integer.parseInt(p7.getText());
         int id = Integer.parseInt(id7.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n7MouseClicked

    private void i8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i8MouseClicked
        // TODO add your handling code here:
         String jj = nameee.getText();
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
        
         String nm = n8.getText();
         String img =  table.getValueAt(7,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l8.getText());
         int price = Integer.parseInt(p8.getText());
         int id = Integer.parseInt(id8.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i8MouseClicked

    private void n8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n8MouseClicked
        // TODO add your handling code here:
            
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n8.getText();
         String img =  table.getValueAt(7,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l8.getText());
         int price = Integer.parseInt(p8.getText());
         int id = Integer.parseInt(id8.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n8MouseClicked

    private void i9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i9MouseClicked
        // TODO add your handling code here:
        
        
            
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n9.getText();
         String img =  table.getValueAt(8,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l9.getText());
         int price = Integer.parseInt(p9.getText());
         int id = Integer.parseInt(id9.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_i9MouseClicked

    private void n9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n9MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)tab1.getModel();
         String jj = nameee.getText();
         String nm = n9.getText();
         String img =  table.getValueAt(8,3).toString();
        System.out.println(""+img);
         int lt= Integer.parseInt(l9.getText());
         int price = Integer.parseInt(p9.getText());
         int id = Integer.parseInt(id9.getText());
         new desc(jj,nm,img,lt,price,id).setVisible(true);
    }//GEN-LAST:event_n9MouseClicked

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        // TODO add your handling code here:
      
        String text  = s1.getText();
        s1.setText(text);
        try{
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root")
                    ;
            Statement s =con.createStatement();
            String query ="Select * from products where type ='"+text+"';";
            ResultSet rs= s.executeQuery(query);
            DefaultTableModel table= (DefaultTableModel)tab1.getModel();
         while(rs.next())
          {
           String pid = rs.getString(1);
           String nm = rs.getString(3);
         int cst =Integer.parseInt(rs.getString(4));
         String img = rs.getString(5);
           int lt = Integer.parseInt(rs.getString(6));
           Object [] o  = {pid,nm,cst,img,lt};
           table.addRow(o);
          }
         
        }catch(Exception error)
        {
          JOptionPane.showMessageDialog(this,"Connection error");  
        } DefaultTableModel table= (DefaultTableModel)tab1.getModel();
        int row  = tab1.getRowCount();System.out.println(""+row);
        
        l1.setText("");l2.setText("");l3.setText("");l4.setText("");l5.setText("");l6.setText("");l7.setText("");l8.setText("");l9.setText("");
        id1.setText("");id2.setText("");id3.setText("");id4.setText("");id5.setText("");id6.setText("");id7.setText("");id8.setText("");id9.setText("");
        i1.setText("");i2.setText("");i3.setText("");i4.setText("");i5.setText("");i6.setText("");i7.setText("");i8.setText("");i9.setText("");
        n1.setText(""); n2.setText(""); n3.setText(""); n4.setText(""); n5.setText(""); n6.setText(""); n7.setText(""); n8.setText(""); n9.setText("");
        p1.setText("");p2.setText("");p3.setText("");p4.setText("");p5.setText("");p6.setText("");p7.setText("");p8.setText("");p9.setText("");
        if(row == 0)
        {
            JOptionPane.showMessageDialog(this,"No search result");
            dispose();
        }
        if(row == 1)
        {
                
   id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
    
        i2.setEnabled(false);i3.setEnabled(false);i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
        l2.setEnabled(false);l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
        id2.setEnabled(false);id3.setEnabled(false);id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
        n2.setEnabled(false); n3.setEnabled(false); n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p2.setEnabled(false); p3.setEnabled(false); p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
        if(row == 2)
        {
             id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
      i3.setEnabled(false);i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
       l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
       id3.setEnabled(false);id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
       n3.setEnabled(false); n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p3.setEnabled(false); p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
        
        if(row ==3)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
        
       i4.setEnabled(false);i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
      l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
      id4.setEnabled(false);id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
   n4.setEnabled(false); n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p4.setEnabled(false); p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==4)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
         id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+"");
     
       i5.setEnabled(false);i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
   l5.setEnabled(false);l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
    id5.setEnabled(false);id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
    n5.setEnabled(false); n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
       p5.setEnabled(false); p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==5)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
         
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
       i6.setEnabled(false);i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
 l6.setEnabled(false);l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
 id6.setEnabled(false);id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
   n6.setEnabled(false); n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
      p6.setEnabled(false); p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
       
        }
         if(row ==6)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
    
          i7.setEnabled(false);i8.setEnabled(false);i9.setEnabled(false);
 l7.setEnabled(false);l8.setEnabled(false);l9.setEnabled(false);
id7.setEnabled(false);id8.setEnabled(false);id9.setEnabled(false);
    n7.setEnabled(false); n8.setEnabled(false); n9.setEnabled(false);
    p7.setEnabled(false); p8.setEnabled(false); p9.setEnabled(false);
        }
                if(row ==7)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
     
        i8.setEnabled(false);i9.setEnabled(false);
 l8.setEnabled(false);l9.setEnabled(false);
id8.setEnabled(false);id9.setEnabled(false);
    n8.setEnabled(false); n9.setEnabled(false);
   p8.setEnabled(false); p9.setEnabled(false);
        }
          if(row ==8)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         
        id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
        
        id8.setText(table.getValueAt(8,0).toString());
   n8.setText(table.getValueAt(8,1).toString());
   p8.setText(Integer.parseInt(table.getValueAt(8,2).toString())+"");
        i8.setIcon(new ImageIcon(table.getValueAt(8,3).toString()));
        l8.setText(Integer.parseInt(table.getValueAt(8,4).toString())+"");
     
        i9.setEnabled(false);
 l9.setEnabled(false);
id9.setEnabled(false);
    n9.setEnabled(false);
    p9.setEnabled(false);
        }
           if(row ==9)
        {
            id1.setText(table.getValueAt(0,0).toString());
   n1.setText(table.getValueAt(0,1).toString());
   p1.setText(Integer.parseInt(table.getValueAt(0,2).toString())+"");
        i1.setIcon(new ImageIcon(table.getValueAt(0,3).toString()));
        l1.setText(Integer.parseInt(table.getValueAt(0,4).toString())+"");
       
          id2.setText(table.getValueAt(1,0).toString());
   n2.setText(table.getValueAt(1,1).toString());
   p2.setText(Integer.parseInt(table.getValueAt(1,2).toString())+"");
        i2.setIcon(new ImageIcon(table.getValueAt(1,3).toString()));
        l2.setText(Integer.parseInt(table.getValueAt(1,4).toString())+"");
        
        
        
        id3.setText(table.getValueAt(3,0).toString());
   n3.setText(table.getValueAt(3,1).toString());
   p3.setText(Integer.parseInt(table.getValueAt(3,2).toString())+"");
        i3.setIcon(new ImageIcon(table.getValueAt(3,3).toString()));
        l3.setText(Integer.parseInt(table.getValueAt(3,4).toString())+"");
        
         id4.setText(table.getValueAt(4,0).toString());
   n4.setText(table.getValueAt(4,1).toString());
   p4.setText(Integer.parseInt(table.getValueAt(4,2).toString())+"");
        i4.setIcon(new ImageIcon(table.getValueAt(4,3).toString()));
        l4.setText(Integer.parseInt(table.getValueAt(4,4).toString())+""); 
       
        
        id5.setText(table.getValueAt(5,0).toString());
   n5.setText(table.getValueAt(5,1).toString());
   p5.setText(Integer.parseInt(table.getValueAt(5,2).toString())+"");
        i5.setIcon(new ImageIcon(table.getValueAt(5,3).toString()));
        l5.setText(Integer.parseInt(table.getValueAt(5,4).toString())+"");
        
        
        id6.setText(table.getValueAt(6,0).toString());
   n6.setText(table.getValueAt(6,1).toString());
   p6.setText(Integer.parseInt(table.getValueAt(6,2).toString())+"");
        i6.setIcon(new ImageIcon(table.getValueAt(6,3).toString()));
        l6.setText(Integer.parseInt(table.getValueAt(6,4).toString())+"");
        
         
        id7.setText(table.getValueAt(7,0).toString());
   n7.setText(table.getValueAt(7,1).toString());
   p7.setText(Integer.parseInt(table.getValueAt(7,2).toString())+"");
        i7.setIcon(new ImageIcon(table.getValueAt(7,3).toString()));
        l7.setText(Integer.parseInt(table.getValueAt(7,4).toString())+"");
        
        id8.setText(table.getValueAt(8,0).toString());
   n8.setText(table.getValueAt(8,1).toString());
   p8.setText(Integer.parseInt(table.getValueAt(8,2).toString())+"");
        i8.setIcon(new ImageIcon(table.getValueAt(8,3).toString()));
        l8.setText(Integer.parseInt(table.getValueAt(8,4).toString())+"");
        
        id9.setText(table.getValueAt(9,0).toString());
   n9.setText(table.getValueAt(9,1).toString());
   p9.setText(Integer.parseInt(table.getValueAt(9,2).toString())+"");
        i9.setIcon(new ImageIcon(table.getValueAt(9,3).toString()));
        l9.setText(Integer.parseInt(table.getValueAt(9,4).toString())+"");
        }
           
    }//GEN-LAST:event_sbActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try{
            Class.forName("java.sql.Driver");
Connection            connect = DriverManager.getConnection("jdbc:mysql://localhost/ekart","root","root");
         Statement   statement =connect.createStatement();
            String nametf =nameee.getText();
            String query ="select id,balance from accounts where id ='"+nametf+"';";

         ResultSet   resultset =statement.executeQuery(query);
            if(resultset.next())
            {

                String namen=  resultset.getString("id");

                int balanceb= resultset.getInt("balance");
                new accounts(namen,balanceb).setVisible(true);
            }
            else
            {
                connect.close();
                statement.close();
                resultset.close();
            }
        }
        catch(Exception error)
        {
            JOptionPane.showMessageDialog(this,"Connection error");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JComboBox<String> cb6;
    private javax.swing.JLabel i1;
    private javax.swing.JLabel i2;
    private javax.swing.JLabel i3;
    private javax.swing.JLabel i4;
    private javax.swing.JLabel i5;
    private javax.swing.JLabel i6;
    private javax.swing.JLabel i7;
    private javax.swing.JLabel i8;
    private javax.swing.JLabel i9;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id4;
    private javax.swing.JLabel id5;
    private javax.swing.JLabel id6;
    private javax.swing.JLabel id7;
    private javax.swing.JLabel id8;
    private javax.swing.JLabel id9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JLabel n9;
    private javax.swing.JLabel nameee;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JTextField s1;
    private javax.swing.JButton sb;
    private javax.swing.JTable tab1;
    // End of variables declaration//GEN-END:variables
}
