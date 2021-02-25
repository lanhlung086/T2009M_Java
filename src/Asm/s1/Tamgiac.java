package Asm.s1;

import java.util.Scanner;

public class Tamgiac {
    double a;
    double b;
    double c;

    public  static boolean checkTriangle(double a, double b, double c){
        if (a>0 && b>0 && c>0){
            if(a+b>c && b+c>a && a+c>b){
                if(a-b<c && a-c<b && b-c<a) return true;
            }return false;
        }return false;
    }
    void tamgiac(double a, double b, double c){
        if (checkTriangle(a,b,c)){
            double p = a + b + c;
            double s = Math.sqrt((p/2)*(p/2-a)*(p/2-b)*(p/2-c));
        }
    }

    void main(){
        double a,b,c;
        Tamgiac tamgiac = new Tamgiac();

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a:");
        tamgiac.a = sc.nextDouble();
        System.out.println("nhap canh b:");
        tamgiac.b = sc.nextDouble();
        System.out.println("nhap canh c:");
        tamgiac.c = sc.nextDouble();

        if (checkTriangle(tamgiac.a, tamgiac.b, tamgiac.c)){
            double p = tamgiac.a + tamgiac.b + tamgiac.c;
            double s = Math.sqrt((p/2)*(p/2- tamgiac.a)*(p/2- tamgiac.b)*(p/2- tamgiac.c));
            System.out.println("chu vi tam giac:" +p);
            System.out.println("dien tich tam giac:" +s);
        }else System.out.println("khong la ba canh tam giac");
    }
}
