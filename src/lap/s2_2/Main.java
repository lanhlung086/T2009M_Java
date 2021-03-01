package lap.s2_2;

public class Main {
    public static void main(String[] args){
        Fraction ps1 = new Fraction();
        ps1.setTuSo(1);
        ps1.setMauSo(2);

        Fraction ps2 = new Fraction();
        ps2.setTuSo(2);
        ps2.setMauSo(8);

        Fraction ps = ps1.add(ps2);
        ps.InPS();
    }
}
