package test.topics.classes;

public class Car {
    public String model;
    public int year;
    public int currentGear = 1;

    public void gearUp(){
        currentGear++;
        System.out.println("gear changed");
    }

    public void gearDown(){
        currentGear--;
        System.out.println("gear changed");
    }

    @Override
    public String toString() {
        return "classes.Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
