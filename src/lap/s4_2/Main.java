package lap.s4_2;

public class Main {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien();
        sv1.setDiaChi("Hà Nội");
        sv1.setHoTen("Nguyễn Phương Anh");
        sv1.setMaSV("SV01");
        sv1.setSdt("0904537529");

        SinhVien sv2 = new SinhVien();
        sv2.setDiaChi("Thái Bình");
        sv2.setHoTen("Bùi Minh Khải");
        sv2.setMaSV("SV06");
        sv2.setSdt("0393157728");

        LopHoc lh = new LopHoc();
        lh.setMaLop("TM2001.1");
        lh.setPhongHoc("202");
        lh.setTenLop("K60");

        lh.addSV(sv1);
        lh.addSV(sv2);

        lh.In();
    }
}
