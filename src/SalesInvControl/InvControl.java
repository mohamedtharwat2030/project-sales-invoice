
package SalesInvControl;

import SalesInvData.DataLine;
import SalesInvData.InvAllData;
import SalesInvData.ItemTableModel;
import SalesInvData.TableModelInv;
import SalesInvScreen.InvPopup;
import SalesInvScreen.ItemPopup;
import SalesInvScreen.OrignalFrame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.w3c.dom.xpath.XPathResult;

public class InvControl implements ActionListener , ListSelectionListener{
    
    private OrignalFrame frame ;
    private InvPopup invPopup ;
    private ItemPopup itemPopup ;
    
    public InvControl(OrignalFrame frame) {
    this.frame = frame ;
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String actionCommand = e.getActionCommand();
       
        System.out.println("Action   " +actionCommand);
        
        switch(actionCommand){
            
            case "Load File":
                loadFile();
                break;
                
            case "Save File":
                saveFile();
                break;
                
            case "Create New Invoice":
                createNewInvoice();
                break;    
            
            case "Delete Invoice":
                deleteInvoice();
                break;
                
            case "Save Item":
                saveNewItem();
                break;
                
            case "Cancel Item":
                cancelItem();
                break;   
            case "cancelCreateInvoice":
                cancelCreateInvoice();
                break;
            case "okCreateInvoice":
                okCreateInvoice();
                break;
            case "oKCreateItem":
                oKCreateItem();
                break;
            case "cancelcreateItem":
                cancelcreateItem();
                break;
            
        }


    }

    
    @Override
    public void valueChanged(ListSelectionEvent e) {
       int indexSelect = frame.getInvoicesTable().getSelectedRow();
       if (indexSelect != -1 ){
       System.out.println("you select"+ indexSelect);
        InvAllData thisInv = frame.getInvoices().get(indexSelect); 
        frame.getInvNumberLabel().setText(""+thisInv.getNum());
        frame.getInvDataLabel().setText(thisInv.getDate());
        frame.getCustomerNameLabel().setText(thisInv.getCustomer());
        frame.getInvTotalLabel().setText(""+thisInv.getInvTotal());
        ItemTableModel itemTableModel = new ItemTableModel(thisInv.getDataLines());
        frame.getItemsTable().setModel(itemTableModel);
        itemTableModel.fireTableDataChanged();
       }
        
        
    }   
    
    private void loadFile() {
        JFileChooser fchoser = new JFileChooser();
        try{
            int chose = fchoser.showOpenDialog(null) ;
            if(chose == JFileChooser.APPROVE_OPTION){
                File mainfi = fchoser.getSelectedFile();
                Path mainPath = Paths.get(mainfi.getAbsolutePath()); 
                java.util.List<String> mainLines = Files.readAllLines(mainPath);
                System.out.println("im heeeeeeeeeeer");
                
                ArrayList<InvAllData> InvAllDataArray = new ArrayList<>();
                for (String eachLine : mainLines) {
                    String[] lineParts = eachLine.split(",");
                    int invoiceNumber = Integer.parseInt(lineParts[0]);
                    String invoiceDate = lineParts[1];
                    String customerName = lineParts[2];
                    
                    InvAllData invAllData = new InvAllData(invoiceNumber, invoiceDate, customerName);
                    InvAllDataArray.add(invAllData);
                }
                
                System.out.println("check");
                chose = fchoser.showOpenDialog(null) ;
            if(chose == JFileChooser.APPROVE_OPTION){
                File linefi = fchoser.getSelectedFile();
                Path linePath = Paths.get(linefi.getAbsolutePath()); 
               java.util.List<String> allLines = Files.readAllLines(linePath);
                System.out.println("im Lineeeeeeeeee ");
                
                for (String allLine : allLines) {
                        String sLineParts[] = allLine.split(",");
                        int InvoiceNumber = Integer.parseInt(sLineParts[0]);
                        String itemName = sLineParts[1];
                        double itemPrice = Double.parseDouble(sLineParts[2]);
                        int count = Integer.parseInt(sLineParts[3]);
                        InvAllData inv = null;
                        for (InvAllData invoiceN : InvAllDataArray) {
                            if (invoiceN.getNum() == InvoiceNumber) {
                                inv = invoiceN;
                                break;
                            }
                        }
                        
                        DataLine sline = new DataLine( itemName, itemPrice,count, inv);
                        inv.getDataLines().add(sline);
                    }
                    System.out.println("Check point");
                }
                frame.setInvoices(InvAllDataArray);
                TableModelInv tableModelInv = new TableModelInv(InvAllDataArray);
                frame.setTableModelInv(tableModelInv);
                frame.getInvoicesTable().setModel(tableModelInv);
                frame.getTableModelInv().fireTableDataChanged();
                
                
          
            
            }
           
         }  catch(IOException ex){
             ex.printStackTrace();
             } 
    }

    private void saveFile() {
ArrayList<InvAllData> invoices = frame.getInvoices();
        String head = "";
        String lines = "";
        for (InvAllData invoice : invoices) {
            
               String CsvInvoice = invoice.getCsvFile();
            head += CsvInvoice;
               head += "\n";

            for (DataLine line : invoice.getDataLines()) {
                String CsvItems = line.getCsvFile();
                lines += CsvItems;
                lines += "\n";
            }
        }
        System.out.println("Please Test ");
        try {
            JFileChooser filechose = new JFileChooser();
            int result = filechose.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File firstFile = filechose.getSelectedFile();
                FileWriter fWriter = new FileWriter(firstFile);
                fWriter.write(head);
                fWriter.flush();
                fWriter.close();
                
                result = filechose.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File ItemFile = filechose.getSelectedFile();
                    FileWriter fWriter2 = new FileWriter(ItemFile);
                    fWriter2.write(lines);
                    fWriter2.flush();
                    fWriter2.close();
                }
            }
        } catch (Exception ex) {

        }

    }

    private void createNewInvoice() {
        invPopup = new InvPopup(frame);
        invPopup.setVisible(true);


    }

    private void deleteInvoice() {
    int thisRow = frame.getInvoicesTable().getSelectedRow();
    if (thisRow != -1 ) {
        frame.getInvoices().remove(thisRow);
        frame.getTableModelInv().fireTableDataChanged();
    
     }
    } 

    private void saveNewItem() {
        itemPopup = new ItemPopup(frame);
        itemPopup.setVisible(true);
    }
    private void cancelItem() {
       /* int selectedInvoice = frame.getInvoicesTable().getSelectedRow();
        int selectedRow = frame.getItemsTable().getSelectedRow();
        
        if(selectedInvoice !=-1 && selectedRow != -1){
        InvAllData invAllData = frame.getInvoices().get(selectedInvoice);
        invAllData.getDataLines().remove(selectedRow);
        ItemTableModel itemTableModel = new ItemTableModel(invAllData.getDataLines());
        frame.getItemsTable().setModel(itemTableModel);
        itemTableModel.fireTableDataChanged();
        */
       int selectedRow = frame.getItemsTable().getSelectedRow();

        if (selectedRow != -1) {
            ItemTableModel itemTableModel = (ItemTableModel) frame.getItemsTable().getModel();
            itemTableModel.getDataLines().remove(selectedRow);
            itemTableModel.fireTableDataChanged();
            frame.getTableModelInv().fireTableDataChanged();
       
        }
    }
    private void cancelCreateInvoice() {
        invPopup.setVisible(false);
        invPopup.dispose();
        invPopup = null ;
    }

    private void okCreateInvoice() {
        String date = invPopup.getAllinvoiceDateField().getText();
        String customer = invPopup.getCustomerNmField().getText();
                int invNum = frame.getNextInvoiceNum();       
                InvAllData invoice = new InvAllData(invNum , date , customer);
                frame.getInvoices().add(invoice);
                frame.getTableModelInv().fireTableDataChanged();
                invPopup.setVisible(false);
                invPopup.dispose();
                invPopup = null;
    }

    private void oKCreateItem() {
        
         String item = itemPopup.getItemNmField().getText();
        String count1 = itemPopup.getCtItemsField().getText();
        String price1 = itemPopup.getPriceItemField().getText();
        int count2 = Integer.parseInt(count1);
        double price2 = Double.parseDouble(price1);
        int selectedInvoice = frame.getInvoicesTable().getSelectedRow();
        if (selectedInvoice != -1) {
            InvAllData invoice = frame.getInvoices().get(selectedInvoice);
            DataLine line = new DataLine(item, price2, count2, invoice);
            invoice.getDataLines().add(line);
            ItemTableModel itemTableModel = (ItemTableModel) frame.getItemsTable().getModel();
            itemTableModel.fireTableDataChanged();
            frame.getTableModelInv().fireTableDataChanged(); 
           }
        itemPopup.setVisible(false);
        itemPopup.dispose();
        itemPopup=null;
        
    }    

    private void cancelcreateItem() {
        
        itemPopup.setVisible(false);
        itemPopup.dispose();
        itemPopup = null ;
        
    }
    
}
