package Practical;

import java.util.Scanner;

public class Motor implements Vehicle{
    public String nameMotor;

    public Motor() {
    }

    public String getNameMotor() {
        return nameMotor;
    }

    public void setNameMotor(String nameMotor) {
        this.nameMotor = nameMotor;
    }


    @Override
    public float moveMax() {
        return 150;
    }

    @Override
    public String getName() {
        return this.nameMotor;
    }
}
