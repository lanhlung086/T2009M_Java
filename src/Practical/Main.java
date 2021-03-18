package Practical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Motor m = new Motor();
        Car c = new Car();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a vehicle name of Motor: ");
        m.setNameMotor(sc.nextLine());
        System.out.println("Vehicle: "+m.getNameMotor()+"-"+"Maximum velocity: "+m.moveMax()+"km/h");

        System.out.println("Input a vehicle name of Car: ");
        c.setNameCar(sc.nextLine());
        System.out.println("Vehicle: "+c.getNameCar()+"-"+"Maximum velocity: "+c.moveMax()+"km/h");
    }
}
