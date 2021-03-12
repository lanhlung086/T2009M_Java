package lap.s8_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public ArrayList<Student> studentList;
    public int id;
    public String name;
    public int age;
    public String address;
    public double gpa;

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        studentList = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void studentInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap id: ");
        setId(s.nextInt());
        System.out.println("Nhap ten sinh vien: ");
        setName(s.next());
        System.out.println("Nhap tuoi: ");
        setAge(s.nextInt());
        System.out.println("Nhap dia chi: ");
        setAddress(s.next());
        System.out.println("Nhap diem trung binh: ");
        setGpa(s.nextDouble());
    }
}