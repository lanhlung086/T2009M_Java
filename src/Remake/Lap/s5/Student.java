package Remake.Lap.s5;

import java.util.Scanner;

public class Student extends Person{
    public int id;
    public int point;
    public String email;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        Scanner st = new Scanner(System.in);
        System.out.println("nhap ma sinh vien: ");
        setId(st.nextInt());
        System.out.println("nhap diem thi: ");
        setPoint(st.nextInt());
        System.out.println("nhap email: ");
        setEmail(st.next());
    }

    @Override
    public void OutInfo() {
        super.OutInfo();
        System.out.println("Ma sinh vien: "+getId());
        System.out.println("Diem thi: "+getPoint());
        System.out.println("Email: "+getEmail());
    }

    public void KiemTra(){
        if (getPoint()>8){
            System.out.println("Du dieu kien nhan hoc bong");
        } else System.out.println("Khong du dieu kien nhan hoc bong");
    }
}
