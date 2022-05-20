/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesInvScreen;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class InvPopup extends JDialog {
    private JTextField customerNmField;
    private JTextField allinvoiceDateField;
    private JLabel customerNmLabel;
    private JLabel allinvDateLabel;
    private JButton pressOk;
    private JButton PressCancel;

    public InvPopup(OrignalFrame frame) {
        customerNmLabel = new JLabel("Customer Name:");
        customerNmField = new JTextField(20);
        allinvDateLabel = new JLabel("Invoice Date:");
        allinvoiceDateField = new JTextField(20);
        pressOk = new JButton("OK");
        PressCancel = new JButton("Cancel");
        
        pressOk.setActionCommand("okCreateInvoice");
        PressCancel.setActionCommand("cancelCreateInvoice");
        
        pressOk.addActionListener(frame.getInvControl());
        PressCancel.addActionListener(frame.getInvControl());
        setLayout(new GridLayout(3, 2));
        
        add(allinvDateLabel);
        add(allinvoiceDateField);
        add(customerNmLabel);
        add(customerNmField);
        add(pressOk);
        add(PressCancel);
        
        pack();
        
    }

    public JTextField getCustomerNmField() {
        return customerNmField;
    }

    public JTextField getAllinvoiceDateField() {
        return allinvoiceDateField;
    }
    
}
