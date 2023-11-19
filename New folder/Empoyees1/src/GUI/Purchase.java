/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

 
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Purchase extends javax.swing.JFrame {

    /**
     * Creates new form Purchase
     */
    public Purchase() {
        initComponents();
        Connect();
        Supplier();
    }
    Connection con=null;
    PreparedStatement Insertps=null;
    PreparedStatement Insertps1=null;
    PreparedStatement Insertps2=null;
    DefaultTableModel df;
    ResultSet rs;
    
     public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ phamacy","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void Supplier()
     {
        try {
            Insertps = con.prepareStatement("select Distinct name from supplier");
            rs = Insertps.executeQuery();
            txtsupplier.removeAllItems();
            
            while(rs.next())
            {
                txtsupplier.addItem(rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void Barcode()
     {
         String Itemcode = txtcode.getText();
        try {
            Insertps = con.prepareStatement("select * from item where barcode = ?");
            Insertps.setString(1, Itemcode);
            rs = Insertps.executeQuery();
            
            if(rs.next()== false)
            {
                JOptionPane.showMessageDialog(this, "Barcode Not Found");
                txtcode.setText("");
            }
            else
            {
                String Itemname = rs.getString("name");
                String Itemprice = rs.getString("price");
                
                txtname.setText(Itemname.trim());
                txtprice.setText(Itemprice.trim());
                txtquantity.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void Purchase()
     {
         int price = Integer.parseInt(txtprice.getText());
         int quantity = Integer.parseInt(txtquantity.getText());
         
         int tot = price * quantity;
          df = (DefaultTableModel)jTable1.getModel();
          df.addRow(new Object[] 
                  
                  {
                        txtcode.getText(),
                        txtname.getText(),
                        txtprice.getText(),
                        txtquantity.getText(),
                        tot
                  }
                  );
          int sum = 0;
          for(int i =0;i<jTable1.getRowCount();i++)
          {
              sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
          }
          txttcost.setText(String.valueOf(sum));
          
          txtcode.setText("");
          txtname.setText("");
          txtprice.setText("");
          txtquantity.setText("");
     }
     
     public void add()
     {
         try {
               DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/mm/dd");
               LocalDateTime now = LocalDateTime.now();
               String date = dt.format(now);
         
                 String total = txttcost.getText();
                 String payment = txtpayment.getText();
                 String balance = txtbalance.getText();
                 int lastid = 0;
            
                 String query1 = "insert into purchase(date,total,payment,balance)values(?,?,?,?)";
                 Insertps=con.prepareStatement(query1);
                 
                 Insertps.setString(1,date );
                 Insertps.setString(2,total );
                 Insertps.setString(3,payment );
                 Insertps.setString(4,balance);
                        
                 Insertps.executeUpdate();
                 rs = Insertps.getGeneratedKeys();
                 
                 String query2 = "insert into purchaseitem(purchaseid,itemid,price,quantity,total1)values(?,?,?,?,?)";
                 Insertps1=con.prepareStatement(query2);
                 
                 String itemid;
                 String price;
                 String quantity;
                 int total1;
                 
                 for(int i =0;i<jTable1.getRowCount();i++)
                 {
                     itemid = (String)jTable1.getValueAt(i, 0);
                     price = (String)jTable1.getValueAt(i, 2);
                     quantity = (String)jTable1.getValueAt(i, 3);
                     total1 = (int)jTable1.getValueAt(i, 4);
                     
                     Insertps1.setInt(1, lastid);
                     Insertps1.setString(2,itemid);
                     Insertps1.setString(1, price);
                     Insertps1.setString(1, quantity);
                     Insertps1.setInt(1, total1);
                     Insertps1.executeUpdate();
                     JOptionPane.showMessageDialog(this, "Purchase Added");
                 }
                 
                 
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttcost = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpayment = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtsupplier = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("PURCHASE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Item Code");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Price");

        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodeKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Quantity");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Total Cost");

        txttcost.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Payment");

        txtpayment.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Balance");

        txtbalance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 204));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 204));
        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(txtcode))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtname))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtprice)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                .addComponent(txtquantity))
                            .addGap(27, 27, 27)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtbalance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpayment, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttcost, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(7, 7, 7)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER)
        {
            Barcode();
        }
    }//GEN-LAST:event_txtcodeKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int payment = Integer.parseInt(txtpayment.getText());
        int total = Integer.parseInt(txttcost.getText());
        int balance = payment - total;
        
        txtbalance.setText(String.valueOf(balance));
        
        
        add();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Purchase();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JComboBox<String> txtsupplier;
    private javax.swing.JTextField txttcost;
    // End of variables declaration//GEN-END:variables
}
