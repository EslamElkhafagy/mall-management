package FrontApp.Panels;

import FrontApp.Classes.staticV;
import FrontApp.Project;
import static FrontApp.Project.card;
import static FrontApp.Project.card_panal;
import java.util.Vector;
import java.io.*;
import javax.swing.JOptionPane;

public class main_panal extends javax.swing.JPanel {

  
   public static Vector all;
    public main_panal() {
        initComponents();
        data.list.clear();
        if(all==null ||all.size()==0)
            all= new Vector();
     //   speak();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(130, 144, 170, 220);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(440, 134, 190, 230);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        add(jLabel4);
        jLabel4.setBounds(740, 134, 210, 230);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(1060, 134, 180, 220);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        add(jLabel6);
        jLabel6.setBounds(1044, 434, 190, 220);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        add(jLabel7);
        jLabel7.setBounds(764, 434, 170, 220);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        add(jLabel8);
        jLabel8.setBounds(444, 434, 170, 220);

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        add(jLabel9);
        jLabel9.setBounds(130, 430, 170, 220);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10);
        jLabel10.setBounds(170, 30, 170, 60);

        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        add(jLabel11);
        jLabel11.setBounds(10, 20, 140, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/front/main.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1360, 690);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        staticV.div = "din_items";
        card_panal.add("all_food", new all_food());
        Project.card.show(card_panal, "all_food");
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        staticV.div = "elect_items";
        card_panal.add("all_electronic", new all_electronic());
        Project.card.show(card_panal, "all_electronic");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        card_panal.add("showcart", new showcart());
        Project.card.show(card_panal, "showcart");
               
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        staticV.div = "pharm_items";
        card_panal.add("all_pharm", new all_pharm());
        Project.card.show(card_panal, "all_pharm");
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        staticV.div = "lib_items";
        card_panal.add("all_lib", new all_lib());
        Project.card.show(card_panal, "all_lib");
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        staticV.div = "cin_items";
        card_panal.add("all_cin", new all_cin());
        Project.card.show(card_panal, "all_cin");
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        staticV.div = "clothes_items";
        card_panal.add("all_clothes", new all_clothes());
        Project.card.show(card_panal, "all_clothes");
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        card_panal.add("about", new about());
        Project.card.show(card_panal, "about");
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        card_panal.add("map", new map());
        Project.card.show(card_panal, "map");
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        card_panal.add("start", new Waiting());
        card.show(card_panal, "start");
    }//GEN-LAST:event_jLabel11MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
