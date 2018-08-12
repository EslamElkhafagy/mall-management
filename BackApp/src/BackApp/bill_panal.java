package BackApp;

import java.net.ServerSocket;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class bill_panal extends javax.swing.JPanel {

    static Vector bill;
    DB ob = new DB();
    Thread t;
    String div;
    ServerSocket server;

    public bill_panal() {
        initComponents();

        t = new Thread(new Runnable() {

            @Override
            public void run() {

                while (true) {

                    Vector v = new Vector();
                    v.add("Cart ID");
                    v.add("Creation Date");
                    v.add("Cart Checked");
                    v.add("Total Price");
                    bill_table.setModel(new DefaultTableModel(ob.showBill(), v));
                    try {
                        t.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(bill_panal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        });
        t.start();
    }

    public void tableview() {
        Vector v = new Vector();
        v.add("Cart ID");
        v.add("Creation Date");
        v.add("Cart Checked");
        v.add("Total Price");
        bill_table.setModel(new DefaultTableModel(ob.showBill(), v));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bill_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_cat = new javax.swing.JTextField();
        txt_num = new javax.swing.JTextField();
        txt_codes = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();

        setBackground(new java.awt.Color(100, 255, 255));
        setPreferredSize(new java.awt.Dimension(1454, 700));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        bill_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bill_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bill_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bill_table);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Total Price");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Categories");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Number Of Products");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Products Codes");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Bill Date");

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jButton2.setText("Cancel Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_id.setEditable(false);
        txt_id.setEnabled(false);

        txt_price.setEditable(false);
        txt_price.setEnabled(false);

        txt_cat.setEditable(false);
        txt_cat.setEnabled(false);

        txt_num.setEditable(false);
        txt_num.setEnabled(false);

        txt_codes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codesActionPerformed(evt);
            }
        });
        txt_codes.setEditable(false);
        txt_codes.setEnabled(false);

        txt_date.setEditable(false);
        txt_date.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_num)
                            .addComponent(txt_cat)
                            .addComponent(txt_price)
                            .addComponent(txt_date)
                            .addComponent(txt_codes)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_id)))
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_price))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_cat))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_num))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_codes))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_date))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void bill_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bill_tableMouseClicked
        int row = bill_table.getSelectedRow();
        String id = bill_table.getModel().getValueAt(row, 0).toString();

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement("SELECT cart_id, catergories, items_num,"
                    + " items_codes, date, price FROM bill_history where cart_id = " + id);
            ResultSet result = ps.executeQuery();

            while (result.next()) {
                txt_id.setText(result.getString(1));
                txt_price.setText(result.getString(6));
                txt_cat.setText(result.getString(2));
                txt_num.setText(result.getString(3));
                txt_codes.setText(result.getString(4));
                txt_date.setText(result.getString(5));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error mouse clicked");
        }
    }//GEN-LAST:event_bill_tableMouseClicked

    private void txt_codesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (authorization.division.equalsIgnoreCase("Electronics")) {
            div = "elect_items";
        } else if (authorization.division.equalsIgnoreCase("Clothes")) {
            div = "clothes_items";
        } else if (authorization.division.equalsIgnoreCase("Food")) {
            div = "food_items";
        } else if (authorization.division.equalsIgnoreCase("Library")) {
            div = "lib_items";
        } else if (authorization.division.equalsIgnoreCase("Pharmacy")) {
            div = "pharm_items";
        } else if (authorization.division.equalsIgnoreCase("Cinema")) {
            div = "Cinema_items";
        }
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement("UPDATE bill_history SET  status = 'true' Where cart_id = ? ");
            ps.setString(1, txt_id.getText());
            ps.executeUpdate();

            ps = DB.getConnection().prepareStatement("INSERT INTO audit"
                    + "(emp_id,type,shop_id,date,operation) VALUES(?,?,?,?,?)");
            ps.setInt(1, authorization.emp_id);
            ps.setString(2, authorization.type);
            ps.setString(3, authorization.shop_id);
            ps.setString(4, authorization.getCurrentDateTime());
            ps.setString(5, "Selling");
            ps.executeUpdate();

            ps = DB.getConnection().prepareStatement("SELECT items_num , items_codes FROM bill_history WHERE cart_id = " + txt_id.getText());
            ResultSet result = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Success");

            String[] s1;
            String[] s2;
            String nums = "";
            String codes = "";
            while (result.next()) {
                nums = result.getString(1);
                codes = result.getString(2);
            }
            s1 = nums.split(" ");
            s2 = codes.split(" ");

            for (int i = 0; i < s1.length; i++) {
                ps = DB.getConnection().prepareStatement("UPDATE " + div + " SET amount = amount-? WHERE code = ? ");
                ps.setString(1, s1[i]);
                ps.setString(2, s2[i]);
                ps.executeUpdate();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }

        txt_id.setText(null);
        txt_cat.setText(null);
        txt_codes.setText(null);
        txt_date.setText(null);
        txt_num.setText(null);
        txt_price.setText(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are You Sure ? ") == 0) {
            try {
                PreparedStatement ps = DB.getConnection().prepareStatement("delete from bill_history where cart_id = ? ");
                ps.setString(1, txt_id.getText());
                ps.executeUpdate();

                ps = DB.getConnection().prepareStatement("INSERT INTO audit"
                        + "(emp_id,type,shop_id,date,operation) VALUES(?,?,?,?,?)");
                ps.setInt(1, authorization.emp_id);
                ps.setString(2, authorization.type);
                ps.setString(3, authorization.shop_id);
                ps.setString(4, authorization.getCurrentDateTime());
                ps.setString(5, "Removing Cart");
                ps.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in delete");
            }
        }

        txt_id.setText(null);
        txt_cat.setText(null);
        txt_codes.setText(null);
        txt_date.setText(null);
        txt_num.setText(null);
        txt_price.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bill_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cat;
    private javax.swing.JTextField txt_codes;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
