package Remake.Lap.s5;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String birthday;
    public String address;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sinh vien: ");
        setName(sc.nextLine());
        System.out.println("nhap gioi tinh: ");
        setGender(sc.nextLine());
        System.out.println("nhap ngay sinh: ");
        setBirthday(sc.nextLine());
        System.out.println("nhap dia chi: ");
        setAddress(sc.nextLine());
    }

    public void OutInfo(){
        System.out.println("Ten:" +getName());
        System.out.println("Gioi tinh:" +getGender());
        System.out.println("Ngay sinh:" +getBirthday());
        System.out.println("Dia chi:" +getAddress());
    }
}
