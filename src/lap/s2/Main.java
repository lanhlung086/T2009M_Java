package lap.s2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        SoNguyenTo snt = new SoNguyenTo();
        System.out.println("SNT: "+snt.getA());
        snt.timSoNguyenToTiepTheo();
        System.out.println("SNT: "+snt.getA());
    }
}
