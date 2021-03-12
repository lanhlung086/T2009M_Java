package lap.s8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> std = new ArrayList<>();
        Student s = new Student();
        boolean run = true;

        do {
            System.out.println("Chon chuc nang");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            int c = sc.nextInt();
            if (c == 0){
                run = false;
            } else if (c == 1){
                s.studentInfo();
                std.add(s);
            } else if (c == 2){
                System.out.println("Nhap Id sinh vien muon sua thong tin: ");
                int id = sc.nextInt();
                for (Student i: std){
                    if (i.getId() == id){
                        s.studentInfo();
                        break;
                    }
                }
            }else if (c == 3){
                System.out.println("Nhap Id sinh vien muon xoa thong tin: ");
                int id = sc.nextInt();
                for (Student i: std){
                    if (i.getId() == id){
                        std.remove(i);
                        break;
                    }
                }
            } else if (c == 4){
                std.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return 0;
                    }
                });
            } else if (c == 5){
                std.sort(new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                });
            } else if (c == 6){
                for (Student i: std){
                    System.out.println(i.getName()+"-"+i.getGpa());
                }
            }
        }while (run);
    }
}
