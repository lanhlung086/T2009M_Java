package lap.s2_2;

import com.sun.org.apache.xml.internal.security.keys.content.KeyInfoReference;

import java.util.Scanner;

public class Fraction {
    int TuSo;
    int MauSo;

    public Fraction() {

    }

    public int getTuSo() {
        return TuSo;
    }

    public void setTuSo(int tuSo) {
        this.TuSo = tuSo;
    }

    public int getMauSo() {
        return MauSo;
    }

    public void setMauSo(int mauSo) {
        this.MauSo = mauSo;
    }


    public void NhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so: ");
        TuSo = sc.nextInt();
        System.out.println("nhap mau so: ");
        do{
            MauSo = sc.nextInt();
            if (MauSo==0) System.out.println("nhap lai mau so");
        }while(MauSo==0);
    }

    public void InPS(){
        System.out.println("Fraction: "+getTuSo()+"/"+getMauSo());
    }

    public int UCLN(int x, int y){
        while (x!=y){
            if (x>y){
                x-=y;
            }else {
                y-=x;
            }
        }
        return x;
    }


    public void RutGonPS(){
        int i = UCLN(this.getTuSo(),this.getMauSo());
        this.setTuSo(this.getTuSo()/i);
        this.setMauSo(this.getMauSo()/i);
        System.out.println("phan so toi gian la: "+getTuSo()+"/"+getMauSo());
    }

    public void NghichDaoPS(){
        System.out.println("phan so nghich dao la: "+getMauSo()+"/"+getTuSo());
    }

    public void CongPS(Fraction ps1,Fraction ps2){
        int tuSo = ps1.getTuSo() * ps2.getMauSo() + ps1.getMauSo() * ps2.getTuSo();
        int mauSo = ps1.getMauSo() * ps2.getMauSo();
        Fraction TongPS = new Fraction();
        TongPS.RutGonPS();
        System.out.println("Tong phan so la: "+getTuSo()+"/"+getMauSo());
    }

    public void TruPS(Fraction ps1,Fraction ps2){
        int tuSo = ps1.getTuSo() * ps2.getMauSo() - ps1.getMauSo() * ps2.getTuSo();
        int mauSo = ps1.getMauSo() * ps2.getMauSo();
        Fraction HieuPS = new Fraction();
        HieuPS.RutGonPS();
        System.out.println("Hieu phan so la: "+getTuSo()+"/"+getMauSo());
    }

    public void NhanPS(Fraction ps1, Fraction ps2){
        int tuSo = ps1.getTuSo()*ps2.getTuSo();
        int mauSo = ps1.getMauSo()* ps2.getMauSo();
        Fraction TichPS = new Fraction();
        TichPS.RutGonPS();
        System.out.println("Tich hai phan so la: "+getTuSo()+"/"+getMauSo());
    }

    public void ChiaPS(Fraction ps1, Fraction ps2){
        int tuSo = ps1.getTuSo() * ps2.getMauSo();
        int mauSo = ps1.getMauSo() * ps2.getTuSo();
        Fraction ThuongPS = new Fraction();
        ThuongPS.RutGonPS();
        System.out.println("Thuong hai phan so la: "+getTuSo()+"/"+getMauSo());
    }

}