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
        if (mauSo!=0)
            this.MauSo = mauSo;
        else
            this.MauSo = 1;
    }


    public void NhapPS(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu so: ");
//        TuSo = sc.nextInt();
        setTuSo(sc.nextInt());
        System.out.println("nhap mau so: ");
        do{
            setMauSo(sc.nextInt());
            if (getMauSo()==0) System.out.println("nhap lai mau so");
        }while(getMauSo()==0);
    }

    public void InPS(){
        System.out.println("Fraction: "+getTuSo()+"/"+getMauSo());
    }



    public void RutGonPS(){
        int min = Math.min(this.getTuSo(),this.getMauSo());
        int ucln = 0;
        for (int i=1; i<=min; i++){
            if (getTuSo()%i==0&&getMauSo()%i==0)
                ucln = i;
        }
        setTuSo(getTuSo()/ucln);
        setMauSo(getMauSo()/ucln);
    }

    public void NghichDaoPS(){
        if (getTuSo()!=0){
            int c = getTuSo();
            setTuSo(getMauSo());
            setMauSo(c);
            return;
        }
        System.out.println("khong nghich dao duoc");
    }

    public Fraction add(Fraction ps){
        int tuSo = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        Fraction TongPS = new Fraction();
        TongPS.setMauSo(mauSo);
        TongPS.setTuSo(tuSo);
        TongPS.RutGonPS();
        return TongPS;
    }

    public Fraction sub(Fraction ps){
        int tuSo = this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        Fraction HieuPS = new Fraction();
        HieuPS.setMauSo(mauSo);
        HieuPS.setTuSo(tuSo);
        HieuPS.RutGonPS();
        return HieuPS;
    }

    public Fraction mul(Fraction ps){
        int tuSo = this.getTuSo()*ps.getTuSo();
        int mauSo = this.getMauSo()* ps.getMauSo();
        Fraction TichPS = new Fraction();
        setMauSo(mauSo);
        setTuSo(tuSo);
        TichPS.RutGonPS();
        return TichPS;
    }

    public Fraction div(Fraction ps){
        int tuSo = this.getTuSo() * ps.getMauSo();
        int mauSo = this.getMauSo() * ps.getTuSo();
        Fraction ThuongPS = new Fraction();
        ThuongPS.RutGonPS();
        return ThuongPS;
    }

}