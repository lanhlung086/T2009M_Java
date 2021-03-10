package Remake.Lap.s5;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Student{
    public double salary;
    public int subject;
    public ArrayList<String> classList;
    public ArrayList<String> subjectList;

    public Teacher() {
        classList = new ArrayList<String>();
        subjectList = new ArrayList<String>();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public ArrayList<String> getClassList() {
        return classList;
    }

    public ArrayList<String> getSubjectList() {
        return subjectList;
    }

    @Override
    public void InputInfo() {
        super.InputInfo();
        Scanner tch = new Scanner(System.in);
        System.out.println("nhap muc luong giao vien: ");
        setSalary(tch.nextDouble());
        System.out.println("nhap so mon giang day: ");
        setSubject(tch.nextInt());
        System.out.println("danh sach mon giang day: ");
        for (int i=0;i<=getSubject();i++){
            subjectList.add(tch.nextLine());
        }
        System.out.println("nhap so lop giang day: ");
        int sl = tch.nextInt();
        System.out.println("nhap danh sach lop giang day: ");
        for (int i=0;i<sl;i++){
            classList.add(tch.nextLine());
        }
    }

    @Override
    public void OutInfo() {
        super.OutInfo();
        System.out.println("Muc luong: "+getSalary());
        System.out.println("So mon hoc giang day: "+getSubject());
        System.out.println("Danh sach mon hoc giang day");
        for (String s: subjectList){
            System.out.println(s);
        }
        System.out.println("Danh sach lop hoc giang day");
        for (String s: classList){
            System.out.println(s);
        }
    }
}
