package Asm.s3;

public class Main {
    public static void main(String[] args){
        Product sp1 = new Product();
        sp1.setID(1);
        sp1.setProductName("Tai nghe bluetooth");
        sp1.setQty(3);
        sp1.setPrice(200000);

        Product sp2 = new Product();
        sp2.setID(2);
        sp2.setProductName("Chuot bluetooth");
        sp2.setQty(2);
        sp2.setPrice(500000);

        Cart c = new Cart();
        c.setID(1);
        c.setCustomer("kHa BaNh");
        c.setCity("HN");
        c.add(sp1);
        c.add(sp1);
        c.add(sp1);

        c.setID(2);
        c.setCustomer("Dung Toc Dai");
        c.setCity("HCM");
        c.add(sp2);
        c.add(sp2);

        System.out.println("Danh sach san pham");
        for (Product sp: c.getProductList()){
            System.out.println(sp.getID()+""+sp.getProductName()+""+sp.getPrice());
        }

        System.out.println("tong tien la: "+ c.checkout());
    }
}
