package BackApp;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class items_panal extends javax.swing.JPanel {
    File f = null;
    FileInputStream fin;
    DB ob = new DB();
    Vector v = new Vector();
    String imgPath = null;
    static String code = null ;
    String div ;
        
    public items_panal() {
        initComponents();
        tableview();
    }
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic){
        ImageIcon MyImage = null;
        if(ImagePath != null){
           MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(pic_label.getWidth(), pic_label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    public void tableview(){
        Vector v = new Vector();
        v.add("name");
        v.add("code");
        v.add("amount");
        v.add("price");
        v.add("details");
        v.add("category");
        table.setModel(new DefaultTableModel(ob.show(), v));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        details_area = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        code_txt = new javax.swing.JTextField();
        amount_txt = new javax.swing.JTextField();
        price_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        cat_combo = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        pic_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 255));
        setForeground(new java.awt.Color(51, 153, 255));

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Details");

        details_area.setColumns(20);
        details_area.setRows(5);
        jScrollPane2.setViewportView(details_area);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Category");

        add_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add_btn.setText("Insert");
        add_btn.setMaximumSize(new java.awt.Dimension(100, 50));
        add_btn.setMinimumSize(new java.awt.Dimension(100, 50));
        add_btn.setPreferredSize(new java.awt.Dimension(100, 50));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        reset_btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reset_btn.setText("Clear");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        cat_combo.setEditable(true);
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }

        try{
            PreparedStatement ps = DB.getConnection().prepareStatement("SELECT DISTINCT(category) FROM clothes_items" );
            ResultSet result = ps.executeQuery();
            while(result.next()){
                cat_combo.addItem(result.getString(1));
            }

            cat_combo.setSelectedIndex(-1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error in combo");
        }

        jDesktopPane1.setLayer(pic_label, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_label, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic_label, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Choose Picture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cat_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 158, Short.MAX_VALUE)
                                                .addComponent(price_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(amount_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(code_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(name_txt)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(back))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(back)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(code_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(amount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(price_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cat_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        items_caps o = new items_caps();
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement("INSERT INTO "+div
                    + "(name,code,amount,price,details,image,category,shop_id) VALUES(?,?,?,?,?,?,?,?)");

            InputStream img = new FileInputStream(new File(imgPath));

            ps.setString(1, name_txt.getText());
            ps.setString(2, code_txt.getText());
            ps.setString(3, amount_txt.getText());
            ps.setString(4, price_txt.getText());
            ps.setString(5, details_area.getText());
            ps.setBlob(6, img);
            ps.setString(7, cat_combo.getSelectedItem().toString());
            ps.setString(8, authorization.shop_id);

            if(ps.executeUpdate() == 1){
                code_txt.setBackground(null);
                amount_txt.setBackground(null);
                price_txt.setBackground(null);
                name_txt.setBackground(null);
                details_area.setBackground(null);
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something Went Wrong !\nMake Sure All Data are Inserted And Code or Image is not repeated");
            if(code_txt.getText().length() == 0){ code_txt.setBackground(Color.red);} 
            if(amount_txt.getText().length() == 0){ amount_txt.setBackground(Color.red);}
            if(price_txt.getText().length() == 0){ price_txt.setBackground(Color.red);}
            if(name_txt.getText().length() == 0){ name_txt.setBackground(Color.red);}
            if(details_area.getText().length() == 0){ details_area.setBackground(Color.red);}
            if(pic_label.getIcon() == null){ JOptionPane.showMessageDialog(null, "No Pic Choosen");}
        }
        tableview();
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        
        name_txt.setText(table.getModel().getValueAt(row, 0).toString());
        code_txt.setText(table.getModel().getValueAt(row, 1).toString());
        amount_txt.setText(table.getModel().getValueAt(row, 2).toString());
        price_txt.setText(table.getModel().getValueAt(row, 3).toString());
        details_area.setText(table.getModel().getValueAt(row, 4).toString());
        cat_combo.getModel().setSelectedItem(table.getModel().getValueAt(row, 5).toString());
       
        ImageIcon icon = new ImageIcon(ob.getdata().get(row).getImage());
        Image image = icon.getImage().getScaledInstance(pic_label.getWidth(),pic_label.getHeight(), Image.SCALE_SMOOTH);
        pic_label.setIcon(new ImageIcon(image));
        
        items_panal.code = table.getModel().getValueAt(row, 1).toString() ;
    }//GEN-LAST:event_tableMouseClicked

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Are You Sure ? ")==0){
            ob.delete(code_txt.getText());
            tableview();
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        items_caps o = new items_caps();
        if(authorization.division.equalsIgnoreCase("Electronics")){
            div = "elect_items" ;
        }else if (authorization.division.equalsIgnoreCase("Clothes")){
            div = "clothes_items" ;
        }else if (authorization.division.equalsIgnoreCase("Food")){
            div = "food_items" ;
        }else if (authorization.division.equalsIgnoreCase("Library")){
            div = "lib_items" ;
        }else if (authorization.division.equalsIgnoreCase("Pharmacy")){
            div = "pharm_items" ;
        }else if (authorization.division.equalsIgnoreCase("Cinema")){
            div = "Cinema_items" ;
        }
        try {
            if(imgPath != null){
                InputStream  img = new FileInputStream(imgPath);
            
            String UpdateQuery = "UPDATE "+div+" SET name = ? , code = ? , amount = ? ,"
                    + " price = ? , details = ? , image = ? , category = ? , shop_id = ? WHERE code = ?";

            PreparedStatement ps = DB.getConnection().prepareStatement(UpdateQuery);
            ps.setString(1, name_txt.getText());
            ps.setString(2, code_txt.getText());
            ps.setString(3, amount_txt.getText());
            ps.setString(4, price_txt.getText());
            ps.setString(5, details_area.getText());
            ps.setBlob(6, img);
            ps.setString(7, cat_combo.getSelectedItem().toString());
            ps.setString(8, code_txt.getText());
            if(ps.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(null, "Data Updated");
                }else{
                    JOptionPane.showMessageDialog(null, "NO Data Exist With This Id");
                }
            }else{
                String UpdateQuery = "UPDATE "+div+" SET name = ? , code = ? , amount = ? ,"
                    + " price = ? , details = ?  , category = ? WHERE code = ?";

                PreparedStatement ps = DB.getConnection().prepareStatement(UpdateQuery);
                ps.setString(1, name_txt.getText());
                ps.setString(2, code_txt.getText());
                ps.setString(3, amount_txt.getText());
                ps.setString(4, price_txt.getText());
                ps.setString(5, details_area.getText());
                ps.setString(6, cat_combo.getSelectedItem().toString());
                ps.setString(7, code_txt.getText());
                if(ps.executeUpdate() == 1){
                        JOptionPane.showMessageDialog(null, "Data Updated");
                }else{
                    JOptionPane.showMessageDialog(null, "NO Data Exist With This Id");
                }
            }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        tableview();
        // TODO add your handling code here:
    }//GEN-LAST:event_update_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            pic_label.setIcon(ResizeImage(path,null));
            imgPath = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No Image Select");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        cat_combo.setSelectedItem(null);
        code_txt.setText(null);
        name_txt.setText(null);
        amount_txt.setText(null);
        price_txt.setText(null);
        details_area.setText(null);
        pic_label.setIcon(null);
    }//GEN-LAST:event_reset_btnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField amount_txt;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> cat_combo;
    private javax.swing.JTextField code_txt;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextArea details_area;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel pic_label;
    private javax.swing.JTextField price_txt;
    private javax.swing.JButton reset_btn;
    private javax.swing.JTable table;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
