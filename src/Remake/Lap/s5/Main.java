package Remake.Lap.s5;

public class Main {
    public static void main(String[] args){
        Person p = new Person();
        Student s = new Student();
        Teacher t = new Teacher();

        p.InputInfo();
        p.OutInfo();

        s.InputInfo();
        s.OutInfo();
        s.KiemTra();

        t.InputInfo();
        t.OutInfo();
    }
}
