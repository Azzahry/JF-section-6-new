
package inventory;


public class Product {

    //Instance field declarations
    private int item;
    private String name;
    private int qty;
    private double price;
    private boolean active = true;
    private double inventoryValue;
    
    public Product(){
        
    }
    public Product (int item, String name, int qty, double price){
        this.item = item;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    
    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }
    public String getName() {
        return name;
    }

    public void setName(String nama) {
        this.name = nama;
    }
    
    public int getQty() {
        return qty;
    }

    public void setQty(int stock) {
        this.qty = stock;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public double getInventoryValue() {
        return inventoryValue;
    }

    public void setInventoryValue(double inventoryValue) {
        this.inventoryValue = inventoryValue;
    }

    
    @Override
    public String toString(){
        
        String viewProduct;
        viewProduct = "Item number :"+ getItem()+
                      "\nName :"+ getName()+
                      "\nQuantity in Stock :"+ getQty()+
                      "\nPrice :"+ getPrice()+
                      "\nStock Value :"+ getInventoryValue()+
                      "\nProduct Status : Active ("+ getActive()+")";
        
        return viewProduct;
    }
    public String toString2(){
        
        String viewProduct;
        viewProduct = "Item number :"+ getItem()+
                      "\nName :"+ getName()+
                      "\nQuantity in Stock :"+ getQty()+
                      "\nPrice :"+ getPrice()+
                      "\nStock Value :"+ getInventoryValue()+
                      "\nProduct Status : Discontinue ("+getActive()+")";
        
        return viewProduct;
    }
}

