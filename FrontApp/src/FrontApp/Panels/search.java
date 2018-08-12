package FrontApp.Panels;

import FrontApp.Classes.staticV;
import FrontApp.Classes.DB;
import FrontApp.Project;
import static FrontApp.Project.card_panal;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class search extends javax.swing.JPanel {
    DB ob= new DB();
    PreparedStatement pres ;
    ResultSet  res ;
    Connection con ;
    
    public search() throws Exception {
        initComponents();
        con = DB.getConnection();
        tableview();
    }
    
    public void tableview() throws Exception{
        data_panal.setVisible(false);
        Vector v = new Vector();
        v.add("Name");
        v.add("Code");
        v.add("Price");
        v.add("Details");
        v.add("Category");
        v.add("Shop ID");
        table.setModel(new DefaultTableModel(ob.show(), v));
    }
    
    public void tableview(String x ) throws Exception{
        Vector v = new Vector();
            v.add("Name");
            v.add("Code");
            v.add("Price");
            v.add("Details");
            v.add("Category");
            v.add("Shop ID");      
            table.setModel(new DefaultTableModel(ob.show(x), v));
    }
    
    public void buy(){
        try {
            pres = (PreparedStatement) con.prepareStatement("SELECT category FROM " + staticV.div
                    +" WHERE code = '"+table.getModel().getValueAt(table.getSelectedRow(), 0).toString()+"'");
            res = pres.executeQuery();
            Vector v = new Vector();
            v.add(namel.getText());
            v.add(codel.getText());
            v.add(pricel.getText());
            v.add(detailsl.getText());
            v.add(categoryl.getText());
            v.add(shopid.getText());
            while(res.next())
                v.add(res.getString(1));
            main_panal.all.add(v);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR IN BUYING");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        data_panal = new javax.swing.JPanel();
        picl = new javax.swing.JLabel();
        buy_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pricel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        categoryl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        detailsl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shopid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(20, 30, 130, 70);

        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        add(search_txt);
        search_txt.setBounds(210, 130, 320, 40);

        jScrollPane1.setOpaque(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.setOpaque(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 610, 430);

        data_panal.setOpaque(false);

        buy_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        buy_btn.setText("BUY");
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAME  :");

        namel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CODE  :");

        codel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRICE  :");

        pricel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pricel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORY :");

        categoryl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoryl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DETAILS :");

        detailsl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        detailsl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Shop ID :");

        shopid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shopid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout data_panalLayout = new javax.swing.GroupLayout(data_panal);
        data_panal.setLayout(data_panalLayout);
        data_panalLayout.setHorizontalGroup(
            data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, data_panalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(picl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(data_panalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buy_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namel, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(codel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(categoryl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pricel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(detailsl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shopid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        data_panalLayout.setVerticalGroup(
            data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_panalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoryl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(shopid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(data_panal);
        data_panal.setBounds(1000, 220, 330, 430);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(170, 30, 160, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/search.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1366, 695);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if("elect_items".equals(staticV.div))
            Project.card.show(card_panal, "all_electronic");
        if("din_items".equals(staticV.div))
            Project.card.show(card_panal, "all_food");
        if("cin_items".equals(staticV.div))
            Project.card.show(card_panal, "all_cin");
        if("clothes_items".equals(staticV.div))
            Project.card.show(card_panal, "all_clothes");
        if("lib_items".equals(staticV.div))
            Project.card.show(card_panal, "all_lib");
        if("pharm_items".equals(staticV.div))
            Project.card.show(card_panal, "all_pharm");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        
    }//GEN-LAST:event_search_txtActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try {
            int row = table.getSelectedRow();
            data_panal.setVisible(true);
            namel.setText(table.getModel().getValueAt(row, 0).toString());
            codel.setText(table.getModel().getValueAt(row, 1).toString());
            pricel.setText(table.getModel().getValueAt(row, 2).toString());
            detailsl.setText(table.getModel().getValueAt(row, 3).toString());
            categoryl.setText(table.getModel().getValueAt(row, 4).toString());
            shopid.setText(table.getModel().getValueAt(row, 5).toString());
            ImageIcon icon = new ImageIcon(ob.getdata().get(row).getImage());
            Image image = icon.getImage().getScaledInstance(picl.getWidth(),picl.getHeight(), Image.SCALE_SMOOTH);
            picl.setIcon(new ImageIcon(image));
        } catch (Exception ex) {}
    }//GEN-LAST:event_tableMouseClicked

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        try {
            tableview(search_txt.getText());
        } catch (Exception ex) {}
    }//GEN-LAST:event_search_txtKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Project.card_panal.add("showcart", new showcart());
        Project.card.show(Project.card_panal, "showcart");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
        buy();
    }//GEN-LAST:event_buy_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy_btn;
    private javax.swing.JLabel categoryl;
    private javax.swing.JLabel codel;
    private javax.swing.JPanel data_panal;
    private javax.swing.JLabel detailsl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namel;
    private javax.swing.JLabel picl;
    private javax.swing.JLabel pricel;
    private javax.swing.JTextField search_txt;
    private javax.swing.JLabel shopid;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
