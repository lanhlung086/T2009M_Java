package Asm.s3;

public class Product {
    int ID;
    String productName;
    int qty;
    double price;

    public Product() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean checkQty(){
        if (qty > 0){
            System.out.println("con hang");
            return true;
        } else {
            System.out.println("het hang");
            return false;
        }
    }
}
