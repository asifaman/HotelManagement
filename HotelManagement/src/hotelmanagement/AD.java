/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import Utility.Utility2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SABER
 */
public class AD extends javax.swing.JFrame {
    private Object[][] data;
    static Object selecteditem2;
 public AD() {
        initComponents();
        javax.swing.Timer t;
        t = new javax.swing.Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setDate();
            }
        });
        t.start();
        this.setExtendedState(this.getExtendedState() | AD.MAXIMIZED_BOTH);
        loadtable();
    }
    /**
     * Creates new form AD
     */
  public void setDate() {
        Date date = new Date();
       DATE.setText("Date :- " + date.toLocaleString());
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
        jLabel3 = new javax.swing.JLabel();
        kbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        new2 = new javax.swing.JButton();
        edit2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        cbox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        DATE = new javax.swing.JLabel();
        month = new javax.swing.JButton();
        day = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CRITERIA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("SEARCH KEY");

        kbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kboxKeyReleased(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
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
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        new2.setText("NEW");
        new2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new2ActionPerformed(evt);
            }
        });

        edit2.setText("EDIT");
        edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit2ActionPerformed(evt);
            }
        });

        delete2.setText("DELETE");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });

        cbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ROOM NO", "GUEST NAME", "PAY", "EXPEND", "BALANCE" }));

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("HOTEL THE PAN PACIFIC ISLAND");

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        month.setText("MONTH");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        day.setText("DAY");
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(kbox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addComponent(day)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254)
                        .addComponent(delete2)
                        .addGap(18, 18, 18)
                        .addComponent(edit2)
                        .addGap(18, 18, 18)
                        .addComponent(new2)))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(kbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(day)
                        .addComponent(month))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(new2)
                        .addComponent(edit2)
                        .addComponent(delete2)
                        .addComponent(jButton1))
                    .addComponent(DATE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new2ActionPerformed
        // TODO add your handling code here:
        new NEW(this,true,false).setVisible(true);
        loadtable();
        
        
    }//GEN-LAST:event_new2ActionPerformed

    private void kboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kboxKeyReleased
        // TODO add your handling code here:
        String searchCol = "";
         int count = 0;
          if (cbox.getSelectedIndex() == 0) {
            searchCol = "ROOM_NO";
        } else if (cbox.getSelectedIndex() == 1) {
            searchCol = "GUEST_NAME";
        } else if (cbox.getSelectedIndex() == 2) {
            searchCol = "PAY";
        } else if( cbox.getSelectedIndex() == 3) {
            searchCol = "EXPEND";
        }else if (cbox.getSelectedIndex() == 4) {
            searchCol = "BALANCE";
        }

        String sql = "SELECT count(ROOM_NO) FROM manager.acctable WHERE " + searchCol + " LIKE '" + kbox.getText() + "%'";
        count = Utility2.countQuery(kbox, sql);

        data = new Object[count][4];

        sql = "SELECT * FROM manager.acctable WHERE " + searchCol + " LIKE '" + kbox.getText() + "%'";
        data = Utility2.getMultiRowQueryObjects(sql, cbox, count);


        Object[] header = {"ROOM NO", "GUEST NAME", "PAY", "EXPEND", "BALANCE"};
        DefaultTableModel dtm = new DefaultTableModel(data, header);
        table2.setModel(dtm);
        
    }//GEN-LAST:event_kboxKeyReleased

    private void edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit2ActionPerformed
        // TODO add your handling code here:
        selecteditem2 = data[table2.getSelectedRow()][0];
        
        new NEW(this, true,true).setVisible(true);
        loadtable();
    }//GEN-LAST:event_edit2ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        // TODO add your handling code here:
        edit2.setEnabled(true);
        delete2.setEnabled(true);
    }//GEN-LAST:event_table2MouseClicked

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        // TODO add your handling code here:
        selecteditem2 = data[table2.getSelectedRow()][0];
        String sql = "DELETE  manager.ACCTABLE WHERE ROOM_NO = '" + selecteditem2 + "'";
        Utility2.insertUpdateQuery(sql, delete2, 3);
        loadtable();
    }//GEN-LAST:event_delete2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           MFrame NEW = new MFrame();
        this.setVisible(false);
        NEW.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
        Dayprofit NEW = new Dayprofit();
        this.setVisible(false);
        NEW.setVisible(true);
    }//GEN-LAST:event_dayActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
        
        LoginFrame NEW=new LoginFrame();
        this.setVisible(true);
        NEW.setVisible(true);
       // Monthlyprofit NEW=new Monthlyprofit();
       // this.setVisible(false);
        //NEW.setVisible(true);
        
    }//GEN-LAST:event_monthActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new AD().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DATE;
    private javax.swing.JComboBox cbox;
    private javax.swing.JButton day;
    private javax.swing.JButton delete2;
    private javax.swing.JButton edit2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kbox;
    private javax.swing.JButton month;
    private javax.swing.JButton new2;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables

    private void loadtable() {
         Object[] header = {"ROOM NO", "GUEST NAME", "PAY", "EXPEND", "BALANCE"};

        String sql = "SELECT COUNT(guest_name) FROM manager.acctable";
        int bookCount = Utility2.countQuery(table2, sql);

        data = new Object[bookCount][12];

        sql = "SELECT * FROM manager.acctable";
        data = Utility2.getMultiRowQueryObjects(sql, table2, bookCount);




        DefaultTableModel dtm = new DefaultTableModel(data, header);
        table2.setModel(dtm);

        edit2.setEnabled(false);
        delete2.setEnabled(false);
    }
}
