package Asm.s3;

import java.util.ArrayList;

public class Cart {
    int ID;
    String customer;
    double grandTotal;
    ArrayList<Product> productList;
    String city;

    public Cart() {
        productList = new ArrayList<Product>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void add(Product sp){
        if (sp.checkQty()){
            productList.add(sp);
            sp.setQty(sp.getQty()-1);
            setGrandTotal(getGrandTotal()+sp.getPrice());
        } else System.out.println("vui long them san pham khac");
    }

    public void remove(Product sp){
        productList.remove(sp);
        sp.setPrice(sp.getQty()+1);
        setGrandTotal(getGrandTotal()-sp.getPrice());
    }

    public boolean checkCity(){
        return getCity() == "HN" || getCity() == "HCM";
    }

    public double checkout(){
        if (checkCity()){
            return  getGrandTotal() + getGrandTotal()*1/100;
        } else return getGrandTotal() + getGrandTotal()*2/100;
    }
}
