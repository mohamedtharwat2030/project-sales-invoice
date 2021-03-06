/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvScreen;

import SalesInvControl.InvControl;
import SalesInvData.InvAllData;
import SalesInvData.TableModelInv;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author M Tharwat
 */
public class OrignalFrame extends javax.swing.JFrame {

    /**
     * Creates new form OrignalFrame
     */
    public OrignalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoicesTable = new javax.swing.JTable();
        invoicesTable.getSelectionModel().addListSelectionListener(invControl);
        createNewInvButton = new javax.swing.JButton();
        createNewInvButton.addActionListener(invControl);
        deleteInvButton = new javax.swing.JButton();
        deleteInvButton.addActionListener(invControl);
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invNumberLabel = new javax.swing.JLabel();
        invDataLabel = new javax.swing.JLabel();
        customerNameLabel = new javax.swing.JLabel();
        invTotalLabel = new javax.swing.JLabel();
        saveItemButton = new javax.swing.JButton();
        saveItemButton.addActionListener(invControl);
        cancelItemButton = new javax.swing.JButton();
        cancelItemButton.addActionListener(invControl);
        jScrollPane2 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        loadfileItem = new javax.swing.JMenuItem();
        loadfileItem.addActionListener(invControl);
        savefileitem = new javax.swing.JMenuItem();
        savefileitem.addActionListener(invControl);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(invoicesTable);

        createNewInvButton.setText("Create New Invoice");
        createNewInvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewInvButtonActionPerformed(evt);
            }
        });

        deleteInvButton.setText("Delete Invoice");

        jLabel3.setText("Invoice Number");

        jLabel4.setText("Invoice Date");

        jLabel5.setText("Customer Name");

        jLabel6.setText("Invoice Total");

        invNumberLabel.setText("jLabel5");

        invDataLabel.setText("jLabel6");

        customerNameLabel.setText("jLabel7");

        invTotalLabel.setText("jLabel8");

        saveItemButton.setText("Save Item");

        cancelItemButton.setText("Cancel Item");
        cancelItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelItemButtonActionPerformed(evt);
            }
        });

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(itemsTable);

        FileMenu.setText("File");

        loadfileItem.setText("Load File");
        FileMenu.add(loadfileItem);

        savefileitem.setText("Save File");
        FileMenu.add(savefileitem);

        jMenuBar1.add(FileMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(createNewInvButton)
                        .addGap(34, 34, 34)
                        .addComponent(deleteInvButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invNumberLabel)
                            .addComponent(invDataLabel)
                            .addComponent(customerNameLabel)
                            .addComponent(invTotalLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(saveItemButton)
                        .addGap(49, 49, 49)
                        .addComponent(cancelItemButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(invNumberLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invDataLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(customerNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(invTotalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteInvButton)
                        .addComponent(saveItemButton)
                        .addComponent(cancelItemButton))
                    .addComponent(createNewInvButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createNewInvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewInvButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createNewInvButtonActionPerformed

    private void cancelItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelItemButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelItemButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OrignalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrignalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrignalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrignalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrignalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenu;
    private javax.swing.JButton cancelItemButton;
    private javax.swing.JButton createNewInvButton;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteInvButton;
    private javax.swing.JLabel invDataLabel;
    private javax.swing.JLabel invNumberLabel;
    private javax.swing.JLabel invTotalLabel;
    private javax.swing.JTable invoicesTable;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadfileItem;
    private javax.swing.JButton saveItemButton;
    private javax.swing.JMenuItem savefileitem;
    // End of variables declaration//GEN-END:variables
    private ArrayList<InvAllData> invoices ;
    private InvControl invControl =new InvControl(this) ;
    private TableModelInv tableModelInv ;
    
    public ArrayList<InvAllData> getInvoices() {
       if (invoices == null) invoices = new ArrayList<>();
        return invoices;
    }

    public void setInvoices(ArrayList<InvAllData> invoices) {
        this.invoices = invoices;
    }

    public TableModelInv getTableModelInv() {
        if(tableModelInv == null){
          tableModelInv = new TableModelInv(getInvoices());
        
        }
        return tableModelInv;
    }

    public void setTableModelInv(TableModelInv tableModelInv) {
        this.tableModelInv = tableModelInv;
    }

    public JLabel getCustomerNameLabel() {
        return customerNameLabel;
    }

    public JLabel getInvDataLabel() {
        return invDataLabel;
    }

    public JLabel getInvNumberLabel() {
        return invNumberLabel;
    }

    public JLabel getInvTotalLabel() {
        return invTotalLabel;
    }

    public JTable getInvoicesTable() {
        return invoicesTable;
    }

    public JTable getItemsTable() {
        return itemsTable;
    }

    public InvControl getInvControl() {
        return invControl;
    }
    
     public int getNextInvoiceNum() {
        int invNum = 0;
        
        for (InvAllData invoice : getInvoices()) {
            if (invoice.getNum() > invNum) 
                invNum = invoice.getNum();
        }
        return ++invNum;
    }

}
