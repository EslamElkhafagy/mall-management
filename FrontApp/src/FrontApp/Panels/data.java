package FrontApp.Panels;

import FrontApp.Classes.staticV;
import FrontApp.Classes.electronic_items;
import FrontApp.Classes.DB;
import FrontApp.Project;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static FrontApp.Project.card_panal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class data extends javax.swing.JPanel implements MouseListener {

    public JLabel arr[] = new JLabel[9];
    GridLayout grid = new GridLayout(3, 3, 10, 10);

    int index = 9;
    private int next = 0;
    private int prev = next;
    DB o = new DB();
    Connection con ;
    PreparedStatement pre ;
    ResultSet res ;
    ImageIcon[] img = new ImageIcon[9];
    int count = 0 ;
    static List<electronic_items> list = new ArrayList<electronic_items>();
    
    public data() throws Exception{
        initComponents();
        con = DB.getConnection();
        list = o.getdata();
        data_panal.setVisible(false);
        grid_panal.setLayout(grid);
        
        for (int i = 0; i < 9; i++) {
            arr[i] = new JLabel();
            arr[i].setSize(100, 100);
            ImageIcon icon = new ImageIcon(list.get(i).getImage());
            Image image = icon.getImage().getScaledInstance(arr[i].getWidth(), arr[i].getHeight(), Image.SCALE_SMOOTH);
            arr[i].setIcon(new ImageIcon(image));
            arr[i].addMouseListener(this);
            grid_panal.add(arr[i]);
        }
        prevl.setVisible(false);
        
        if (list.size() <= 9) {
            prevl.setVisible(false);
        nextl.setVisible(false);
        }
          count = 9 ;
    }

    public void buy(){
        try {
            pre = con.prepareStatement("update "+staticV.div+" SET amount = amount-1 WHERE code = '"+codel.getText()+"'");
            pre.executeUpdate();
            
            pre = con.prepareStatement("SELECT category FROM " + staticV.div+" WHERE code = '"+codel.getText()+"'");
            res = pre.executeQuery();
            
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
            JOptionPane.showMessageDialog(null,ex+ "\n Unfortunately We Have Shortage In This Product Currently at buy action");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid_panal = new javax.swing.JPanel();
        prevl = new javax.swing.JLabel();
        nextl = new javax.swing.JLabel();
        data_panal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        buy_btn = new javax.swing.JButton();
        namel = new javax.swing.JLabel();
        categoryl = new javax.swing.JLabel();
        codel = new javax.swing.JLabel();
        pricel = new javax.swing.JLabel();
        detailsl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        shopid = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        grid_panal.setBackground(new java.awt.Color(204, 204, 204));
        grid_panal.setOpaque(false);

        javax.swing.GroupLayout grid_panalLayout = new javax.swing.GroupLayout(grid_panal);
        grid_panal.setLayout(grid_panalLayout);
        grid_panalLayout.setHorizontalGroup(
            grid_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        grid_panalLayout.setVerticalGroup(
            grid_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        add(grid_panal);
        grid_panal.setBounds(130, 140, 440, 520);

        prevl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/prev.png"))); // NOI18N
        prevl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prevlMouseClicked(evt);
            }
        });
        add(prevl);
        prevl.setBounds(90, 360, 30, 70);

        nextl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/next.png"))); // NOI18N
        nextl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextlMouseClicked(evt);
            }
        });
        add(nextl);
        nextl.setBounds(600, 380, 40, 50);

        data_panal.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CODE  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAME  :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PRICE  :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DETAILS :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CATEGORY :");

        buy_btn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        buy_btn.setText("BUY");
        buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buy_btnActionPerformed(evt);
            }
        });

        namel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        namel.setForeground(new java.awt.Color(255, 255, 255));

        categoryl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoryl.setForeground(new java.awt.Color(255, 255, 255));

        codel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        codel.setForeground(new java.awt.Color(255, 255, 255));

        pricel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pricel.setForeground(new java.awt.Color(255, 255, 255));

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
            .addGroup(data_panalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addComponent(buy_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(data_panalLayout.createSequentialGroup()
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namel, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
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
                            .addComponent(shopid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        data_panalLayout.setVerticalGroup(
            data_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_panalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                        .addComponent(shopid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addComponent(buy_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        add(data_panal);
        data_panal.setBounds(960, 150, 360, 510);

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        add(jLabel15);
        jLabel15.setBounds(20, 30, 130, 70);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/magnifier.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(380, 30, 80, 60);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(170, 30, 170, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/display.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.revalidate();
        list.clear();
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
    }//GEN-LAST:event_jLabel15MouseClicked

    private void nextlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextlMouseClicked
data_panal.setVisible(false);
        next++;
        grid_panal.removeAll();
        grid_panal.revalidate();
        for (int i = 0; i < 9; i++) {
            arr[i] = new JLabel();
            arr[i].setSize(100, 100);
            ImageIcon icon = new ImageIcon(list.get(9 * next + i).getImage());
            Image image = icon.getImage().getScaledInstance(arr[i].getWidth(), arr[i].getHeight(), Image.SCALE_SMOOTH);
            arr[i].setIcon(new ImageIcon(image));
            grid_panal.add(arr[i]);
            arr[i].addMouseListener(this);
            
            if ((9 * next + i + 1) >= list.size()) {
                nextl.setVisible(false);
                break;
            }
        }
        prevl.setVisible(true);
    }//GEN-LAST:event_nextlMouseClicked

    private void prevlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prevlMouseClicked
        data_panal.setVisible(false);
        nextl.setVisible(true);
        next--;
        grid_panal.removeAll();
        grid_panal.revalidate();
        for (int i = 0; i < 9; i++) {
            arr[i] = new JLabel();
            arr[i].setSize(100, 100);
            ImageIcon icon = new ImageIcon(list.get(9 * next + i).getImage());
            Image image = icon.getImage().getScaledInstance(arr[i].getWidth(), arr[i].getHeight(), Image.SCALE_SMOOTH);
            arr[i].setIcon(new ImageIcon(image));
            grid_panal.add(arr[i]);
            arr[i].addMouseListener(this);
        }
        if (next == 0) {
            prevl.setVisible(false);
        }
    }//GEN-LAST:event_prevlMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            card_panal.add("search", new search());
            Project.card.show(card_panal, "search");
        } catch (Exception ex) {        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        card_panal.add("showcart", new showcart());
        Project.card.show(card_panal, "showcart");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void buy_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buy_btnActionPerformed
        buy();
        data_panal.setVisible(false);
    }//GEN-LAST:event_buy_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buy_btn;
    private javax.swing.JLabel categoryl;
    private javax.swing.JLabel codel;
    private javax.swing.JPanel data_panal;
    private javax.swing.JLabel detailsl;
    private javax.swing.JPanel grid_panal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel namel;
    private javax.swing.JLabel nextl;
    private javax.swing.JLabel prevl;
    private javax.swing.JLabel pricel;
    private javax.swing.JLabel shopid;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel check_label = (JLabel) e.getSource();
        for (int i = 0; i < 9; i++) {
            if (check_label == arr[i]) {
                try {
                    namel.setText(list.get(9 * next + i).getName());
                    codel.setText(list.get(9 * next + i).getCode());
                    pricel.setText(list.get(9 * next + i).getPrice() + "");
                    detailsl.setText(list.get(9 * next + i).getDetails());
                    categoryl.setText(list.get(9 * next + i).getCategory());
                    shopid.setText(list.get(9 * next + i).getShop_id());
                    data_panal.setVisible(true);
                } catch (Exception ex) {}
            }

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
