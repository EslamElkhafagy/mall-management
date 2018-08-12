package FrontApp.Panels;

import FrontApp.Classes.staticV;
import FrontApp.Classes.DB;
import FrontApp.Project;
import static FrontApp.Project.card;
import static FrontApp.Project.card_panal;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class showcart extends javax.swing.JPanel {

    Vector elect, elect1;
    static ObjectOutputStream output;
    DB o;
    
    PreparedStatement ps = null;
    Connection con = null ;
    
    
    
    public showcart() {
        initComponents();
        con = DB.getConnection();
        tableview();
         table.setOpaque(false);
        ((DefaultTableCellRenderer)table.getDefaultRenderer(Object.class)).setOpaque(false);
        table.setShowGrid(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        feedpanal.setVisible(false);
    }
    
    public double sum() {
        int rowcount = table.getRowCount();
        double sum = 0;
        for (int i = 0; i < rowcount; i++) {
            sum += Double.parseDouble(table.getValueAt(i, 2).toString());
        }
        return sum;
    }
    
    public void tableview() {
        Vector v = new Vector();
        v.add("Name");
        v.add("Code");
        v.add("Price");
        v.add("Details");
        v.add("Category");
        v.add("Shop ID");
        table.setModel(new DefaultTableModel(main_panal.all, v));
        totall.setText(Math.round(sum()) + "");
    }

    public void send_cart(){
        int rowcount = table.getRowCount();;
        HashSet<String> x = new HashSet<String>();
        for (int i = 0; i < rowcount; i++) {
            x.add(table.getValueAt(i, 5).toString());
        }
        
        String[] A = new String[x.size()];
        x.toArray(A);
        String[] B = new String[A.length];
        Arrays.fill(B, "");
        String[] C = new String[A.length];
        Arrays.fill(C, "");
        String[] D = new String[A.length];
        Arrays.fill(D, "");
        
        for (int i = 0; i < rowcount; i++) {
            for (int j = 0; j < A.length; j++) {
                if(table.getValueAt(i, 5).toString().equalsIgnoreCase(A[j])){
                    B[j]+=table.getValueAt(i, 1).toString()+" ";
                    C[j]+=table.getValueAt(i, 4).toString()+" ";
                    D[j]+="1 " ;
                }
            }
        }
        for (int j = 0; j < A.length; j++){
            B[j] = B[j].substring(0, B[j].length()-1);
            C[j] = C[j].substring(0, C[j].length()-1);
            D[j] = D[j].substring(0, D[j].length()-1);
        }
        try {
            for(int i = 0 ; i < A.length ; i++){
                ps = con.prepareStatement("INSERT INTO bill_history"
                        + "(catergories, items_num, items_codes, date, status, shop_id, price) VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, C[i]);
                ps.setString(2, D[i]);
                ps.setString(3, B[i]);
                ps.setString(4, staticV.getCurrentDateTime());
                ps.setString(5, "false");
                ps.setString(6, A[i]);
                ps.setDouble(7, sum());
                ps.executeUpdate(); 
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR IN BILL");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totall = new javax.swing.JLabel();
        feedpanal = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_message = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        table.setForeground(new java.awt.Color(204, 204, 204));
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
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 90, 650, 580);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(20, 10, 120, 60);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(780, 600, 190, 70);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(1060, 600, 190, 70);

        totall.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totall.setForeground(new java.awt.Color(255, 255, 255));
        add(totall);
        totall.setBounds(900, 450, 100, 40);

        feedpanal.setOpaque(false);
        feedpanal.setLayout(null);

        txt_message.setColumns(20);
        txt_message.setRows(5);
        jScrollPane2.setViewportView(txt_message);

        feedpanal.add(jScrollPane2);
        jScrollPane2.setBounds(3, 5, 230, 170);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEND");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        feedpanal.add(jLabel3);
        jLabel3.setBounds(10, 190, 90, 30);

        add(feedpanal);
        feedpanal.setBounds(1090, 80, 240, 230);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(1090, 10, 230, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\icons\\received_1855285824742856.png")); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-4, 0, 1380, 720);
    }// </editor-fold>//GEN-END:initComponents
        

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Project.card.show(card_panal, "main");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        send_cart();
        try {
            main_panal.all = new Vector();
            card_panal.removeAll();
            card_panal.add("start", new Waiting());
        card.show(card_panal, "start");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + "\n in  action show");
        }

        MessageFormat header = new MessageFormat("Happy Shopping ^_^  ");
        MessageFormat footer = new MessageFormat("page{0,number,integer}");
        try {
            DefaultTableModel model =(DefaultTableModel) table.getModel();
           
            table.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e+"\n in action print cart");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        try {
            ps = con.prepareStatement("update "+staticV.div+" SET amount = amount+1 WHERE code = '"+table.getValueAt(table.getSelectedRow(), 1)+"'");
            ps.executeUpdate();
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(table.getSelectedRow());
            totall.setText(sum() + "");
        } catch (SQLException ex) {
            Logger.getLogger(showcart.class.getName()).log(Level.SEVERE, null, ex);
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
DB a = new DB();
a.feedback(txt_message.getText());
txt_message.setText("");
feedpanal.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
feedpanal.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel feedpanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JLabel totall;
    private javax.swing.JTextArea txt_message;
    // End of variables declaration//GEN-END:variables
}
