
package SalesInvData;

public class DataLine {
    private String itemName ;
    private double price ;
    private int count ;
    private InvAllData invoice ;
    

    public DataLine() {
    }

    public DataLine( String itemName, double price, int count) {
        
        this.itemName = itemName;
        this.price = price;
        this.count = count;
    }

    public DataLine( String itemName, double price, int count, InvAllData invoice) {
        
        this.itemName = itemName;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }
    
    public double getDataLineTotal (){
        
        return price*count ;
    }

    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DataLine{" + " invoice=" + invoice.getNum() +  ",itemName=" + itemName + ", price=" + price + ", count=" + count + '}';
    }

    public InvAllData getInvoice() {
        return invoice;
    }

    public String getCsvFile() {
        return invoice.getNum() + "," + itemName + "," + price + "," + count;
    }
    
            
    
    
    
}
