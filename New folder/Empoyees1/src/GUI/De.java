package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class De extends javax.swing.JFrame {

    Connection con;
    PreparedStatement Insertps;

    public De() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtfrom = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtshedule = new javax.swing.JTextField();
        txtperiod = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNAME = new javax.swing.JTextField();
        txtout = new javax.swing.JTextField();
        txtin = new javax.swing.JTextField();
        txtDATE = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 204));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\iruda\\Documents\\NetBeansProjects\\Empoyees1\\Screenshot (9).png")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" Application Status(week day/wekend)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText(" Employee name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText(" From (Please mention Date)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText(" Leave Type(Medical/Personal)");

        txtname.setBackground(new java.awt.Color(255, 255, 153));
        txtname.setText(" ");
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtfrom.setBackground(new java.awt.Color(255, 255, 153));
        txtfrom.setText(" ");

        txtType.setBackground(new java.awt.Color(255, 255, 153));
        txtType.setText(" ");

        txtTo.setBackground(new java.awt.Color(255, 255, 153));
        txtTo.setText(" ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText(" To (Please mention Date)");

        txtstatus.setBackground(new java.awt.Color(255, 255, 153));
        txtstatus.setText(" ");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText(" CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText(" ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jButton2)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        jTabbedPane1.addTab("Leave ", jPanel4);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("  Employee name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText(" Shedule Type(Morning/Evening/Night)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText(" Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText(" Rotation Period");

        txtName.setBackground(new java.awt.Color(204, 255, 204));
        txtName.setText(" ");

        txtdate.setBackground(new java.awt.Color(204, 255, 204));
        txtdate.setText(" ");

        txtshedule.setBackground(new java.awt.Color(204, 255, 204));
        txtshedule.setText(" ");

        txtperiod.setBackground(new java.awt.Color(204, 255, 204));
        txtperiod.setText(" ");

        jButton3.setBackground(new java.awt.Color(51, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText(" SAVE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText(" CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\iruda\\Documents\\NetBeansProjects\\Empoyees1\\Capture.PNG")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtperiod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtshedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtshedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtperiod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jButton3)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel7))
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Shift", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\iruda\\Documents\\NetBeansProjects\\Empoyees1\\Screenshot (14).png")); // NOI18N
        jLabel11.setText("jLabel11");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 51));
        jLabel13.setText("  Employee name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText(" Date");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText(" In Time");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 51));
        jLabel16.setText(" Out Time");

        txtNAME.setBackground(new java.awt.Color(153, 153, 255));
        txtNAME.setText(" ");

        txtout.setBackground(new java.awt.Color(153, 153, 255));
        txtout.setText(" ");

        txtin.setBackground(new java.awt.Color(153, 153, 255));
        txtin.setText(" ");
        txtin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinActionPerformed(evt);
            }
        });

        txtDATE.setBackground(new java.awt.Color(153, 153, 255));
        txtDATE.setText(" ");

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText(" SAVE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText(" CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtout, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtin, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(457, 457, 457))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(txtDATE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(txtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel15)))
                .addGap(75, 75, 75)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab(" Attendance", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String name = txtname.getText();
        String status = txtstatus.getText();
        String type = txtType.getText();
        String from = txtfrom.getText();
        String to = txtTo.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ phamacy", "root", "");
                Insertps = con.prepareStatement("insert into  leave_em( e_name,status,type,from_em,to_em )values(?,?,?,?,?)");
                Insertps.setString(1, name);
                Insertps.setString(2, status);
                Insertps.setString(3, type);
                Insertps.setString(4, from);
                Insertps.setString(5, to);
                Insertps.executeUpdate();
                JOptionPane.showMessageDialog(null, " Data saved");
                txtname.setText("");
                txtstatus.setText("");
                txtType.setText("");
                txtfrom.setText("");
                txtTo.setText("");
                txtname.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Name = txtName.getText();
        String shedule = txtshedule.getText();
        String date = txtdate.getText();
        String period = txtperiod.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ phamacy", "root", "");
                Insertps = con.prepareStatement("insert into   shift( em_name, shedule,date,period  )values(?,?,?,?)");
                Insertps.setString(1, Name);
                Insertps.setString(2, shedule);
                Insertps.setString(3, date);
                Insertps.setString(4, period);

                Insertps.executeUpdate();
                JOptionPane.showMessageDialog(null, " Data saved");
                txtName.setText("");
                txtshedule.setText("");
                txtdate.setText("");
                txtperiod.setText("");
                txtName.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String NAME = txtNAME.getText();
        String DATE = txtDATE.getText();
        String in_time = txtin.getText();
        String out_time = txtout.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ phamacy", "root", "");
                Insertps = con.prepareStatement("insert into   attendance( Em_name,  date,in_time,out_time )values(?,?,?,?)");
                Insertps.setString(1, NAME);
                Insertps.setString(2, DATE);
                Insertps.setString(3, in_time);
                Insertps.setString(4, out_time);

                Insertps.executeUpdate();
                JOptionPane.showMessageDialog(null, "  Data saved ");
                txtNAME.setText("");
                txtDATE.setText("");
                txtin.setText("");
                txtout.setText("");
                txtNAME.requestFocus();

            } catch (SQLException ex) {
                Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(De.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();

        // TODO add your handling code here:
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

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new De().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtDATE;
    private javax.swing.JTextField txtNAME;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JTextField txtin;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtout;
    private javax.swing.JTextField txtperiod;
    private javax.swing.JTextField txtshedule;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
