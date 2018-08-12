package FrontApp;

import FrontApp.Panels.Waiting;
import FrontApp.Panels.main_panal;
import java.awt.CardLayout;

public class Project extends javax.swing.JFrame {    
    static Project o;
    public static CardLayout card;
    
    public Project() {
        initComponents();
        laod_panals();
    }

    public void laod_panals() {
        card = new CardLayout();
        card_panal.setLayout(card);
        card_panal.add("start", new Waiting());
        card.show(card_panal, "start");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card_panal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        card_panal.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout card_panalLayout = new javax.swing.GroupLayout(card_panal);
        card_panal.setLayout(card_panalLayout);
        card_panalLayout.setHorizontalGroup(
            card_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        card_panalLayout.setVerticalGroup(
            card_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        o = new Project();
        o.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel card_panal;
    // End of variables declaration//GEN-END:variables
}
