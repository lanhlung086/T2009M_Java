package lap.s4_2;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    String MaLop;
    String TenLop;
    String PhongHoc;
    ArrayList<SinhVien> StudentList ;

    public LopHoc() {
        StudentList = new ArrayList<SinhVien>();
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public String getPhongHoc() {
        return PhongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        PhongHoc = phongHoc;
    }

    public void addSV(SinhVien sv){
        StudentList.add(sv);
    }

    public void removeSV(int index){
        StudentList.remove(index);
    }

    public void In(){
        for (SinhVien i:StudentList){
            System.out.println("Ma SV: "+i.getMaSV());
            System.out.println(""+i.getHoTen());
            System.out.println(""+i.getDiaChi());
            System.out.println(""+i.getSdt());
        }
    }
}
