package Practical;

public class Car implements Vehicle{
    public String nameCar;

    public Car() {
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    @Override
    public float moveMax() {
        return 250;
    }

    @Override
    public String getName() {
        return this.nameCar;
    }
}
